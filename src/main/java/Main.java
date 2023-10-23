import Observable.TemperatureObservable;
import Observable.TemperatureObservableImpl;
import Observer.TemperatureObserver;
import Observer.TemperatureObserverImpl;

public class Main {
    public static void main(String[] args) {
        TemperatureObservable temperatureObservable = new TemperatureObservableImpl();
        TemperatureObserver ob1 = new TemperatureObserverImpl(temperatureObservable);
        temperatureObservable.add(ob1);
        temperatureObservable.setTemp(20);
        TemperatureObserver ob2 = new TemperatureObserverImpl(temperatureObservable);
        temperatureObservable.add(ob2);
        temperatureObservable.setTemp(1);
        TemperatureObserver ob3 = new TemperatureObserverImpl(temperatureObservable);
        temperatureObservable.add(ob3);
        temperatureObservable.setTemp(10);



    }
}
