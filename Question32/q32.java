// Difference between == and .equals() in Java

public class q32 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");

        // == compares reference / memory location
        System.out.println("s1 == s2 : " + (s1 == s2)); // false (different memory objects)

        // .equals() compares actual character content
        System.out.println("s1.equals(s2) : " + s1.equals(s2)); // true (same content)
    }
}
