/**
 * @author Luke Howe
 */

 //Import packages
package strategy;
import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch implements SearchBehavior {
    
    /**
     * Binary contains method
     */
    public boolean contains(ArrayList<String> data, String item)
    {
        Collections.sort(data);
        int mid = data.size()/2;
        if(data.get(mid) == item)
        {
            return true;
        }
        else if(data.get(mid).compareTo(item) > item.toCharArray()[0])
        {
            return contains(data, item);
        }
        else
        {
            return contains(data,item);
        }
    }

}
