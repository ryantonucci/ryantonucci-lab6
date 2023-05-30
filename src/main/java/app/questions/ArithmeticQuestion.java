package app.questions;

public abstract class ArithmeticQuestion implements Question{
    protected int operand1;
    protected int operand2;
    protected char operatorSymbol;
    public String getPrompt() {
        return "What is %d %d %d? ".formatted(operand1, operatorSymbol, operand2);
    }

    public String getValidityMessage() {
        return "Your answer must be a number";
    }
    protected abstract double calculateAnswer();
    public String parseAnswer(String answer) {
        try {
            double answerAsDouble = Double.parseDouble(answer);

            if (answerAsDouble == (double)(calculateAnswer())) {
                return ANSWER_CORRECT;
            }
            return ANSWER_INCORRECT;

        } catch (NumberFormatException e) {
            return ANSWER_INVALID;
        }
    }
}
