interface Shape {
    double calculateArea();
}
abstract class AbstractShape{
    private String name;

    public AbstractShape(String name) {
        this.name = name;
    }

    public void initialize() {
        System.out.println("Initializing " + name + " with default values.");
    }

    public void displayDetails() {
        System.out.println("Shape: " + name);
    }
}


class Circle extends AbstractShape implements Shape {
    private double radius;

    
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
        initialize();
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends AbstractShape implements Shape{
    private double length;
    private double width;

    
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
        initialize(); 
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}


public class Shapess {
    public static void main(String[] args) {
    
        Circle circle = new Circle("Circle", 5.0);
        Rectangle rectangle = new Rectangle("Rectangle", 4.0, 6.0);

        circle.displayDetails();
        System.out.println("Area: " + circle.calculateArea());

        System.out.println();

        rectangle.displayDetails();
        System.out.println("Area: " + rectangle.calculateArea());
    }
}