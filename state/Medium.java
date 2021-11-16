package state;

// Import packages
import java.util.Random;
/**
 * @author Luke Howe
 */

 /**
  * This is the Medium State class. It handles the logic behind the game when it is in medium mode.
  */
public class Medium implements State {
    
    // Create instance variables
    private ArithemeticGame game;

    // Create constructor
    /**
     * This is the constructor for the Medium state of the game.
     * @param game This value holds what game is being played.
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * This is the get number class. It generates the numbers used for the problems when in medium mode.
     */
    public int getNum() {
        Random random = new Random();
        int number = random.nextInt(50);
        number++;
        return number;
    }

    /**
     * This is the getOperation method. It genereates the operations to be used while in medium mode.
     */
    public String getOperation() {
        Random random = new Random();
        int operation = random.nextInt(3);
        operation++;
        if(operation == 1) {
            return "+";
        }
        else if(operation == 2) {
            return "-";
        }
        else {
            return "*";
        }
    }

    /**
     * This is the levelUp method. It prints a message and takes the game to a new state.
     */
    public void levelUp() {
        System.out.println("You've been advanced to the hardest mode.");
        game.setState(game.getHardState());
    }

    /**
     * This is the levelDown method. It prints a message and takes the game to a new state.
     */
    public void levelDown() {
        System.out.println("You are struggling, let's go to easy mode.");
        game.setState(game.getEasyState());
    }
}
