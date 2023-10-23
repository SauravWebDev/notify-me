package Observable;

import Observer.TemperatureObserver;

public interface TemperatureObservable {
    public void add(TemperatureObserver ob);
    public void remove(TemperatureObserver ob);
    public void notifyObservers();
    public void setTemp(int temp);
    public int getTemp();
}
