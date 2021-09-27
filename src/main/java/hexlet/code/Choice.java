package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class Choice {
    public static void choice(int input) {
        final int answer1 = 1;
        final int answer2 = 2;
        final int answer3 = 3;
        final int answer4 = 4;
        final int answer5 = 5;
        switch (input) {
            case answer1:
                Greeting.getNameFromConsole();
                break;
            case answer2:
                System.out.println("Welcome to the Brain Games!");
                Greeting.getNameFromConsole();
                Even.game();
                break;
            case answer3:
                System.out.println("Welcome to the Brain Games!");
                Greeting.getNameFromConsole();
                Calc.game();
                break;
            case 0:
            default:
                System.exit(0);
                break;

        }
    }
}

