// First interface
interface Printable {
    void print();
}

// Second interface
interface Showable {
    void show();
}

// Class implementing multiple interfaces
class Display implements Printable, Showable {

    @Override
    public void print() {
        System.out.println("Printing the document.");
    }

    @Override
    public void show() {
        System.out.println("Displaying the document.");
    }
}

// Main class
public class q6 {
    public static void main(String[] args) {

        Display obj = new Display();

        obj.print();
        obj.show();
    }
}
