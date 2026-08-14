// Ternary Operator Demonstration

public class q33 {
    public static void main(String[] args) {
        int num = 15;

        // Check even or odd using ternary operator
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);

        // Check positive or negative
        int val = -8;
        String status = (val >= 0) ? "Positive" : "Negative";
        System.out.println(val + " is " + status);
    }
}
