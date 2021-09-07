/**
 * @author Luke Howe
 */

 // Import packages
package decorator;

public class PotatoeHead extends Character {
    
    // Create constructor
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
