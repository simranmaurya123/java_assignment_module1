// Static and Non-Static Methods in Java

class Demo {
    // Non-static method (requires object to call)
    void normalMethod() {
        System.out.println("Non-static method called using object.");
    }

    // Static method (can be called directly using class name)
    static void staticMethod() {
        System.out.println("Static method called directly using Class Name.");
    }
}

public class q39 {
    public static void main(String[] args) {
        // Calling static method directly without creating an object
        Demo.staticMethod();

        // Calling non-static method using object
        Demo obj = new Demo();
        obj.normalMethod();
    }
}
