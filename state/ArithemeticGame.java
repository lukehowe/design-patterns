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
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
        this.score = 0;
        Scanner keyboard;

    }

    public void pressQuestionButton() {
        int firstNumber = state.getNum();
        int secNumber = state.getNum();
        String opCode = state.getOperation();
        System.out.println(firstNumber+" "+opCode+" "+secNumber+" = ?");
        Scanner keyboard = new Scanner(System.in);
        int userInput = keyboard.nextInt();
        int answer = calculate(firstNumber, opCode, secNumber);
        if(userInput == answer) {
            System.out.println("Correct");
            score++;
        }
        if(userInput != answer) {
            System.out.println("Incorrect");
            score--;
        }
        if(score >= 3) {
            this.state.levelUp();
            score = 0;
        }
        if(score <= -3) {
            state.levelDown();
            score = 0;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getEasyState() {
        return easyState;
    }

    public State getMediumState() {
        return mediumState;
    }

    public State getHardState() {
        return hardState;
    }

    public int calculate(int firstNum, String operation, int secNum) {
        if(operation == "+") {
            return firstNum + secNum;
        }
        else if(operation == "-") {
            return firstNum - secNum;
        }
        else if(operation == "*") {
            return firstNum * secNum;
        }
        return firstNum / secNum;
    }
}
