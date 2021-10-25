package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUND_COUNTER = 3;

    public static void runLogic(String rules, String[] questions, String[] answers) {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(rules);

        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {

            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            Scanner input = new Scanner(System.in);
            String inputString = input.next();

            if (inputString.equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + inputString + "'" + " is wrong answer ;(. Correct answer was " + "'");
                System.out.println(answers[i] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
