// Interface
interface Vehicle {
    void start();
    void stop();
}

// Class implementing the interface
class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts with a key.");
    }

    @Override
    public void stop() {
        System.out.println("Car stops using the brake.");
    }
}

// Main class
public class q3 {
    public static void main(String[] args) {

        Vehicle v = new Car();

        v.start();
        v.stop();
    }
}
