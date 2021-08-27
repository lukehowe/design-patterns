/**
 * @author Luke Howe
 */

// Import packages
package strategy;
import java.util.ArrayList;

public class GuestList {
    
    // Create instance variables
    private String title;
    private ArrayList<String> people;
    private SearchBehavior searchBehavior;

    // Create constructor
    /**
     * GuestList constructor
     * @param aT This value holds the title of the GuestList
     */
    public GuestList(String aT)
    {
        this.title = aT;
    }

    /**
     * add method
     * @param person This value holds the name of the person being searched for
     * @return
     */
    public boolean add(String person)
    {
        // Calls strategies contains method
        // if already contained, return FALSE
        // otherwise, person is added to this list and TRUE is returned
    }

    /**
     * remove method
     * @param person
     * @return
     */
    public boolean remove(String person)
    {
        // Calls strategies contains method
        // if already contained, person is removed from this list and TRUE is returned
        // otherwise, return FALSE
    }

    /**
     * Accessor for the title of the List
     * @return
     */
    public String getTitle()
    {
        return this.title;
    }

    /**
     * set search behavior method
     * @param searchBehavior 
     */
    public void setSearchBehavior(SearchBehavior searchBehavior)
    {
        // initally set to linear search
    }

    public ArrayList<String> getList()
    {
        return this.people;
    }

    public void init()
    {
        lSearch = new LinearSearch();
    }
}
