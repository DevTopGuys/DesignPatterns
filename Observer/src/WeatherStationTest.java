import Displays.CurrentConditionsDisplay;
import Displays.ForecastDisplay;
import Displays.StatisticDisplay;

public class WeatherStationTest {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();


        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticDisplay statisticDisplay = new StatisticDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();


        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(statisticDisplay);
        weatherData.registerObserver(forecastDisplay);


        weatherData.measurementsChanged();
    }
}



