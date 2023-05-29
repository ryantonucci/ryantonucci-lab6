package app.questions;

import data.DataService;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class QuestionFactoryTests {

//    @Test
//    public void makeQuestions() {
//        try {
//            var factory = new QuestionFactory(new DataService(), new Random());
//            var questions = factory.makeQuestions(10);
//
//            assertEquals(10, questions.length, "makeQuestions must make the number of questions requested");
//            // Pick a few random questions from the set and verify that they're not the same
//            assertNotEquals(questions[7], questions[3], "The questions returned from makeQuestions must be different");
//            assertNotEquals(questions[0], questions[9], "The questions returned from makeQuestions must be different");
//        } catch ( Exception e ) {
//            fail("Calling makeQuestions with valid inputs should not throw an exception " + e.getMessage()) ;
//        }
//    }
}
