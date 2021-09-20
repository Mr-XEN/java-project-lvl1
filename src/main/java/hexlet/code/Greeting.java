package hexlet.code;

import java.util.Scanner;

public class Greeting {

    private static String name;

    public static String getNameFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.print("May I have your name? ");
        setName(in.next());
        System.out.println("Hello, " + name + "!");
        return getName();
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name2) {
        Greeting.name = name2;
    }
}



