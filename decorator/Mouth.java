/**
 * @author Luke Howe
 */

 // Import packages
package decorator;

public class Mouth extends CharacterDecorator {
    
    // Create constructor
    public Mouth(Character character) {
        super(character);
    }

    // Customize method
    public void customize() {
        sections.remove(5);
        sections.add(5, "  \\ ---- /");
    }
}
