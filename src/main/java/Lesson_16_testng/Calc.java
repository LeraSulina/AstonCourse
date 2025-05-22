package Lesson_16_testng;

public class Calc {
    public static double getSumm (double b, double c){
        double summ = b+c;
        return summ;
    }

    public static double getDifference (double b, double c){
        double diff = b-c;
        return diff;
    }

    public static double getDivision(double b, double c){
        if (c == 0){
            return 0;
        }
        double div = b/c;
        return div;
    }

    public static double getMultiplication(double b, double c){
        double mult = b*c;
        return mult;
    }
}
