package singleton;

/**
 * @author Luke Howe
 */

public class Question {
    
    // Create instance variables
    private String question;
    private String[] answers;
    private int correctAnswer;

    // Create constructor
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        this.question = question;
        ans1 = answers[0];
        ans2 = answers[1];
        ans3 = answers[2];
        ans4 = answers[3];
        this.correctAnswer = correctAnswer;
    }

    public String toString() {
        return "Question here\n1. answer 1\n2. answer 2\n3. answer 3\n4. answer 4";
    }
    
    public boolean isCorrect(int userAnswer) {
        if(userAnswer == correctAnswer-1) {
            return true;
        }
        return false;
    }

    public String getCorrectAnswer() {
        
    }

}
