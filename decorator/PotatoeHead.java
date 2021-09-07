/**
 * @author Luke Howe
 */

 // Import packages
package decorator;

/**
 * This is the class for the PotatoeHead object that is a child of Character.
 */
public class PotatoeHead extends Character {
    
    // Create constructor

    /**
     * This is the constructor for the PotatoeHead. It adds a blank potatoehead to the Character's sections arraylist.
     */

    public PotatoeHead() {
        super.sections.add("    ____");
        super.sections.add("   /    \\");
        super.sections.add("  /      \\");
        super.sections.add(" |        |");
        super.sections.add(" |        |");
        super.sections.add("  \\      /");
        super.sections.add("   \\____/");
    }
}
