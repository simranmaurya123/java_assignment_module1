class Animal {
    String name = "Animal";

    void display() {
        System.out.println("This is an animal.");
    }
}

class Dog extends Animal {
    String name = "Dog";

    void display() {

        // Using this keyword
        System.out.println("Using this: " + this.name);

        // Using super keyword
        System.out.println("Using super: " + super.name);

        // Calling parent class method using super
        super.display();

        // Calling current class method using this
        this.show();
    }

    void show() {
        System.out.println("This is the Dog class.");
    }
}

public class q7 {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.display();
    }
}
