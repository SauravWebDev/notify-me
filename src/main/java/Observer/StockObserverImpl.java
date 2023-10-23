package Observer;

import Observable.StockObservable;
import Observable.StockObservableImpl;

public class StockObserverImpl implements StockObserver{
    private StockObservable stockOb;

    public StockObserverImpl(StockObservable stock) {
        this.stockOb = stock;
    }
    @Override
    public void onchange() {
        System.out.println("new stock is "+ stockOb.getStock());
    }
}
