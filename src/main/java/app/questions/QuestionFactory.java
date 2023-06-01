package app.questions;

import data.DataService;

import java.util.Random;

/**
 * Creates sets of questions to ask in a quiz
 */
public class QuestionFactory {
    private Random rand = new Random();
    private DataService dataService;
    public QuestionFactory(DataService dataService, Random random) {
        this.dataService = dataService;
    }


    /**
     * @param n The number of questions to create
     * @return An array of n questions
     */

    public Question[] makeQuestions(int n) {
        Question[] questions = new Question[n];

        for (int i = 0; i < n; i++) {
            int choice = rand.nextInt(0,5);
            if (choice == 0) {
                questions[i] = new AdditionQuestion(rand);
            } else if (choice == 1) {
                questions[i] = new SubtractionQuestion(rand);
            } else if (choice == 2) {
                questions[i] = new MultiplicationQuestion(rand);
            } else if (choice == 3) {
                questions[i] = new DivisionQuestion(rand);
            }
            else {
                MultipleChoiceQuestion[] multipleChoiceQuestions = dataService.getMultipleChoiceMathQuestions();
                questions[i] = (Question) multipleChoiceQuestions[rand.nextInt(multipleChoiceQuestions.length)];
            }

        }
        return questions;
    }
}
