package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void getNameFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = in.next();
        System.out.println("Hello, " + name + "!");
//        in.close();
    }
}
