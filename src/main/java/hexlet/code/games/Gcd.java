//package hexlet.code.games;
//
//import hexlet.code.Engine;
//
//public class Gcd {
//
//    private static int number1;
//    private static int number2;
//
//
//    public static int gcd(int a, int b) {
//        while (a != 0 && b != 0) {
//            int c = b;
//            b = a % b;
//            a = c;
//        }
//        return a + b;
//    }
//
//    public static void game() {
//        System.out.println("Find the greatest common divisor of given numbers.");
//        final int count = 3;
//        final int start = 0;
//        final int finish = 100;
//        for (int i = 0; i < count; i++) {
//            setNumber1(start, finish);
//            setNumber2(start, finish);
//
//            Engine.logic(question(), answer());
//        }
//    }
//
//    public static void setNumber1(int start, int finish) {
//        Gcd.number1 = (Engine.getRandomInt(start, finish));
//    }
//
//    public static void setNumber2(int start, int finish) {
//        Gcd.number2 = (Engine.getRandomInt(start, finish));
//    }
//
//    public static int getNumber1() {
//        return number1;
//    }
//
//    public static int getNumber2() {
//        return number2;
//    }
//
//    public static String question() {
//        return getNumber1() + " " +  getNumber2();
//    }
//
//    public static String answer() {
//
//        return Integer.toString(gcd(number1, number2));
//    }
//}
