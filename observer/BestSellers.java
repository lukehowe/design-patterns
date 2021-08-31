/**
 * @author Luke Howe
 */

  // Import packages
package observer;
import java.util.ArrayList;

public class BestSellers {
    
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

    }

    public void removeObserver(Observer observer) {

    }

    public void notifyObservers(Book book) {

    }

    public void addBook (Book book) {
        
    }
}
