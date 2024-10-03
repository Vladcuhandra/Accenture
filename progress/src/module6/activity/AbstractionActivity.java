package module6.activity;

public class AbstractionActivity {


    public static void main(String[] args){


        // Create Rectangle
        Rectangle r = new Rectangle(5.0,6.0);
        r.setColor("Red");
        System.out.println("Rectangle Details:");
        System.out.println("Color: " + r.getColor());
        System.out.println("Area: " + r.calculateArea());
        System.out.println("Perimeter: " + r.calculatePerimeter());
        System.out.println("----------------------------");


        // Create Circle
        Circle c = new Circle(5.0);
        c.setColor("Red");
        System.out.println("Circle Details:");
        System.out.println("Color: " + c.getColor());
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Perimeter: " + c.calculatePerimeter());

    }
}
