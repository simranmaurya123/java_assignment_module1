// Check whether a String is a Palindrome

import java.util.Scanner;

public class q49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equalsIgnoreCase(rev)) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is NOT a Palindrome String.");
        }

        sc.close();
    }
}
