package Lesson_5;

public class Circle implements SpecShapes {
    private double radius;
    private String fullColor;
    private String borderColor;

    public Circle(double radius, String fullColor, String borderColor) {
        this.radius = radius;
        this.fullColor = fullColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return 2*Math.PI*radius*radius;
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
