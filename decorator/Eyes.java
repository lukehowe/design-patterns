/**
 * @author Luke Howe
 */

 // Import packages
package decorator;

/**
 * This is the class that will add eyes to the character if called.
 */
public class Eyes extends CharacterDecorator {
    
    // Create constructor

    /**
     * This is the constructor for the Eyes. It pulls the character from its parent, CharacterDecorator, and calls customize.
     * @param character This value holds the character that eyes are being added to.
     */
    public Eyes(Character character) {
        super(character);
        customize();
    }

    // Customize method

    /**
     * The customize method removes the line of text where eyes are added to the character, and adds the line of text that displays eyes.
     */
    public void customize() {
    sections.remove(3);
    sections.add(3, " | o    o |");
    }
}
