package observer;

/**
 *погодная станция для тестов
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentDisplay currentDisplay= new CurrentDisplay(weatherData);
        weatherData.setMensurements(22,55);
        weatherData.setMensurements(44, 666);
        weatherData.setMensurements(22,444);

    }
}
