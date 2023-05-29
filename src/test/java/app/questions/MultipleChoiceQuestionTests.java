package app.questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleChoiceQuestionTests {

//    @Test
//    public void getPrompt() {
//        Question q = new MultipleChoiceQuestion(
//                "The question text",
//                new String[] { "Answer 1", "Answer 2", "Answer 3" },
//                0
//        );
//        String prompt = q.getPrompt();
//        String expected = """
//                The question text
//                A) Answer 1
//                B) Answer 2
//                C) Answer 3
//                What is your answer?""";
//        assertEquals(expected, prompt, "getPrompt must return the question prompt");
//    }
//
//    @Test
//    public void getValidityMessage() {
//        Question q = new MultipleChoiceQuestion(
//                "The question text",
//                new String[] { "Answer 1", "Answer 2", "Answer 3" },
//                0
//        );
//        String prompt = q.getValidityMessage();
//        assertEquals("You must choose one of: ABC", prompt, "getValidityMessage must return the correct validity message");
//
//        q = new MultipleChoiceQuestion(
//                "The question text",
//                new String[] { "Answer 1", "Answer 2", "Answer 3", "A4", "A5", "A6", "A7", "A8" },
//                0
//        );
//        prompt = q.getValidityMessage();
//        assertEquals("You must choose one of: ABCDEFGH", prompt, "getValidityMessage must return the correct validity message");
//    }
//
//    @Test
//    public void parseAnswer() {
//        Question q = new MultipleChoiceQuestion(
//                "The question text",
//                new String[] { "Answer 1", "Answer 2", "Answer 3", "A4" },
//                0
//        );
//
//        String result = q.parseAnswer("blah");
//        assertEquals(Question.ANSWER_INVALID, result, "parseAnswer must return ANSWER_INVALID on invalid answers");
//
//        result = q.parseAnswer("b");
//        assertEquals(Question.ANSWER_INCORRECT, result, "parseAnswer must return ANSWER_INCORRECT on valid but incorrect answers");
//        result = q.parseAnswer("B");
//        assertEquals(Question.ANSWER_INCORRECT, result, "parseAnswer must return ANSWER_INCORRECT on valid but incorrect answers");
//        result = q.parseAnswer("c");
//        assertEquals(Question.ANSWER_INCORRECT, result, "parseAnswer must return ANSWER_INCORRECT on valid but incorrect answers");
//        result = q.parseAnswer("C");
//        assertEquals(Question.ANSWER_INCORRECT, result, "parseAnswer must return ANSWER_INCORRECT on valid but incorrect answers");
//        result = q.parseAnswer("d");
//        assertEquals(Question.ANSWER_INCORRECT, result, "parseAnswer must return ANSWER_INCORRECT on valid but incorrect answers");
//        result = q.parseAnswer("D");
//        assertEquals(Question.ANSWER_INCORRECT, result, "parseAnswer must return ANSWER_INCORRECT on valid but incorrect answers");
//
//        result = q.parseAnswer("a");
//        assertEquals(Question.ANSWER_CORRECT, result, "parseAnswer must return ANSWER_CORRECT on correct answers");
//        result = q.parseAnswer("A");
//        assertEquals(Question.ANSWER_CORRECT, result, "parseAnswer must return ANSWER_CORRECT on correct answers");
//
//    }
}
