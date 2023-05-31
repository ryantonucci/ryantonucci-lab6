package app.questions;

import java.util.Random;

public class DivisionQuestion extends ArithmeticQuestion{

    public DivisionQuestion(Random rand) {
        operand1 = rand.nextInt(0, 12);
        operand2 = rand.nextInt(0, 12);
        operand1 = operand1 * operand2;
        operatorSymbol = '÷';
    }
    @Override
    public double calculateAnswer(){
        return (double) operand1 / operand2;
    }
//11
    //7*11

}
