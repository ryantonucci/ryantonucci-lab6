package app.questions;

import app.questions.Question;

import java.util.Random;

/**
 * Creates sets of questions to ask in a quiz
 */
public class QuestionFactory {
    private Random rand;
    /**
     * @param n The number of questions to create
     * @return An array of n questions
     */

    public Question[] makeQuestions(int n) {
        Question[] questions = new Question[n];

        for ( int i = 0; i < n ; i++ ) {
            int choice = rand.nextInt(0, 5);

            if (choice == 0) {
                questions[i] = new AdditionQuestion(rand);
            } else if (choice == 1) {
                questions[i] = new SubtractionQuestion(rand);
            } else if (choice == 2) {
                questions[i] = new MultiplicationQuestion(rand);
            } else if (choice == 3) {
                questions[i] = new DivisionQuestion(rand);
            } else {
                questions[i] = new MultipleChoiceQuestion(rand);
            }
        }
        return questions;
    }
}
