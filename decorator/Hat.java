/**
 * @author Luke Howe
 */

 // Import packages
package decorator;

public class Hat extends CharacterDecorator {
    
    // Create constructor
    public Hat(Character character) {
        super(character);
    }

    // Customize method
    public void customize() {
        sections.remove(1);
        sections.add(1, " __|____|__");
    }
}
