package observer;

import java.util.ArrayList;
import java.util.Objects;

/**
 * реализация погоды
 */
public class WeatherData implements  Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humudy;

    public WeatherData()
    {
        observers= new ArrayList<>();
    }
    public void mensurementsChanges()
    {
        notyfiObserver();
    }
    public void setMensurements(float temp, float humidy){
        this.humudy=humidy;
        this.temperature=temp;
        mensurementsChanges();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);

    }

    @Override
    public void notyfiObserver() {
        for (Observer observer : observers) {
            observer.update(temperature,humudy);
        }

    }
}
