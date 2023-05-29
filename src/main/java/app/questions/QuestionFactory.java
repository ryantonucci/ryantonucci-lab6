package app.questions;

import app.questions.Question;

import java.util.Random;

/**
 * Creates sets of questions to ask in a quiz
 */
public class QuestionFactory {

    /**
     * @param n The number of questions to create
     * @return An array of n questions
     */
    public Question[] makeQuestions(int n) {
        Question[] questions = new Question[n];

        for ( int i = 0; i < n ; i++ ) {
            questions[i] = new Question(new Random());
        }

        return questions;
    }
}
