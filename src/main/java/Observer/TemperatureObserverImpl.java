package Observer;

import Observable.TemperatureObservable;

public class TemperatureObserverImpl implements TemperatureObserver {
    private TemperatureObservable stockOb;

    public TemperatureObserverImpl(TemperatureObservable stock) {
        this.stockOb = stock;
    }
    @Override
    public void onchange() {
        System.out.println("new Temp is "+ stockOb.getTemp());
    }
}
