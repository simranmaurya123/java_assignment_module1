// Program to demonstrate Valid and Invalid Java Identifiers

public class q16 {
    // Method to check if a string is a valid identifier
    static void checkIdentifier(String identifier) {
        if (identifier == null || identifier.isEmpty()) {
            System.out.println("'" + identifier + "' is INVALID (empty)");
            return;
        }

        // Rule 1: Cannot start with a digit
        char first = identifier.charAt(0);
        if (Character.isDigit(first)) {
            System.out.println("'" + identifier + "' is INVALID (cannot start with a digit)");
            return;
        }

        // Rule 2: Cannot contain spaces
        if (identifier.contains(" ")) {
            System.out.println("'" + identifier + "' is INVALID (cannot contain spaces)");
            return;
        }

        System.out.println("'" + identifier + "' is a VALID Identifier");
    }

    public static void main(String[] args) {
        System.out.println("--- Identifier Verification ---");
        checkIdentifier("studentName"); // Valid
        checkIdentifier("_age");        // Valid
        checkIdentifier("$salary");     // Valid
        checkIdentifier("123student");  // Invalid (starts with digit)
        checkIdentifier("first name");  // Invalid (contains space)
    }
}
