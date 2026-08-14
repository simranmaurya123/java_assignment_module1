// Parameterized Constructor in Java

class Car {
    String brand;
    int year;

    // Parameterized Constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Car Brand: " + brand + ", Year: " + year);
    }
}

public class q38 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2022);
        Car car2 = new Car("Honda", 2024);

        car1.display();
        car2.display();
    }
}
