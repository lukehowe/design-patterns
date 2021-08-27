/**
 * @author Luke Howe
 */

 // Import packages
package strategy;
import java.util.ArrayList;

public interface SearchBehavior {
    
    /**
     *  contains method
     * @param data This value holds the data in the index of the arraylist
     * @param item This value holds the name of the person we are searching for
     * @return
     */
    public boolean contains(ArrayList<String> data, String item);

}
