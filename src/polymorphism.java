// Shape.java
class Shape {
    protected double area;

    public void calculateArea() {
        System.out.println("Calculating area of Shape");
    }

    public void displayArea() {
        System.out.println("Area of Shape: " + area);
    }
}

// Rectangle.java
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        area = length * width;
    }

    @Override
    public void displayArea() {
        System.out.println("Area of Rectangle: " + area);
    }
}

// Circle.java
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    @Override
    public void displayArea() {
        System.out.println("Area of Circle: " + area);
    }
}

// Main.java
public class polymorphism {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(5, 3);
        Shape shape2 = new Circle(2.5);

        shape1.calculateArea();
        shape1.displayArea();

        shape2.calculateArea();
        shape2.displayArea();
    }
}
