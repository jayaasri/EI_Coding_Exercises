package weather;

public class StatisticsDisplay implements WeatherObserver {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Statistics: " + temperature + "C degrees, " + humidity + "% humidity, " + pressure + " hPa pressure.");
    }
}
