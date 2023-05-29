package app.questions;

public class ArithmeticQuestion implements Question{
    protected int operand1;
    protected int operand2;
    protected char operatorSymbol;
    public String getPrompt() {
        return "What is %d %d %d? ".formatted(operand1, operatorSymbol, operand2);
    }

    public String getValidityMessage() {
        return "Your answer must be a number";
    }
}
