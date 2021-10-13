//package hexlet.code.games;
//
//import hexlet.code.Engine;
//
//public class Prime {
//
//    private static int startNumber;
//    private static String answer;
//    private static String question;
//
//    public static void game() {
//
//        final int count = 3;
//        final int start = 0;
//        final int finish = 100;
//
//        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
//
//        for (int i = 0; i < count; i++) {
//            setStartNumber(Engine.getRandomInt(start, finish));
//            prime(startNumber);
//            Engine.logic(question, answer);
//        }
//    }
//
//    public static void prime(int num) {
//        for (int i = 2; i < num; i++) {
//            if (num % i == 0) {
//                answer = "no";
//                question = Integer.toString(startNumber);
//                break;
//            }
//            answer = "yes";
//            question = Integer.toString(startNumber);
//        }
//    }
//
//    public static void setStartNumber(int num) {
//        Prime.startNumber = num;
//    }
//
//
//
//}
