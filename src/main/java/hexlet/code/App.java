package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Choice.choice(Logic.getNumFromCli());

    }
}
//System.out.println("Welcome to the Brain Games!");
//        Cli.getNameFromConsole();
//