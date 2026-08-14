// Primitive Data Types in Java

class PrimitiveDemo {
    // Class variables showing default/assigned values of primitive types
    byte b = 10;
    short s = 200;
    int i = 5000;
    long l = 100000L;
    float f = 10.5f;
    double d = 99.99;
    char c = 'A';
    boolean flag = true;

    void display() {
        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + flag);
    }
}

public class q12 {
    public static void main(String[] args) {
        PrimitiveDemo demo = new PrimitiveDemo();
        demo.display();
    }
}
