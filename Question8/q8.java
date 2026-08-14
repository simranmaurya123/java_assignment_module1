// Access Modifiers in Java

class Person {
    // 1. public: Accessible from anywhere
    public String name = "Rahul";

    // 2. private: Accessible only inside this Person class
    private int age = 20;

    // 3. protected: Accessible in same package and subclasses
    protected String city = "Delhi";

    // 4. default (no modifier): Accessible only within the same package
    String country = "India";

    // Public method to access the private variable
    public void displayAge() {
        System.out.println("Private Age (accessed inside class): " + age);
    }
}

public class q8 {
    public static void main(String[] args) {
        Person p = new Person();

        System.out.println("Public Name: " + p.name);

        System.out.println("Protected City: " + p.city);

        System.out.println("Default Country: " + p.country);

        p.displayAge();
    }
}
