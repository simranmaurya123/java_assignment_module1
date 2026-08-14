// Constructor Overloading in Java

class Student {
    String name;
    int age;

    // 1. Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // 2. Parameterized Constructor with 1 parameter
    Student(String name) {
        this.name = name;
        this.age = 18;
    }

    // 3. Parameterized Constructor with 2 parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class q36 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Amit");
        Student s3 = new Student("Rahul", 21);

        s1.display();
        s2.display();
        s3.display();
    }
}
