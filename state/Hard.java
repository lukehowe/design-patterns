package state;

// Import packages
import java.util.Random;
/**
 * @author Luke Howe
 */
public class Hard implements State {
    
    // Create instance variables
    private ArithemeticGame game;

    // Create constructor
    public Hard(ArithemeticGame game) {
        game = this.game;
    }

    public int getNum() {
        Random random = new Random();
        int number = random.nextInt(100);
        number++;
        return number;
    }

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

    public void levelUp() {
        System.out.println("You are doing so well!!!!");
    }

    public void levelDown() {
        game.setState(game.getMediumState());
        System.out.println("You are struggling, let's go to medium mode.");
    }
}
