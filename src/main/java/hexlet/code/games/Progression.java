package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static void game() {

        final int count = 3;
        final int start = 0;
        final int finish = 100;
        final int startCountForStep = 1;
        final int finishCountForStep = 10;
        final int startCountForLength = 5;
        final int finishCountForLength = 20;
        final String rules = "What number is missing in the progression?";
        String[] questionArr = new String[count];
        String[] answerArr = new String[count];

        for (int i = 0; i < count; i++) {
            int startNumber = Engine.getRandomInt(start, finish);
            int step = Engine.getRandomInt(startCountForStep, finishCountForStep);
            int length = Engine.getRandomInt(startCountForLength, finishCountForLength);
            int hiddenNumber = Engine.getRandomInt(start, length);
            questionArr[i] = progression(startNumber, step, length, hiddenNumber);
            answerArr[i] = answer(startNumber, step, length, hiddenNumber);
        }
        Engine.logic(rules, questionArr, answerArr);
    }

    private static String progression(int startNumber, int step, int length, int hiddenNumber) {

        StringBuilder progression = new StringBuilder();
        int tempNumber = startNumber;

        for (int i = 0; i <= length; i++) {
            if (i == hiddenNumber) {
                progression.append(".. ");
                tempNumber = tempNumber + step;
            }
            progression.append(tempNumber).append(" ");
            tempNumber = tempNumber + step;
        }
        return progression.toString();
    }

    private static String answer(int startNumber, int step, int length, int hiddenNumber) {

        int tempNumber = startNumber;
        String answer = "";

        for (int i = 0; i <= length; i++) {
            if (i == hiddenNumber) {
                answer = Integer.toString(tempNumber);
                tempNumber = tempNumber + step;
            }
            tempNumber = tempNumber + step;
        }
        return answer;
    }
}
