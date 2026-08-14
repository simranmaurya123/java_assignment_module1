// Program to demonstrate Inheritance and Polymorphism

class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Dog inherits from Animal
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Cat inherits from Animal
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class q2 {
    public static void main(String[] args) {

        // Inheritance
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        // Polymorphism
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}
