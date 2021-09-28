package singleton;

// Import packages
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Luke Howe
 */

public class TriviaGame {

    // Create instance variables
    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    // Create constructor
    private TriviaGame() {
        questions = DataLoader.getTriviaQuestions();
        Random rand = new Random();
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the Trivia Game!");
        playRound();
    }

    public static TriviaGame getInstance() {
        if(triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    public void play() {
        boolean quitGame = false;
        while(!quitGame) {
            //playRound();
            System.out.print("(P)lay or (Q)uit?:");
            String response = reader.next();
            if(response.toUpperCase() == "P") {
                playRound();
            }
            else if(response.toUpperCase() == "Q") {
                System.out.println("You won "+score+" games!\nGoodbye");
                System.exit(0);
            }
            else {
                return;
            }
        }
    }

    private boolean playRound() {
        int r = rand.nextInt(11);
        questions.get(r).toString();
        System.out.println("Enter Answer: ");
        String response = reader.next();
    }
}
