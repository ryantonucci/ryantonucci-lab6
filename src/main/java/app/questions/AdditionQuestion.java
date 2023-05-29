package app.questions;

import java.util.Random;

public class AdditionQuestion implements Question{
    private int operand1;
    private int operand2;

    public AdditionQuestion(Random rand) {
        this.operand1 = rand.nextInt(0, 12);
        this.operand2 = rand.nextInt(0, 12);
    }
    @Override
    public String getPrompt() {
        return "What is %d + %d? ".formatted(operand1, operand2);
    }
    @Override
    public String getValidityMessage() {
        return "Your answer must be a number";
    }
    @Override
    public String parseAnswer(String answer) {
        try {
            double answerAsDouble = Double.parseDouble(answer);

            if (answerAsDouble == (double)(operand1 + operand2)) {
                return ANSWER_CORRECT;
            }
            return ANSWER_INCORRECT;

        } catch (NumberFormatException e) {
            return ANSWER_INVALID;
        }
    }
}
