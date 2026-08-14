// Standalone Factorial Program using Recursion

import java.util.Scanner;

public class q20 {
    static int findFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find factorial: ");
        int num = sc.nextInt();

        int fact = findFactorial(num);
        System.out.println("Factorial of " + num + " = " + fact);

        sc.close();
    }
}
