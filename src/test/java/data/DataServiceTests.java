package data;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class DataServiceTests {

    @Test()
    public void getMultipleChoiceQuestions_throwsExceptionForNonExistentFile() {
        var d = new DataService();

        assertDoesNotThrow(() -> {
            var questions = d.getMultipleChoiceMathQuestions();

            assertTrue(questions.length > 0, "There must be questions in the multiple choice math question set");
        });
    }
}
