package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static int startNumber;
    private static int step;
    private static int lenght;
    private static int hiddenNumber;
    private static int tempNumber;
    private static int result = 0;
    private static String answer;
    private static String question;

    public static void game() {

        final int count = 3;
        final int start = 0;
        final int finish = 100;
        final int count3 = 1;
        final int count4 = 10;
        final int count5 = 5;
        final int count6 = 20;
        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < count; i++) {
            setStartNumber(Engine.getRandomInt(start, finish));
            setStep(Engine.getRandomInt(count3, count4));
            setLenght(Engine.getRandomInt(count5, count6));
            setHiddenNumber(Engine.getRandomInt(start, lenght));
            progression();
            Engine.logic(question, answer);
        }
    }

    public static void progression() {

        StringBuilder progression = new StringBuilder();
        tempNumber = startNumber;
        for (int i = 0; i <= lenght; i++) {
            if (i == hiddenNumber) {
                progression.append(".. ");
                answer = Integer.toString(tempNumber);
                tempNumber = tempNumber + step;
            }
//            System.out.print(res + " ");
            progression.append(tempNumber + " ");
            tempNumber = tempNumber + step;
        }
        question = progression.toString();
    }

    public static void setStartNumber(int num) {
        Progression.startNumber = num;
    }

    public static void setStep(int num) {
        Progression.step = num;
    }

    public static void setLenght(int num) {
        Progression.lenght = num;
    }

    public static void setHiddenNumber(int num) {
        Progression.hiddenNumber = num;
    }
}
