package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void game() {

        String[] question = new String[Engine.ROUND_COUNTER];
        String[] answer = new String[Engine.ROUND_COUNTER];

        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {
            int number = Utils.getRandomIntInRange(Utils.START_RANGE, Utils.END_RANGE);
            question[i] = Integer.toString(number);
            answer[i] = isPrime(number) ? "yes" : "no";
        }
        Engine.runLogic(RULES, question, answer);
    }

    private static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
