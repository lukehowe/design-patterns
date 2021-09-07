/**
 * @author Luke Howe
 */

 // Import packages
package decorator;

public class Eyes extends CharacterDecorator {
    
    // Create constructor
    public Eyes(Character character) {
        super(character);
    }

    // Customize method
    public void customize() {
        sections.remove(3);
        sections.add(3, " | o    o |");
    }
}
