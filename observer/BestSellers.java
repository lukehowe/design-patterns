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

    /**
     * This method registers the observer to the list of observers watching the subject.
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * This method removes the observer from the list of observers watching the subject.
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * This method notifies the observers that a book has been added. It calls the observer's update method to make the observer react to the notification.
     */
    public void notifyObservers(Book book) {
        for(Observer observer : observers) {
            observer.update(book);
        }
    }

    /**
     * This method adds the book to the BestSellers list. It adds the book literally, and then notifies the observers.
     * @param book This value holds the data about the book being added to the bestSeller list.
     */
    public void addBook (Book book) {
        bestSellers.add(book);
        notifyObservers(book);
    }
}
