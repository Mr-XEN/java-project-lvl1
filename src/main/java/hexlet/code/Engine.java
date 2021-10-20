package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUND_COUNTER = 3;
    private static String name;

    public static void runLogic(String rules, String[] question, String[] answer) {

        System.out.println("Welcome to the Brain Games!");
        Engine.getNameFromConsole();
        System.out.println(rules);

        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {

            System.out.println("Question: " + question[i]);
            System.out.print("Your answer: ");
            Scanner input = new Scanner(System.in);
            String inputString = input.next();

            if (inputString.equals(answer[i])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + inputString + "'" + " is wrong answer ;(. Correct answer was " + "'");
                System.out.println(answer[i] + "'.");
                System.out.println("Let's try again, " + Engine.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Engine.getName() + "!");
    }
    public static void getNameFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = in.next();
        System.out.println("Hello, " + name + "!");
    }

    public static String getName() {
        return name;
    }
}
