package state;

// Import packages
import java.util.Random;
/**
 * @author Luke Howe
 */
public class Medium implements State {
    
    // Create instance variables
    private ArithemeticGame game;

    // Create constructor
    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        Random random = new Random();
        int number = random.nextInt(50);
        number++;
        return number;
    }

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

    public void levelUp() {
        System.out.println("You've been advanced to the hardest mode.");
        game.setState(game.getHardState());
    }

    public void levelDown() {
        System.out.println("You are struggling, let's go to easy mode.");
        game.setState(game.getEasyState());
    }
}
