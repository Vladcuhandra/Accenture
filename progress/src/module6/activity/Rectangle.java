package module6.activity;

public class Rectangle extends Shape{

    private double length;
    private double breadth;

    public Rectangle(){

    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length * breadth);
    }

    Rectangle(double length, double breadth){
        this.breadth = breadth;
        this.length = length;
    }

}
