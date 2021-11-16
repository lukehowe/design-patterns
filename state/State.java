package state;

/**
 * @author Luke Howe
 */

/**
 * This is the interface for the State class.
 */
public interface State {
    
    /**
     * These are the methods that must be in state objects.
     */
    public int getNum();
    public String getOperation();
    public void levelUp();
    public void levelDown();

}
