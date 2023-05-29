package app;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTests {
//    @Test
//    public void runImmediateExit() {
//        var out = new ByteArrayOutputStream();
//        var inputs = new String[] { "username", "n" };
//        var ui = new ConsoleUI(TestUtils.mockScanner(inputs), new PrintStream(out));
//        var factory = new QuestionFactory(new DataService(), new Random());
//        var app = new App(ui, factory);
//
//        app.run();
//
//        String output = out.toString();
//        assertTrue(output.startsWith("What is your name?"), "App must ask the user for their name");
//        assertTrue(output.contains("Hello, username"), "App must greet the user");
//        assertTrue(output.contains("Would you like to take a quiz?"), "App must ask the user if they want to take a quiz");
//        assertTrue(output.trim().endsWith("Ok bye!"), "App must exit with a salutation");
//    }
//
//    @Test
//    public void runSomeQuizzes() {
//        var out = new ByteArrayOutputStream();
//        var inputs = new String[] { "username", "y", "6", "y", "6", "n"  };
//        var ui = new ConsoleUI(TestUtils.mockScanner(inputs), new PrintStream(out));
//        var mockFactory = new QuestionFactory(new DataService(), new Random()) {
//            @Override public Question[] makeQuestions(int n) {
//                return new Question[] { new MultiplicationQuestion(TestUtils.mockRandom(new int[] { 2, 3 }))};
//            }
//        };
//        var app = new App(ui, mockFactory);
//
//        app.run();
//
//        String output = out.toString();
//        assertTrue(output.startsWith("What is your name?"), "App must ask the user for their name");
//        assertTrue(output.contains("Hello, username"), "App must greet the user");
//        assertTrue(output.contains("Would you like to take a quiz?"), "App must ask the user if they want to take a quiz");
//        Assertions.assertEquals(2, TestUtils.numInstancesOfSubstring(output, "Question #"), "App must ask the questions");
//        Assertions.assertEquals(2, TestUtils.numInstancesOfSubstring(output, "1) "), "App must display a result report");
//        assertTrue(output.contains("Do you want to take another quiz?"), "App must ask the user if they want to take a quiz after each quiz");
//        assertTrue(output.trim().endsWith("Ok bye!"), "App must exit with a salutation");
//    }

}
