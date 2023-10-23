package Observable;

import Observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class StockObservableImpl implements StockObservable{

    private int stock;

    private List<StockObserver> observers = new ArrayList<>();
    @Override
    public void add(StockObserver ob) {
        observers.add(ob);
    }

    @Override
    public void remove(StockObserver ob) {
        if(observers.contains(ob))
            observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(StockObserver::onchange);
    }

    @Override
    public void setStock(int stock) {
        if(this.stock != stock) {
            this.stock = stock;
            notifyObservers();
        }
    }

    @Override
    public int getStock() {
        return this.stock;
    }
}
