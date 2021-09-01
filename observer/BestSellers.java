/**
 * @author Luke Howe
 */

  // Import packages
package observer;
import java.util.ArrayList;

public class BestSellers implements Subject {

    // Create instance variables
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    /**
     * BestSellers constructor
     */
    public BestSellers() {
        observers = new ArrayList<Observer>();
        bestSellers = new ArrayList<Book>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Book book) {
        for(Observer observer : observers) {
            observer.update(book);
        }
    }

    public void addBook (Book book) {
        bestSellers.add(book);
        notifyObservers(book);
    }
}
