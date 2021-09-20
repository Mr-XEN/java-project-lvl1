package hexlet.code;

public class Choice {
    public static void choice(int input) {
        switch (input) {
            case 1:
                Greeting.getNameFromConsole();
                break;
            case 2:
                System.out.println("Welcome to the Brain Games!");
                Greeting.getNameFromConsole();
                Logic.evenOdd();
                break;
            case 0:
            default:
                System.exit(0);
                break;

        }
    }
}
