package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {

    public static void game() {

        final int count = 3;
        final int start = 0;
        final int finish = 100;
        final String rules = "Find the greatest common divisor of given numbers.";
        String[] questionArr = new String[count];
        String[] answerArr = new String[count];
        for (int i = 0; i < count; i++) {
            int firstNumber = Engine.getRandomInt(start, finish);
            int secondNumber = Engine.getRandomInt(start, finish);
            questionArr[i] = firstNumber + " " + secondNumber;
            answerArr[i] = Integer.toString(gcd(firstNumber, secondNumber));
        }
        Engine.logic(rules, questionArr, answerArr);
    }

    private static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }
        return a + b;
    }
}
