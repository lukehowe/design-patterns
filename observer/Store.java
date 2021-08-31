/**
 * @author Luke Howe
 */

 // Import packages
package observer;
import java.util.Queue;

public class Store implements Observer {

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
        //bestSellers = new Queue<Book>(); 
    }

    public void update(Book book) {

    }

    public void display() {

    }
}
