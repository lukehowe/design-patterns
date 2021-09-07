/**
 * @author Luke Howe
 */

 // Import packages
package decorator;

/**
 * This is the class that adds hat to the character if called.
 */
public class Hat extends CharacterDecorator {
    
    // Create constructor

    /**
     * This is the constructor for the hat, which brings in the character from its parent, Character Decorator, and calls customize.
     * @param character This value holds the character that the hat is being added to.
     */
    public Hat(Character character) {
        super(character);
        customize();
    }

    // Customize method

    /**
     * The customize method removes the line of text where the hat is added to the character, and adds the line of text that displays the hat.
     */
    public void customize() {
        sections.remove(1);
        sections.add(1, " __|____|__");
    }
}
