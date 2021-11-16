package state;

// Import packages
import java.util.Scanner;
/**
 * @author Luke Howe
 */
public class ArithemeticGame {
    
    // Create instance variables
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    // Create constructor
    public ArithemeticGame() {
        //this.easyState = easyState;
        easyState = this.state;
        mediumState = this.state;
        hardState = this.state;
        Scanner keyboard = new Scanner(System.in);

    }

    public void pressQuestionButton() {
        //TODO
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getEasyState() {
        // TODO
        return state;
    }

    public State getMediumState() {
        // TODO
        return state;
    }

    public State getHardState() {
        // TODO
        return state;
    }
}
