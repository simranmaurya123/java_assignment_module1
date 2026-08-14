// Runtime Polymorphism (Dynamic Method Dispatch)

class Vehicle {
    void run() {
        System.out.println("Vehicle is running.");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running safely.");
    }
}

public class q45 {
    public static void main(String[] args) {
        // Parent class reference holding child class object
        Vehicle v = new Bike();
        v.run(); // Calls Bike's run() method at runtime
    }
}
