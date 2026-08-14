// Copy Constructor in Java

class Book {
    String title;
    double price;

    // Parameterized Constructor
    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // Copy Constructor (takes another Book object)
    Book(Book b) {
        this.title = b.title;
        this.price = b.price;
    }

    void display() {
        System.out.println("Title: " + title + ", Price: $" + price);
    }
}

public class q37 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", 29.99);

        // Creating b2 using copy constructor
        Book b2 = new Book(b1);

        System.out.print("Original Book (b1): ");
        b1.display();

        System.out.print("Copied Book (b2)  : ");
        b2.display();
    }
}
