import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private float pressure;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(pressure);
        }
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        notifyObservers();
    }

    public float getPressure() {
        return pressure;
    }
}
