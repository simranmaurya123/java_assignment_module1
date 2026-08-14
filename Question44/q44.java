// Final Class and Final Method in Java

final class FinalDemoClass {
    final void showMessage() {
        System.out.println("This is a final method inside a final class.");
    }
}

public class q44 {
    public static void main(String[] args) {
        FinalDemoClass obj = new FinalDemoClass();
        obj.showMessage();
    }
}
