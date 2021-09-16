package hexlet.code;

import java.util.Scanner;

public class Logic {

    //public static int numberFromCli;

    public static int getNumFromCli() {

        Scanner input = new Scanner(System.in);
        int numberFromCli = input.nextInt();
//        input.close();
        System.out.println("Ввели число " + numberFromCli);
        return numberFromCli;
    }
}
