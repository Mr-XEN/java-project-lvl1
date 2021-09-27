package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static int number1;

    public static int getNumber1() {
        return number1;
    }

    public static void setNumber1(int start, int finish) {
        Even.number1 = (Engine.getRandomInt(start, finish));

    }

    public static String question() {
        return Integer.toString(getNumber1());
    }

    public static String answer() {
        if (number1 % 2 == 0) {
            return "yes";
        }
        return "no";
    }

    public static void game() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        final int count = 3;
        final int start = 0;
        final int finish = 100;
        for (int i = 0; i < count; i++) {
            setNumber1(start, finish);
            Engine.logic(question(), answer());
        }


//        final int count = 3;
//        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
//        for (int i = 0; i < count; i++) {
//            int number = Engine.randomInt();
//            System.out.println("Question: " + number);
//            System.out.print("Your answer: ");
//            Engine.setStringFromCli();
//            if (esli verno) {
//                System.out.println("Correct!");
//            } else if (esli ne verno) {
//                System.out.println("' " + input + "' is wrong answer ;(. Correct answer was '" + result + "'.");
//                System.out.println("Let's try again, " + Greeting.getName() + "!");
//                System.exit(0);
//            } else {
//                System.out.println(input + " is wrong answer ;(.");
//                System.out.println("Let's try again, " + Greeting.getName() + "!");
//                System.exit(0);
//            }
//        }
//        System.out.println("Congratulations, " + Greeting.getName() + "!");
    }

//    public static void game() {
//        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
//        int number = Engine.getRandomInt(0,100);
//        Engine.logic();
}



