// Define an interface Shape
interface Shape {
    void draw(); // Abstract method
}

// Implementing the Shape interface in the Circle class
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Implementing the Shape interface in the Rectangle class
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// now demonstrate polylorphism
public class Questin4{
    public static void main(String[] args) {

        // Creating objects of Circle and Rectangle
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        
        shape1.draw();  // it Calls Circle's draw() method
        shape2.draw();  // it Calls Rectangle's draw() method
    }
}
