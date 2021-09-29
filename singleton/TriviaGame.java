package singleton;

/**
 * @author Luke Howe
 */

// Import packages
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Luke Howe
 */

 /**
  * Class for TriviaGame.java
  */
public class TriviaGame {

    // Create instance variables
    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    // Create constructor
    /**
     * This is the private constructor for TriviaGame.
     */
    private TriviaGame() {
        questions = DataLoader.getTriviaQuestions();
        rand = new Random();
        reader = new Scanner(System.in);
        System.out.println("Welcome to the Trivia Game!");
        playRound();
    }

    /**
     * This is the getInstance method for the Singleton class TriviaGame.
     * @return This method returns the instance of TriviaGame that originally existed.
     */
    public static TriviaGame getInstance() {
        if(triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    /**
     * This is the play method for TriviaGame(). It runs the game and is called by the driver.
     */
    public void play() {
        boolean quitGame = false;
        while(!quitGame) {
            System.out.print("(P)lay or (Q)uit?: ");
            String response = reader.next();
            if(response.toUpperCase().contains("P")) {
                System.out.println("");
                playRound();
            }
            else if(response.toUpperCase().contains("Q")) {
                System.out.println("");
                System.out.println("You won "+score+" games!\nGoodbye");
                quitGame = true;
                System.exit(0);
            }
            else {
                System.out.println("Error: Input not valid");
                play();
            }
        }
    }

    /**
     * This is the playRound method. It pulls a question from the bank and takes the user's answer and returns true/false depending on if it is correct.
     * @return This method returns true/false depending on if it is a correct.
     */
    private boolean playRound() {
        int r = rand.nextInt(10);
        System.out.println(questions.get(r).toString());
        System.out.print("Enter Answer: ");

        
        int answer = reader.nextInt();
        if(answer > 4 || answer < 0) {
            System.out.println("Error. Invalid number.");
            System.exit(0);
        }
        if(questions.get(r).isCorrect(answer)) {
            System.out.println("YAY! You got it right!");
            score += 1;
            return true;
        }
        else {
            System.out.println("You got it wrong!\nThe correct answer is "+questions.get(r).getCorrectAnswer());
            return false;
        }            
    }
}
