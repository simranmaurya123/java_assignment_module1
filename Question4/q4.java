/* Method Overloading occurs when a class has multiple methods with the same name but different parameters.
   Method Overriding occurs when a child class provides its own implementation of a method already defined in the parent class. */

// Parent class
class Animal {

    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

// Child class
class Dog extends Animal {

    // Method Overriding
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }

    // Method Overloading
    void eat() {
        System.out.println("Dog eats food.");
    }

    void eat(String food) {
        System.out.println("Dog eats " + food + ".");
    }
}

// Main class
public class q4 {
    public static void main(String[] args) {

        Dog d = new Dog();

        // Method Overriding
        d.sound();

        // Method Overloading
        d.eat();
        d.eat("meat");
    }
}
