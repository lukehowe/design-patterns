/**
 * @author Luke Howe
 */

 // Import packages
package decorator;

/**
 * This is the class that adds a mouth to the character if called.
 */
public class Mouth extends CharacterDecorator {
    
    // Create constructor

    /**
     * This is the constructor for the mouth. It brings the character from its parent, Character Decorator, then calls customize.
     * @param character This value holds the character that the mouth is being added to.
     */
    public Mouth(Character character) {
        super(character);
        customize();
    }

    // Customize method

    /**
     * The customize method removes the line of text where the mouth is added to the character, and adds the line of text that displays the mouth.
     */
    public void customize() {
        sections.remove(5);
        sections.add(5, "  \\ ---- /");
    }
}
