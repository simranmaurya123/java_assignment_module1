// Bitwise Operators in Java (&, |, ^, ~, <<, >>)

public class q34 {
    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        System.out.println("a & b  (AND) : " + (a & b));  // 0001 = 1
        System.out.println("a | b  (OR)  : " + (a | b));  // 0111 = 7
        System.out.println("a ^ b  (XOR) : " + (a ^ b));  // 0110 = 6
        System.out.println("~a     (NOT) : " + (~a));     // -6
        System.out.println("a << 1 (Left Shift)  : " + (a << 1)); // 10
        System.out.println("a >> 1 (Right Shift) : " + (a >> 1)); // 2
    }
}
