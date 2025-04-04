package Lesson_2;
//1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
class Lesson_2 {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println();
        checSumSign();
        System.out.println();
        printColor();
        System.out.println();
        compareNumbers();
        int a;
        int b;
        System.out.println();
        int d;
        boolean c = methodeOne(a = 11, b = 11);
        System.out.println(c);
        System.out.println();
        methodeTwo(d = 1);
        System.out.println();
        boolean e = methodeThree(a = 3);
        System.out.println(e);
        System.out.println();
        methodeFour("So Hard", 3);
        System.out.println();
        boolean f = methodeFive(a = 2025);
        System.out.println(f);
        System.out.println();
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        methodeSix(arr);
        int [] emptyArray = new int[101];
        methodeSeven(emptyArray);
        int [] multyArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        methodeEight(multyArr);
        int [] [] table= new int [3] [3];
        methodeNine(table);
        int len;
        methodeTen(5, 3);
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checSumSign() {
        int a = 1;
        int b = -3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor() {
        int value = -1;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value <= 100 && value >= 0) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 1;
        int b = -3;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    static boolean methodeOne(int a, int b) {
        return a+b>=10&&a+b<=20;
        }



    static void methodeTwo(int d) {
        if (d>=0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    static boolean methodeThree(int a) {
        return a<0;
    }

    static void methodeFour(String a, int n) {
       for (int i = 0; i <n; i++) {
           System.out.println(a);
       }
    }

    static boolean methodeFive(int a) {
       return ((a%4==0&&a%100!=0) || (a%400==0));
    }

    static void methodeSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] > 0) ? 0 : 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    static void methodeSeven(int[] emptyArray) {
        for (int i = 1; i < emptyArray.length; i++) {
            emptyArray[i] = i;
            System.out.print(emptyArray[i]+" ");
        }
        System.out.println();
        System.out.println();
    }

    static void methodeEight(int[] multyArr) {
        for (int i = 0; i < multyArr.length; i++) {
            if (multyArr[i]<6) {
                multyArr[i] = multyArr[i]*2;
            }
            System.out.print(multyArr[i]+" ");
        }
        System.out.println();
        System.out.println();
    }

    static void methodeNine(int[][] table) {
        int counter = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j) {
                    table[i][j]=1;
                }
                System.out.print(table[i] [j]+" ");
                counter++;
            }
            System.out.println();
        }
        System.out.println();
    }

    static void methodeTen(int len, int initialValue) {
        int [] arrLen=new int[len];
        for (int i = 0; i < len; i++) {
            arrLen[i] = initialValue;
            System.out.print(arrLen[i] + " ");
        }
        System.out.println();
    }
}


