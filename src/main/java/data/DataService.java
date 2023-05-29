package data;

import app.questions.MultipleChoiceQuestion;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DataService {

    /**
     * @return An array of MultipleChoiceQuestions based on the content of the math-questions.txt file
     */
    public MultipleChoiceQuestion[] getMultipleChoiceMathQuestions() {

        var questions = new ArrayList<MultipleChoiceQuestion>();

        try {
            // Open the file
            Path filePath = Paths.get("src", "main","resources", "math-questions.txt");
            String fileContent = Files.readString(filePath);

            // Split wherever there are one or more empty lines
            // (individual questions are separated by empty lines)
            var questionData = fileContent.split("\n\n+");

            for ( String question : questionData ) {

                String[] questionParts = question.split("\n");

                // The first line of a question is the main question text
                String questionString = questionParts[0];

                // The subsequent lines are the choices
                String[] choices = new String[questionParts.length-1];
                int correctChoiceIdx = -1;
                for ( int i = 1; i < questionParts.length ; i++ ) {
                    String choice = questionParts[i];

                    int choiceIdx = i-1;

                    // The choice that starts with ~> is the correct answer
                    if ( choice.startsWith("~>") ) {
                        choice = choice.replace("~>", "");
                        correctChoiceIdx = choiceIdx;
                    }
                    choices[choiceIdx] = choice.trim();
                }

                // Only use questions that have a specified answer
                if ( correctChoiceIdx != -1 ) {
                    questions.add(new MultipleChoiceQuestion(questionString, choices, correctChoiceIdx));
                }
            }

        } catch ( Exception e ) {
            // If the file cannot be opened or processed for whatever reason,
            // we just silently ignore the issue and return an empty array.
            // This is probably a bad idea in the long run, but it keeps our code
            // simpler for now.
        }

        return questions.toArray(new MultipleChoiceQuestion[0]);
    }
}
