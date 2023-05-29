package app.questions;

import java.util.Random;

/**
 * Represents a multiplication question
 */
public class Question {

    // Used to indicate whether a user's answer was correct, incorrect, or invalid
    public static final String ANSWER_CORRECT = "correct";
    public static final String ANSWER_INCORRECT = "incorrect";
    public static final String ANSWER_INVALID = "invalid";

    // The two operands for the multiplication question
    private int operand1;
    private int operand2;

    /**
     * Creates a question with a random pair of operands between 0 and 12
     * @param rand A random number generator
     */
    public Question(Random rand) {
        this.operand1 = rand.nextInt(0, 12);
        this.operand2 = rand.nextInt(0, 12);
    }

    /**
     * @return A prompt to display when 'asking' the question
     */
    public String getPrompt() {
        return "What is %d x %d? ".formatted(operand1, operand2);
    }

    /**
     * @return A message indicating the expected value type for answers
     */
    public String getValidityMessage() {
        return "Your answer must be a number";
    }

    /**
     * Parse a given answer and determine whether it is correct, incorrect, or invalid
     * @param answer The answer to parse
     * @return One of ANSWER_CORRECT, ANSWER_INCORRECT, or ANSWER_INVALID
     */
    public String parseAnswer(String answer) {
        try {
            double answerAsDouble = Double.parseDouble(answer);

            if (answerAsDouble == (double)(operand1 * operand2)) {
                return ANSWER_CORRECT;
            }
            return ANSWER_INCORRECT;

        } catch (NumberFormatException e) {
            return ANSWER_INVALID;
        }
    }
}
