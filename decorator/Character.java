/**
 * @author Luke Howe
 */
package decorator;

// Import packages
import java.util.ArrayList;

public abstract class Character {

    // Create instance variables
    protected ArrayList<String> sections;
    
    // Create constructor
    public Character() {
        sections = new ArrayList<String>();
    }

    // Draw method
    public void draw() {
        for(String temp : sections) {
            System.out.println(temp);
        }
    }
}
