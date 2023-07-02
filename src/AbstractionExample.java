// Abstract class
abstract class Shape {
    // Abstract method
    public abstract void draw();

    // Non-abstract method
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete class extending the abstract class
class Circle extends Shape {
    // Implementing the abstract method
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Concrete class extending the abstract class
class Rectangle extends Shape {
    // Implementing the abstract method
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

// Main class
public class AbstractionExample {
    public static void main(String[] args) {
        // Create objects of concrete classes
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        // Call abstract method
        circle.draw();      // Output: Drawing a circle.
        rectangle.draw();   // Output: Drawing a rectangle.

        // Call non-abstract method
        circle.display();   // Output: This is a shape.
        rectangle.display();// Output: This is a shape.
    }
}
