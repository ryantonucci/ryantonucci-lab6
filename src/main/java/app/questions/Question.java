package app.questions;

import java.util.Random;

/**
 * Represents a multiplication question
 */
public interface Question{

    // Used to indicate whether a user's answer was correct, incorrect, or invalid
     String ANSWER_CORRECT = "correct";
     String ANSWER_INCORRECT = "incorrect";
     String ANSWER_INVALID = "invalid";

    // The two operands for the multiplication question


    /**
     * Creates a question with a random pair of operands between 0 and 12
     * @param rand A random number generator
     */


    /**
     * @return A prompt to display when 'asking' the question
     */
    String getPrompt();

    /**
     * @return A message indicating the expected value type for answers
     */
    String getValidityMessage();

    /**
     * Parse a given answer and determine whether it is correct, incorrect, or invalid
     * @param answer The answer to parse
     * @return One of ANSWER_CORRECT, ANSWER_INCORRECT, or ANSWER_INVALID
     */
    String parseAnswer(String answer);
}
