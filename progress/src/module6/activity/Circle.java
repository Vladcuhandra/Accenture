package module6.activity;

public class Circle extends Shape {

    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }


    public double calculateArea() {
        return Math.PI * radius * radius;
    }


    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
