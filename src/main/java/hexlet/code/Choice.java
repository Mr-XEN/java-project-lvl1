package hexlet.code;

public class Choice {
    public static void choice(int input) {
        switch (input) {
            case 0:
                System.exit(0);
                break;
            case 1:
                Cli.getNameFromConsole();
                break;
            case 2:
                Cli.getNameFromConsole();
                System.out.println("cheburek");
                break;
        }
    }
}
