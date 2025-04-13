package Lesson_5;

public class Triangle implements SpecShapes {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fullColor;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fullColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fullColor = fullColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double s = (sideA+sideB+sideC)/2;
        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
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
