package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run() {

        String[] questions = new String[Engine.ROUND_COUNTER];
        String[] answers = new String[Engine.ROUND_COUNTER];

        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {
            int number = Utils.getRandomIntInRange(Utils.START_RANGE, Utils.END_RANGE);
            questions[i] = Integer.toString(number);
            answers[i] = isPrime(number) ? "yes" : "no";
        }
        Engine.runLogic(RULES, questions, answers);
    }

    private static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return (num > 1);
    }
}
