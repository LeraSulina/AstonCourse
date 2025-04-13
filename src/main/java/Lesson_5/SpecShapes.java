package Lesson_5;

public interface SpecShapes {
    double getPerimeter();

    double getArea();

    String getFullColor();

    String getBorderColor();

    public default void getSpec() {
        System.out.println("Периметр фигуры равен: " + getPerimeter());
        System.out.println("Площадь фигуры равна: " + getArea());
        System.out.println("Цвет фигуры: " + getFullColor());
        System.out.println("Цвет границ фигуры: " + getBorderColor()+ "\n");
    }

}


