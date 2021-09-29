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
        rand = new Random();
        reader = new Scanner(System.in);
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
