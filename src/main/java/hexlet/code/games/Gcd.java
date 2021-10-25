package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {

    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void run() {

        String[] questions = new String[Engine.ROUND_COUNTER];
        String[] answers = new String[Engine.ROUND_COUNTER];
        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {
            int firstNumber = Utils.getRandomIntInRange(Utils.START_RANGE, Utils.END_RANGE);
            int secondNumber = Utils.getRandomIntInRange(Utils.START_RANGE, Utils.END_RANGE);
            questions[i] = firstNumber + " " + secondNumber;
            answers[i] = Integer.toString(findGcd(firstNumber, secondNumber));
        }
        Engine.runLogic(RULES, questions, answers);
    }

    private static int findGcd(int a, int b) {
        while (a != 0 && b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }
        return a + b;
    }
}
