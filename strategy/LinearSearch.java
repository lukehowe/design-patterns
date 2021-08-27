/**
 * @author Luke Howe
 */

 // Import packages
package strategy;
import java.util.ArrayList;

public class LinearSearch implements SearchBehavior {
    
    /**
     * Linear contains method
     */
    public boolean contains(ArrayList<String> data, String item)
    {
        for (int i = 0; i < data.size(); i++)
        {
            String person = data.get(i).toLowerCase();
            if(person.contains(item.toLowerCase()))
            {
                return true;
            }
        }
        return false;
    }

}
