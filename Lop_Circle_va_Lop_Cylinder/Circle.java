package Lop_Circle_va_Lop_Cylinder;

public class Circle {
    private double radius;
    private String color;
    private final double PI = 3.14;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", PI=" + PI +
                '}';
    }
    public double area(){
        double s = Math.pow(this.radius, 2) * PI;
        return s;
    }
}
