package Observable;

import Observer.TemperatureObserver;

public interface TemperatureObservable {
    void add(TemperatureObserver ob);
    void remove(TemperatureObserver ob);
    void notifyObservers();
    void setTemp(int temp);
    int getTemp();
}
