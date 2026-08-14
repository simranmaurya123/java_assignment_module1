// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

// Child class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Child class
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

// Child class
class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos.");
    }
}

// Main class
public class q5 {
    public static void main(String[] args) {

        // Parent class reference holding child class objects
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        // Polymorphism
        a1.sound();
        a2.sound();
        a3.sound();
    }
}
