public class App {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        new ForecastDisplay(weatherData);

        weatherData.setPressure(30.4f);
        weatherData.setPressure(29.2f);
        weatherData.setPressure(29.2f);
    }
}
