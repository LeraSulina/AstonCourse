package Lesson_5;

public class Rectangle implements SpecShapes {
    private double widht;
    private double height;
    private String fullColor;
    private String borderColor;

    public Rectangle(double widht, double height, String fullColor, String borderColor) {
        this.widht = widht;
        this.height = height;
        this.fullColor = fullColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2*(widht + height);
    }

    @Override
    public double getArea() {
        return widht * height;
    }

    @Override
    public String getFullColor() {
        return fullColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}