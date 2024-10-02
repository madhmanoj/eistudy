import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(float price);
}

// Subject class
class StockPrice {
    private List<Observer> observers = new ArrayList<>();
    private float price;
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
    
    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }
}

// Concrete observer classes
class IndividualInvestor implements Observer {
    public void update(float price) {
        System.out.println("Individual Investor notified. New price: " + price);
    }
}

class Bank implements Observer {
    public void update(float price) {
        System.out.println("Bank notified. New price: " + price);
    }
}

// Client code
public class StockPriceMonitoring {
    public static void main(String[] args) {
        StockPrice stock = new StockPrice();
        
        Observer investor = new IndividualInvestor();
        Observer bank = new Bank();
        
        stock.addObserver(investor);
        stock.addObserver(bank);
        
        // Update stock prices
        stock.setPrice(120);  // Output: Individual Investor notified. New price: 120
                              //         Bank notified. New price: 120
        
        stock.setPrice(130);  // Output: Individual Investor notified. New price: 130
                              //         Bank notified. New price: 130
    }
}
