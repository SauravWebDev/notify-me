package Observable;

import Observer.TemperatureObserver;

import java.util.ArrayList;
import java.util.List;

public class TemperatureObservableImpl implements TemperatureObservable {

    private int temp;

    private List<TemperatureObserver> observers = new ArrayList<>();
    @Override
    public void add(TemperatureObserver ob) {
        observers.add(ob);
    }

    @Override
    public void remove(TemperatureObserver ob) {
        if(observers.contains(ob))
            observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(TemperatureObserver::onchange);
    }

    @Override
    public void setTemp(int temp) {
        if(this.temp != temp) {
            this.temp = temp;
            notifyObservers();
        }
    }

    @Override
    public int getTemp() {
        return this.temp;
    }
}
