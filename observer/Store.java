/**
 * @author Luke Howe
 */

 // Import packages
package observer;
import java.util.Queue;

public class Store implements Observer {

    Subject BestSellers;

    // Create instance variables
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;
    
    /**
     * Store object constructor.
     * @param subject This value holds what is being followed.
     * @param title This value holds the title of the store.
     */
    public Store(Subject subject, String title) {
        this.subject = subject;
        this.title = title;
        //bestSellers.registerObserver(this);
        //bestSellers = new Queue<Book>(); 
        //Queue<Book> bestSellers = new LinkedList();
    }

    public void update(Book book) {
        
    }

    public void display() {

    }
}
