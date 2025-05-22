package Lesson_16_testng;

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


