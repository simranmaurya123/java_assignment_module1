// Method Overriding and super Keyword

class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        // Calling parent class method using super
        super.sound();
        System.out.println("Dog barks.");
    }
}

public class q42 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
