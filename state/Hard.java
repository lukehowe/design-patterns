package state;

// Import packages
import java.util.Random;
/**
 * @author Luke Howe
 */

/**
 * This is the Hard state class. It handles the logic behind the game when it is in hard mode.
 */
public class Hard implements State {
    
    // Create instance variables
    private ArithemeticGame game;

    // Create constructor

    /**
     * This is the constructor for the hard state.
     * @param game This value holds the game that is being played.
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * This is the get number class. It generates the numbers used for the problems when in hard mode.
     */
    public int getNum() {
        Random random = new Random();
        int number = random.nextInt(100);
        number++;
        return number;
    }

    /**
     * This is the getOperation method. It genereates the operations to be used while in hard mode.
     */
    public String getOperation() {
        Random random = new Random();
        int operation = random.nextInt(4);
        operation++;
        if(operation == 1) {
            return "+";
        }
        else if(operation == 2) {
            return "-";
        }
        else if(operation == 3) {
            return "*";
        }
        else {
            return "/";
        }
    }

    /**
     * This is the levelUp method. It prints a message and takes the game to a new state.
     */
    public void levelUp() {
        System.out.println("You are doing so well!!!!");
    }

    /**
     * This is the levelDown method. It prints a message and takes the game to a new state.
     */
    public void levelDown() {
        System.out.println("You are struggling, let's go to medium mode.");
        game.setState(game.getMediumState());
    }
}
