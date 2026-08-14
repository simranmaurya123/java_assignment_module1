// Find Largest and Smallest element in an Array

public class q17 {
    public static void main(String[] args) {
        int[] arr = {25, 11, 7, 75, 56};

        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Array elements: 25, 11, 7, 75, 56");
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}
