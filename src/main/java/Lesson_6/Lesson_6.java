package Lesson_6;

public class Lesson_6 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        String[][] arr2 = {{"zz ", "2 ", "3 ", "4 "},{"2 ", "2 ", "2 ", "2 "},{"3 ", "3 ", "3 ", "3 "},{"4 ", "4 ", "4 ", "4 "},};
        int[][] arr3 = new int[][]{{10, 20, 30, 40}};
        try {
            try {
                int result = castExc(arr);
                System.out.println("Сумма массива: " +result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
        System.out.println();
        for(int i = 0; i <= arr3.length; i++) {
            System.out.println(arr3[i]);}

    }

    public static int castExc(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}
