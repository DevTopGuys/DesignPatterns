package Displays;

import Interfaces.DisplayInterface;
import Interfaces.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayInterface {
    private float temp;
    private float hum;
    private float press;

    @Override
    public void update(float temp, float hum, float press) {
        this.temp = temp;
        this.hum = hum;
        this.press = press;

        display();
    }

    @Override
    public void display() {
        //...
    }
}




