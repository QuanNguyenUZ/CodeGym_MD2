package AccessModifier;

import java.awt.*;

public class Circle {
    private double radius = 1.0;
    public String color = "Red";
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
