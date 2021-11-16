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
        game = this.game;
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
        game.setState(game.getHardState());
        System.out.println("You've been advanced to the hardest mode.");
    }

    public void levelDown() {
        game.setState(game.getEasyState());
        System.out.println("You are struggling, let's go to easy mode.");
    }
}
