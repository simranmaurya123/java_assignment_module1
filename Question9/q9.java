// Final Keyword in Java (variables, methods, classes)

// 1. final class cannot be inherited
final class Parent {

    final int SPEED_LIMIT = 80;

    final void display() {
        System.out.println("Speed Limit: " + SPEED_LIMIT + " km/h");
    }
}

public class q9 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();

    }
}
