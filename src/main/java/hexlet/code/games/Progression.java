package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final String RULES = "What number is missing in the progression?";

    public static void game() {

        final int startRangeForStep = 1;
        final int endRangeForStep = 10;
        final int startRangeForLength = 5;
        final int endRangeForLength = 20;
        String[] question = new String[Engine.ROUND_COUNTER];
        String[] answer = new String[Engine.ROUND_COUNTER];

        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {
            int startNumber = Utils.getRandomIntInRange(Utils.START_RANGE, Utils.END_RANGE);
            int step = Utils.getRandomIntInRange(startRangeForStep, endRangeForStep);
            int length = Utils.getRandomIntInRange(startRangeForLength, endRangeForLength);
            int hiddenNumber = Utils.getRandomIntInRange(Utils.START_RANGE, length);
            question[i] = buildProgression(startNumber, step, length, hiddenNumber);
            answer[i] = calculateHiddenElement(startNumber, step, length, hiddenNumber);
        }
        Engine.runLogic(RULES, question, answer);
    }

    private static String buildProgression(int startNumber, int step, int length, int hiddenNumber) {

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

    private static String calculateHiddenElement(int startNumber, int step, int length, int hiddenNumber) {

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
