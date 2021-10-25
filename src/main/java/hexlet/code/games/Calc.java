package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final String RULES = "What is the result of the expression?";

    public static void run() {

        final int endRangeForOperator = 2;
        String[] questions = new String[Engine.ROUND_COUNTER];
        String[] answers = new String[Engine.ROUND_COUNTER];

        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {
            int firstNumber = Utils.getRandomIntInRange(Utils.START_RANGE, Utils.END_RANGE);
            int secondNumber = Utils.getRandomIntInRange(Utils.START_RANGE, Utils.END_RANGE);
            int operator = Utils.getRandomIntInRange(Utils.START_RANGE, endRangeForOperator);
            questions[i] = firstNumber + " " + getOperation(operator) + " " + secondNumber;
            answers[i] = Integer.toString(getResultOfCalc(firstNumber, secondNumber, operator));
        }
        Engine.runLogic(RULES, questions, answers);
    }

    private static String getOperation(int input) {
        String result = "";
        switch (input) {
            case 0:
                result = "+";
                break;
            case 1:
                result = "-";
                break;
            case 2:
                result = "*";
                break;
            default:
        }
        return result;
    }

    private static int getResultOfCalc(int num1, int num2, int operator) {
        int result = 0;
        switch (operator) {
            case 0:
                result = num1 + num2;
                break;
            case 1:
                result = num1 - num2;
                break;
            case 2:
                result = num1 * num2;
                break;
            default:
        }
        return result;
    }
}
