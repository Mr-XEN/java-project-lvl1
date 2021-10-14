package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    public static void game() {

        final int count = 3;
        final int start = 0;
        final int finish = 100;
        final int finishForOperator = 2;
        final String rules = "What is the result of the expression?";
        String[] questionArr = new String[count];
        String[] answerArr = new String[count];

        for (int i = 0; i < count; i++) {
            int firstNumber = Engine.getRandomInt(start, finish);
            int secondNumber = Engine.getRandomInt(start, finish);
            int operator = Engine.getRandomInt(start, finishForOperator);
            questionArr[i] = firstNumber + " " + getOperation(operator) + " " + secondNumber;
            answerArr[i] = Integer.toString(getResultOfCalc(firstNumber, secondNumber, operator));
        }
        Engine.logic(rules, questionArr, answerArr);
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
