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
        StringBuilder prompt = new StringBuilder(questionText + "\n");
        for (int i = 0; i < choices.length; i++) {
            prompt.append((char) ('A' + i)).append(") ").append(choices[i]).append("\n");
        }
        prompt.append("What is your answer?");

        return prompt.toString();

    }
    public String getValidityMessage() {
        String chooseOneOfMessage = "";
        if (choices.length == 2){
            chooseOneOfMessage = "AB";
        }
        else if (choices.length == 3){
            chooseOneOfMessage = "ABC";
        }
        else if (choices.length == 4){
            chooseOneOfMessage = "ABCD";
        }
        else if (choices.length == 5){
            chooseOneOfMessage = "ABCDE";
        }
        else if (choices.length == 6){
            chooseOneOfMessage = "ABCDEF";
        }
        else if (choices.length == 7){
            chooseOneOfMessage = "ABCDEFG";
        }
        else if (choices.length == 8){
            chooseOneOfMessage = "ABCDEFGH";
        }
        else if (choices.length == 9){
            chooseOneOfMessage = "ABCDEFGHI";
        }
        else if (choices.length == 10){
            chooseOneOfMessage = "ABCDEFGHIJ";
        }

        return "You must choose one of: " + chooseOneOfMessage;
    }
    public String parseAnswer(String answer) {
        String correctChoice = "";
        if (correctChoiceIdx == 0){
            correctChoice = "A";
        }
        else if (correctChoiceIdx == 1){
            correctChoice = "B";
        }
        else if (correctChoiceIdx == 2){
            correctChoice = "C";
        }
        else if (correctChoiceIdx == 3){
            correctChoice = "D";
        }
        else if (correctChoiceIdx == 4){
            correctChoice = "E";
        }
        else if (correctChoiceIdx == 5){
            correctChoice = "F";
        }
        else if (correctChoiceIdx == 6){
            correctChoice = "G";
        }else if (correctChoiceIdx == 7){
            correctChoice = "H";
        }
        else if (correctChoiceIdx == 8){
            correctChoice = "I";
        }
        else if (correctChoiceIdx == 9){
            correctChoice = "J";
        }
        
        
        try {
            answer = answer.toUpperCase();
            if (answer.equals(correctChoice)) {
                return ANSWER_CORRECT;
            } else if (!answer.equals(correctChoice) && answer.length() == 1) {
                return ANSWER_INCORRECT;
            }
            else {
                return ANSWER_INVALID;
            }
        }
        catch (Exception e){
            return ANSWER_INVALID;
        }
    }
}
