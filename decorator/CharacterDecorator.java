/**
 * @author Luke Howe
 */

 // Import packages
package decorator;

/**
 * This is the abstract class that Eyes, Mouth, Nose, and Hat will follow.
 */
public abstract class CharacterDecorator extends Character {
    
    // Create instance variables

    /**
     * character will hold the character that we are editing.
     */
    protected Character character;

    // Create constructor

    /**
     * This is the constructor for the character decorator. It takes in a character, and adds every line from the character's section list to its own sections list.
     * @param character This value holds the character that is being decorated.
     */
    public CharacterDecorator(Character character) {
        for(String temp : character.sections) {
            this.sections.add(temp);
        }
    }

    // Customize method abstract

    /**
     * This is the abstract method that the Eyes, Nose, Mouth, and Hat classes will need to implement.
     */
    public abstract void customize();
}
