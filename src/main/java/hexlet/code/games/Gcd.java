package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {

    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void game() {

        String[] question = new String[Engine.ROUND_COUNTER];
        String[] answer = new String[Engine.ROUND_COUNTER];
        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {
            int firstNumber = Utils.getRandomIntInRange(Utils.START_RANGE, Utils.END_RANGE);
            int secondNumber = Utils.getRandomIntInRange(Utils.START_RANGE, Utils.END_RANGE);
            question[i] = firstNumber + " " + secondNumber;
            answer[i] = Integer.toString(findGcd(firstNumber, secondNumber));
        }
        Engine.runLogic(RULES, question, answer);
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
