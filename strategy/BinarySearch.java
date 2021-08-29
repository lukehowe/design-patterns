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

        int left = 0, right = data.size() - 1;
        while (left <= right)
        {
            Collections.sort(data);
            
            
            int mid = left + (right - left) / 2;

            if(data.get(mid).contains(item))
                return true;
                
            //if(data.get(mid).compareTo(item) > item.charAt(0))
            if(data.get(mid).compareTo(item) < 0)
                //left = mid - 1;
                left = mid + 1;
                

            else
                right = mid -1;
                //left = mid + 1;
        
        
            
        }
        return false;
        

        









        /*int mid = data.size()/2;
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
        */
    }

}
