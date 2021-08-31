/**
 * @author Luke Howe
 */

 // Import packages
package observer;

public interface Subject {
    
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(Book book);

}
