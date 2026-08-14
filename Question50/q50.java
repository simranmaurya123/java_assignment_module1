// Split a String into words and print each word on a new line

public class q50 {
    public static void main(String[] args) {
        String sentence = "Java is an Object Oriented Programming Language";

        // Split string by space
        String[] words = sentence.split(" ");

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Words on new lines:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
