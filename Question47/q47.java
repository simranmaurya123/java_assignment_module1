// Count Frequency of each character in a String

public class q47 {
    public static void main(String[] args) {
        String str = "hello";

        int[] freq = new int[256]; // ASCII array

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        System.out.println("Character frequencies in '" + str + "':");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }
    }
}
