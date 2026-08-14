// Simple Singleton Class in Java

class Singleton {
    // 1. Private static instance
    private static Singleton singleInstance = null;

    // 2. Private constructor prevents direct instantiation
    private Singleton() {
        System.out.println("Singleton Instance Created.");
    }

    // 3. Public static method to return single instance
    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}

public class q40 {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println("Are obj1 and obj2 pointing to the same instance? " + (obj1 == obj2));
    }
}
