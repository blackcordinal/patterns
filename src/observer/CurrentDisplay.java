package observer;

/**
 * реализация простого дисплея
 */
public class CurrentDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidy;
    private Subject weatherdata;

    public CurrentDisplay(Subject weatherdata){
        this.weatherdata=weatherdata;
        weatherdata.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("temp="+temperature+"humidy"+humidy);

    }

    @Override
    public void update(float temp, float humudy) {
        this.temperature=temp;
        this.humidy=humudy;
        display();

    }
}
