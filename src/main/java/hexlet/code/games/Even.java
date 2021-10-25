package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final String RULES = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void run() {

        String[] questions = new String[Engine.ROUND_COUNTER];
        String[] answers = new String[Engine.ROUND_COUNTER];

        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {
            int number = Utils.getRandomIntInRange(Utils.START_RANGE, Utils.END_RANGE);
            questions[i] = Integer.toString(number);
            answers[i] = isEven(number) ? "yes" : "no";
        }
        Engine.runLogic(RULES, questions, answers);
    }

    private static boolean isEven(int input) {
        return input % 2 == 0;
    }
}
