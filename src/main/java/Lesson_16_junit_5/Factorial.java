package Lesson_16_junit_5;

public class Factorial {

    public static long getFactorial(int a) {
        if (a<0){
            return 0;
        }
        long result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }
}


