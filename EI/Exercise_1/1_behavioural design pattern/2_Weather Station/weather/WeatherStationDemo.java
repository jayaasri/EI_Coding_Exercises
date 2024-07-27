package weather;

public class WeatherStationDemo {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        
        WeatherObserver currentDisplay = new CurrentConditionsDisplay();
        WeatherObserver statisticsDisplay = new StatisticsDisplay();

        station.addObserver(currentDisplay);
        station.addObserver(statisticsDisplay);

        station.setMeasurements(25.0f, 65.0f, 1013.0f);
        station.setMeasurements(27.0f, 70.0f, 1012.0f);
    }
}
