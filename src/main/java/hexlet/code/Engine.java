package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static String setStringFromCli() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    public static int getRandomInt(int startRange, int endRange) {
        int diff = endRange - startRange;
        Random random = new Random();
        return random.nextInt(diff + 1) + startRange;
    }

    public static void logic(String rules, String[] question, String[] answer) {
        final int count = 3;
        System.out.println(rules);
        for (int i = 0; i < count; i++) {

            System.out.println("Question: " + question[i]);
            System.out.print("Your answer: ");
            String inputString = Engine.setStringFromCli();

            if (inputString.equals(answer[i])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + inputString + "'" + " is wrong answer ;(. Correct answer was " + "'");
                System.out.println(answer[i] + "'.");
                System.out.println("Let's try again, " + Greeting.getName() + "!");
                System.exit(0);
            }
        }
    }
}
