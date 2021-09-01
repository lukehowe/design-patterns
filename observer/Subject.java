/**
 * @author Luke Howe
 */

 // Import packages
package observer;

public interface Subject {
    
    /**
     * Any class that implements Subject must use the following methods
     * @param observer This value holds the observer that is watching the subject.
     */
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(Book book);

}
