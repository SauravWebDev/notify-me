import Observable.StockObservable;
import Observable.StockObservableImpl;
import Observer.StockObserver;
import Observer.StockObserverImpl;

public class Main {
    public static void main(String[] args) {
        StockObservable stock = new StockObservableImpl();
        StockObserver ob1 = new StockObserverImpl(stock);
        stock.add(ob1);
        stock.setStock(20);
        StockObserver ob2 = new StockObserverImpl(stock);
        stock.add(ob2);
        stock.setStock(1);
        StockObserver ob3 = new StockObserverImpl(stock);
        stock.add(ob3);
        stock.setStock(10);



    }
}
