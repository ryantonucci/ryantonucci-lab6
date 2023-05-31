package app.questions;

import java.util.Random;

public class AdditionQuestion extends ArithmeticQuestion{

    public AdditionQuestion(Random rand) {
        operand1 = rand.nextInt(0, 12);
        operand2 = rand.nextInt(0, 12);
        operatorSymbol = '+';
    }
    public double calculateAnswer(){
        return operand1 + operand2;
    }
}
