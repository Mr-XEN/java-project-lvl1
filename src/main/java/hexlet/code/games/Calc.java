//package hexlet.code.games;
//
//import hexlet.code.Engine;
//
//public class Calc {
//
//    private static int number1;
//    private static int number2;
//    private static int operator;
//    private static int result;
//    private static String operatorToString;
//
//    public static String getOperation() {
//        String minusplus = "";
//        switch (operator) {
//            case 0:
//                minusplus = "+";
//                break;
//            case 1:
//                minusplus = "-";
//                break;
//            case 2:
//                minusplus = "*";
//                break;
//            default:
//
//        }
//        setOperatorToString(minusplus);
//        return minusplus;
//    }
//
//    public static int getResultOfCalc(int num1, int num2, int oper) {
//        int res = 0;
//        switch (oper) {
//            case 0:
//                res = num1 + num2;
//                break;
//            case 1:
//                res = num1 - num2;
//                break;
//            case 2:
//                res = num1 * num2;
//                break;
//            default:
//
//        }
//        setResult(res);
//        return res;
//    }
//
//    public static String question() {
//        return getNumber1() + " " + getOperatorToString() + " " + getNumber2();
//    }
//
//    public static String answer() {
//        return Integer.toString(result);
//    }
//
//
//
//    public static void game() {
//        System.out.println("What is the result of the expression?");
//        final int count = 3;
//        final int start = 0;
//        final int finish = 100;
//        final int count2 = 2;
//
//        for (int i = 0; i < count; i++) {
//            setNumber1(Engine.getRandomInt(start, finish));
//            setNumber2(Engine.getRandomInt(start, finish));
//            setOperator(Engine.getRandomInt(start, count2));
//            getOperation();
//            getResultOfCalc(getNumber1(), getNumber2(), getOperator());
//            Engine.logic(question(), answer());
//        }
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
//    public static int getOperator() {
//        return operator;
//    }
//
//    public static int getResult() {
//        return result;
//    }
//
//    public static String getOperatorToString() {
//        return operatorToString;
//    }
//
//    public static void setNumber1(int num) {
//        Calc.number1 = num;
//    }
//
//    public static void setNumber2(int num) {
//        Calc.number2 = num;
//    }
//
//    public static void setOperator(int oper) {
//        Calc.operator = oper;
//    }
//
//    public static void setResult(int res) {
//        Calc.result = res;
//    }
//
//    public static void setOperatorToString(String opToString) {
//        Calc.operatorToString = opToString;
//    }
//}
//
