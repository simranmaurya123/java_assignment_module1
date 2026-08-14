// Operator Precedence in Java

public class q35 {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;

        // Multiplication and Division have higher precedence than Addition
        int result1 = a + b * c; // 10 + (5 * 2) = 20
        System.out.println("a + b * c = " + result1);

        // Parentheses override default precedence
        int result2 = (a + b) * c; // (10 + 5) * 2 = 30
        System.out.println("(a + b) * c = " + result2);
    }
}
