package app.questions;

public class MultipleChoiceQuestion implements Question {

    /**
     * @param questionText The main question text
     * @param choices An array containing the text of the various choices for the question
     * @param correctChoiceIdx The index of the correct answer in the given choices array
     */
    private String questionText;
    private String[] choices;
    private int correctChoiceIdx;
    public MultipleChoiceQuestion(String questionText, String[] choices, int correctChoiceIdx) {
        this.questionText = questionText;
        this.choices = choices;
        this.correctChoiceIdx = correctChoiceIdx;
    }
    public String getPrompt(){

    }
}
