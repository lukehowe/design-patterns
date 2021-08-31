/**
 * @author Luke Howe
 */

 // Import packages
package observer;

public class Book {

    // Create instance variables
    private String title;
    private String authorFirstName;
    private String authorLastName;

    /**
     * Book object constructor.
     * @param title This value holds the title of the book.
     * @param authorFirstName This value holds the first name of the author who wrote the book.
     * @param authorLastName This value holds the last name of the author who wrote the book.
     */
    public Book(String title, String authorFirstName, String authorLastName) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    /**
     * This method returns the title of the book.
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method returns the first name of the author that wrote the book.
     * @return The first name of the author that wrote the book.
     */
    public String getAuthorFirstName() {
        return authorFirstName;
    }

    /**
     * This method returns the last name of the author that wrote the book.
     * @return The last name of the author that wrote the book.
     */
    public String getAuthorLastName() {
        return authorLastName;
    }

    /**
     * This method provides the information of a book in an easy to read human form.
     */
    public String toString() {
        return " - "+getTitle()+" by: "+getAuthorFirstName()+" "+getAuthorLastName(); // THIS MAY NOT NEED GETTERS
    }




    
    
}
