/**
 * @author Luke Howe
 */

// Import packages
package decorator;
import java.util.ArrayList;

/**
 * This is the abstract class that PotatoeHead will follow.
 */
public abstract class Character {

    /**
     * The array list of Strings named sections will hold each line of text that draws the character.
     */
    protected ArrayList<String> sections;
    
    /**
    * This is the constructor for the character. We create an instance of sections here.
    */
    public Character() {
        sections = new ArrayList<String>();
    }

    /**
     * This is the draw method. It loops through every line in arraylist sections and prints each line.
     */
    public void draw() {
        for(String temp : sections) {
            System.out.println(temp);
        }
    }
}
