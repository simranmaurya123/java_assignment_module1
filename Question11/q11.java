// String Immutability in Java

public class q11 {
    public static void main(String[] args) {
        String str1 = "Hello";

        // Attempting to modify str1
        str1.concat(" World");

        // str1 remains unchanged because Strings are immutable
        System.out.println("Original String (str1): " + str1);

        // Explicitly assigning to a new string object
        String str2 = str1.concat(" World");
        System.out.println("New String (str2): " + str2);
    }
}
