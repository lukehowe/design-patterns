/**
 * @author Luke Howe
 */

 // Import packages
package observer;
import java.util.ArrayList;

public class Customer {
    
    // Create instance variables
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;

    /**
     * Customer object constructor.
     * @param subject This value holds what is being followed. 
     * @param firstName This value holds the first name of the customer.
     * @param lastName This value holds the last name of the customer.
     */
    public Customer(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        wishList = new ArrayList<Book>();
    }

    public void update(Book book) {

    }

    public void display() {
        
    }

}
