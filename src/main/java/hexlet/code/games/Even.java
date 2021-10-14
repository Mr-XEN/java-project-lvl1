package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void game() {

        final int count = 3;
        final int start = 0;
        final int finish = 100;
        final String rules = "Answer 'yes' if number even otherwise answer 'no'.";
        String[] questionArr = new String[count];
        String[] answerArr = new String[count];

        for (int i = 0; i < count; i++) {
            int question = Engine.getRandomInt(start, finish);
            String answer = answer(question);
            questionArr[i] = Integer.toString(question);
            answerArr[i] = answer;
        }
        Engine.logic(rules, questionArr, answerArr);
    }

    private static String answer(int input) {
        if (input % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
