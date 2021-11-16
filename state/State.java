package state;

/**
 * @author Luke Howe
 */
public interface State {
    
    public int getNum();
    public String getOperation();
    public void levelUp();
    public void levelDown();

}
