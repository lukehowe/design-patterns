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
        if(data == null)
            return false;
        for (int i = 0; i < data.size(); i++)
        {
            if(data.get(i).toLowerCase().contains(item.toLowerCase()))
            {
                return true;
            }
        }
        return false;
    }

}
