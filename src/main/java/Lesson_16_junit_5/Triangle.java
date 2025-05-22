package Lesson_16_junit_5;

public class Triangle {
    public static double getSTriangle(double a, double h){
        if (a<=0){
            return 0;
        }
        if (h<=0){
            return 0;
        }
        double square = (a*h)/2;
        return square;
    }
}
