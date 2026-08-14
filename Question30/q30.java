// Remove Duplicate Elements from an Array

public class q30 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        System.out.print("Original Array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.print("Array without Duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
