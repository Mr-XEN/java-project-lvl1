package hexlet.code;

import java.util.Scanner;

public class Logic {

    private static String answer;

    public static int getNumFromCli() {
        Scanner input = new Scanner(System.in);
        int numberFromCli = input.nextInt();
        return numberFromCli;
    }

    public static String getAnswerFromCli() {
        Scanner input = new Scanner(System.in);
        answer = input.next();
        return answer;
    }

    public static int randomInt() {
        final int startRange = 0;
        final int endRange = 100;
        int result = startRange + (int) (Math.random() * endRange);
        return result;
    }

    public static boolean oddOrEven(int number) {
        return number % 2 == 0;
    }

    public static void evenOdd() {
        final int count = 3;
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        for (int i = 0; i < count; i++) {
            int number = randomInt();
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            getAnswerFromCli();
            if (answer.equals("yes") && oddOrEven(number)) {
                System.out.println("Correct!");
            } else if (answer.equals("yes") && !oddOrEven(number)) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + Greeting.getName() + "!");
                System.exit(0);
            } else if (answer.equals("no") && oddOrEven(number)) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Greeting.getName() + "!");
                System.exit(0);
            } else if (answer.equals("no") && !oddOrEven(number)) {
                System.out.println("Correct!");
            } else {
                System.out.println(Logic.answer + " is wrong answer ;(.");
                System.out.println("Let's try again, " + Greeting.getName() + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + Greeting.getName() + "!");
    }
}
