/**
 * @author Luke Howe
 */

 // Import packages
package observer;

public interface Observer {
    
    /**
     * Any class that implements observer must have these methods.
     * @param book This value holds the book that is being given to the observer when they update their lists/queues.
     */
    public void update(Book book);
    public void display();

}
