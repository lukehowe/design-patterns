/**
 * @author Luke Howe
 */

 // Import packages
package observer;
//import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;

public class Store implements Observer {

    Subject BestSellers;

    // Create instance variables
    private Subject subject;
    private String title;
    private Deque<Book> bestSellers;
    
    /**
     * Store object constructor.
     * @param subject This value holds what is being followed.
     * @param title This value holds the title of the store.
     */
    public Store(Subject subject) {
        subject.registerObserver(this);
        this.subject = subject;
        bestSellers = new LinkedList<Book>();
    }

    public void update(Book book) {
        if(bestSellers.size() >= 5) {
            bestSellers.removeFirst();
        }
        bestSellers.add(book);
    }

    public void display() {
        System.out.println("Top 5 Best Sellers:");
        for(int i = 0; i < 5; i++) {
            System.out.println(bestSellers.peek());
            bestSellers.removeFirst();
        }
    }
}
