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

    /**
     * This is the Question constructor.. It creates questions.
     * @param question This value holds the actual question.
     * @param ans1 This method holds the first answer choice
     * @param ans2 This method holds the second answer choice.
     * @param ans3 This method holds the third answer choice.
     * @param ans4 This method holds the fourth answer choice.
     * @param correctAnswer This method holds the integer which represents the correct answer.
     */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        this.question = question;
        answers = new String[4];
        answers[0] = ans1;
        answers[1] = ans2;
        answers[2] = ans3;
        answers[3] = ans4;
        this.correctAnswer = correctAnswer;
    }

    /**
     * This is the toString method. It shows a question in a human readable form.
     */
    public String toString() {
        return question+"\n 1. "+answers[0]+"\n 2. "+answers[1]+"\n 3. "+answers[2]+"\n 4. "+answers[3]+"\n";
    }
    
    /**
     * This is the isCorrect method. It checks if a question is answered correctly.
     * @param userAnswer This value holds the user's inputted answer.
     * @return This method returns true if the answer is correct and false if the answer is wrong.
     */
    public boolean isCorrect(int userAnswer) {
        if(userAnswer-1 == correctAnswer) {
            return true;
        }
        return false;
    }

    /**
     * This is the getCorrectAnswer method. It retrieves the correct answer if the question was answered wrong.
     * @return This method returns the correct answer in String.
     */
    public String getCorrectAnswer() {
            return answers[correctAnswer];
    }

}
