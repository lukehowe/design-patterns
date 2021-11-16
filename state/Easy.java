package state;

//Import packages
import java.util.Random;
/**
 * @author Luke Howe
 */
public class Easy implements State {
    
    // Create instances
    private ArithemeticGame Arithmetic;

    // Create constructor
    public Easy(ArithemeticGame game) {
        game = this.Arithmetic;
    }

    public int getNum() {
        Random random = new Random();
        int number = random.nextInt(10);
        number++;
        return number;
    }

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

    public void levelUp() {
        // TODO
        System.out.println("You've been advanced to medium mode.");
    }

    public void levelDown() {
        //TODO
    }
}
