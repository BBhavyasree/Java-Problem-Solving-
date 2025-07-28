import java.util.Scanner;

public class CumulativeSumReplace {

    public static void replaceWithSumOfPrevious(int[] arr) {
        int sum = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];  // Store original value
            arr[i] = sum;       // Replace with cumulative sum of previous
            sum += temp;        // Update sum for next round
        }
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        System.out.println("Original Array:");
        printArray(arr);

        // Replace elements with sum of previous
        replaceWithSumOfPrevious(arr);

        System.out.println("Modified Array:");
        printArray(arr);

        scanner.close();
    }
}
