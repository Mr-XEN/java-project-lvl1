package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static void game() {

        final int count = 3;
        final int start = 2;
        final int finish = 100;
        final String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questionArr = new String[count];
        String[] answerArr = new String[count];

        for (int i = 0; i < count; i++) {
            int question = Engine.getRandomInt(start, finish);
            questionArr[i] = Integer.toString(question);
            answerArr[i] = prime(question);
        }
        Engine.logic(rules, questionArr, answerArr);
    }

    private static String prime(int num) {

        String answer = "";
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                answer = "no";
                break;
            } else {
                answer = "yes";
            }
        }
        return answer;
    }
}
