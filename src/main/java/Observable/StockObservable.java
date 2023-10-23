package Observable;

import Observer.StockObserver;

public interface StockObservable {
    public void add(StockObserver ob);
    public void remove(StockObserver ob);
    public void notifyObservers();
    public void setStock(int stock);
    public int getStock();
}
