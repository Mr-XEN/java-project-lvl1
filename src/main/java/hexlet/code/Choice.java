package hexlet.code;

public class Choice {
    public static void choice(int input) {
        switch (input) {
            case 0:
                System.exit(0);
                break;
            case 1:
                Greeting.getNameFromConsole();
                break;
            case 2:
                System.out.println("Welcome to the Brain Games!");
                Greeting.getNameFromConsole();
                Logic.evenOdd();
                break;
            default:
                System.exit(0);
                break;

        }
    }
}
