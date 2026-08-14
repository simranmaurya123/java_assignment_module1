// Demonstrating String Immutability

public class q48 {
    public static void main(String[] args) {
        String original = "Java";

        // Modifying original string
        String modified = original.concat(" Programming");

        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + modified);
    }
}
