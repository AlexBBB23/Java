package ru.geekbrains.firstlesson;

public class lesson1 {
    public static void main(String[] args) {
        int f1 = 34;
        byte f2 = 5;
        short f3 = 31;
        long f4 = 231345142L;
        float f5 = 4.32f;
        double f6 = 214.2314;
        char f7 = 's';
        boolean f8 = true;
        System.out.println(calculate(1.3f, 7.4f, 9.3f, 3.1f));
        System.out.println(task10and20(23, 4));
        isPositiveOrNegative(-94);
        System.out.println(isNegative(-82));
        greetings("Александр");

    }
    public static float calculate (float a, float b, float c, float d){
        return a * (b + (c / d));
    }
    public static boolean task10and20 (int x1, int x2) {
        int sum = x1 + x2;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
    public static void isPositiveOrNegative(int q) {
        if (q>=0) {
            System.out.println(q + " is positive");
        }
        else System.out.println(q + " is negative");
    }
    public static boolean isNegative (int x) {
        if (x<0) return true;
        else return false;
    }
    public static void greetings (String name) {
        System.out.println("Привет, " + name + "!");
    }
    public static void LeapYear (int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 ==0)))
            System.out.println(year + "г. - не високосный");
        else System.out.println(year + "г. - високосный");
    }
}
