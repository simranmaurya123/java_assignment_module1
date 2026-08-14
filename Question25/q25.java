// Reverse the elements of an Array

public class q25 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Original Array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.print("Reversed Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
