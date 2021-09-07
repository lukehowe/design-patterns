/**
 * @author Luke Howe
 */

 // Import packages
package decorator;

/**
 * This is the class that will add a nose to the character if called.
 */
public class Nose extends CharacterDecorator {
    
    // Create constructor

    /**
     * This is the nose constructor. It takes in the character from its parent, Character Decorator, and calls customize.
     * @param character This value holds the character that the nose is being added to.
     */
    public Nose(Character character) {
        super(character);
        customize();
    }

    // Customize method

    /**
     * The customize method removes the line of text where the nose is added to the character, and adds the line of text that displays a nose.
     */
    public void customize() {
        sections.remove(4);
        sections.add(4, " |    >   |");
    }
}
