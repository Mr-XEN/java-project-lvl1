package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    private static String stringFromCli;

    public static String getStringFromCli() {
        return stringFromCli;
    }



    public static void setStringFromCli() {
        Scanner input = new Scanner(System.in);
        stringFromCli = input.next();
    }



    public static int getRandomInt(int startRange, int endRange) {
        int diff = endRange - startRange;
        Random random = new Random();
        return random.nextInt(diff + 1) + startRange;
    }

    public static void logic(String question, String answer) {

        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        Engine.setStringFromCli();
        if (getStringFromCli().equals(answer)) {
            System.out.println("Correct!");
        } else {
            System.out.print("'" + getStringFromCli() + "'" + " is wrong answer ;(. Correct answer was " + "'");
            System.out.println(answer + "'.");
            System.out.println("Let's try again, " + Greeting.getName() + "!");
            System.exit(0);
        }

    }
}
