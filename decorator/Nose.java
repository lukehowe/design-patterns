/**
 * @author Luke Howe
 */

 // Import packages
package decorator;

public class Nose extends CharacterDecorator {
    
    // Create constructor
    public Nose(Character character) {
        super(character);
        customize();
    }

    // Customize method
    public void customize() {
        sections.remove(4);
        sections.add(4, " |    >   |");
    }
}
