// Abstract Class in Java

abstract class Shape {
    // Abstract method (no body)
    abstract void draw();

    // Normal method
    void display() {
        System.out.println("Displaying Shape...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

public class q43 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.display();
        s.draw();
    }
}
