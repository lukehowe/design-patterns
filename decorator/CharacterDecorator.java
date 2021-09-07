/**
 * @author Luke Howe
 */

 // Import packages
package decorator;

public abstract class CharacterDecorator extends Character {
    
    // Create instance variables
    protected Character character;

    // Create constructor
    public CharacterDecorator(Character character) {
        this.sections = character.sections;
    }

    // Customize method abstract
    public abstract void customize();
}
