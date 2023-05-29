package app.questions;

import org.junit.jupiter.api.Test;
import util.TestUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationQuestionTests {

//    @Test
//    public void getPrompt() {
//        Question q = new MultiplicationQuestion(TestUtils.mockRandom(new int[] { 2, 3 }));
//        String prompt = q.getPrompt();
//        assertEquals("What is 2 x 3? ", prompt, "getPrompt must return the question prompt");
//    }
//
//    @Test
//    public void getValidityMessage() {
//        Question q = new MultiplicationQuestion(TestUtils.mockRandom());
//        String prompt = q.getValidityMessage();
//        assertEquals("Your answer must be a number", prompt, "getValidityMessage must return the correct validity message");
//    }
//
//    @Test
//    public void parseAnswer() {
//        Question q = new MultiplicationQuestion(TestUtils.mockRandom(new int[] { 2, 3 }));
//
//        String result = q.parseAnswer("blah");
//        assertEquals(Question.ANSWER_INVALID, result, "parseAnswer must return ANSWER_INVALID on invalid answers");
//
//        result = q.parseAnswer("5");
//        assertEquals(Question.ANSWER_INCORRECT, result, "parseAnswer must return ANSWER_INCORRECT on valid but incorrect answers");
//        result = q.parseAnswer("5.0");
//        assertEquals(Question.ANSWER_INCORRECT, result, "parseAnswer must return ANSWER_INCORRECT on valid but incorrect answers");
//        result = q.parseAnswer("6.1");
//        assertEquals(Question.ANSWER_INCORRECT, result, "parseAnswer must return ANSWER_INCORRECT on valid but incorrect answers");
//
//        result = q.parseAnswer("6");
//        assertEquals(Question.ANSWER_CORRECT, result, "parseAnswer must return ANSWER_CORRECT on correct answers");
//        result = q.parseAnswer("6.00");
//        assertEquals(Question.ANSWER_CORRECT, result, "parseAnswer must return ANSWER_CORRECT on correct answers");
//
//    }
}
