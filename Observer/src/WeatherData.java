import Interfaces.Observer;
import Interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temp;
    private float hum;
    private float press;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void measurementsChanged(){
        temp = getTemperature();
        hum = getHumidity();
        press = getPressure();

        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:observers) {
            o.update(temp, hum, press);
        }
    }


    private float getTemperature(){
        return 0;
    };
    private float getHumidity(){
        return 0;
    };
    private float getPressure(){
        return 0;
    };
}










