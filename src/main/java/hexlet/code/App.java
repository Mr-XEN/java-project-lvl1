package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        Scanner input = new Scanner(System.in);
        choice(input.nextInt());

        System.out.println("Congratulations, " + Greeting.getName() + "!");
    }


        public static void choice(int input) {
            final int answer1 = 1;
            final int answer2 = 2;
            final int answer3 = 3;
            final int answer4 = 4;
            final int answer5 = 5;
            final int answer6 = 6;
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
                case answer4:
                    System.out.println("Welcome to the Brain Games!");
                    Greeting.getNameFromConsole();
                    Gcd.game();
                    break;
                case answer5:
                    System.out.println("Welcome to the Brain Games!");
                    Greeting.getNameFromConsole();
                    Progression.game();
                    break;
                case answer6:
                    System.out.println("Welcome to the Brain Games!");
                    Greeting.getNameFromConsole();
                    Prime.game();
                    break;
                case 0:
                default:
                    System.exit(0);
                    break;

            }
        }
}
