package state;

//Import packages
import java.util.Random;
/**
 * @author Luke Howe
 */

 /**
  * This is the Easy State class. It handles the logic behind the game when it is in easy mode.
  */
public class Easy implements State {
    
    // Create instances
    private ArithemeticGame game;

    // Create constructor
    /**
     * This is the constructor method for Easy state.
     * @param game This value holds the game that is being played.
     */
    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * This is the getNum method. It generates numbers for the game when it is in easy mode.
     */
    public int getNum() {
        Random random = new Random();
        int number = random.nextInt(10);
        number++;
        return number;
    }

    /**
     * This is the getOperation method. It generates what operation is going to be used while in easy mode.
     */
    public String getOperation() {
        Random random = new Random();
        int operation = random.nextInt(2);
        operation++;
        if(operation == 1) {
            return "+";
        }
        else { return "-";
        }
    }

    /**
     * This is the levelUp method. It prints a message and takes the game to a new state.
     */
    public void levelUp() {
        //game.setState(game.getMediumState());
        System.out.println("You've been advanced to medium mode.");
        game.setState(game.getMediumState());
    }

    /**
     * This is the levelDown method. It prints a message and takes the game to a new state.
     */
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }
}
