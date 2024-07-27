package weather;

public class CurrentConditionsDisplay implements WeatherObserver {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Current conditions: " + temperature + "C degrees, " + humidity + "% humidity.");
    }
}
