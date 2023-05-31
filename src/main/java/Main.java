import app.App;
import app.questions.QuestionFactory;
import ui.ConsoleUI;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ConsoleUI ui = new ConsoleUI(new Scanner(System.in), System.out);
        QuestionFactory questionFactory = new QuestionFactory(new Random());
        App app = new App(ui, questionFactory);
        app.run();
    }
}
