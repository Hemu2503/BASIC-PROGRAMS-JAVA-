import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] arr = new int[size];

        // Get the elements of the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array using the Arrays.sort() method
        Arrays.sort(arr);

        // Print the sorted array to the console
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Get the key value from the user
        System.out.println("Enter the key value to be searched:");
        int key = scanner.nextInt();

        // Call the binarySearch() method with the sorted array and key value as arguments
        int index = binarySearch(arr, key);

        // Print the result of the binary search
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position: " + (index + 1));
        }
    }

    // Define the binarySearch() method with an integer array and key value as arguments
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        // Continue the binary search while the low index is less than or equal to the high index
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If the middle element is equal to the key value, return the middle index
            if (arr[mid] == key) {
                return mid;
            }

            // If the middle element is less than the key value, update the low index to be the next index after the middle index
            else if (arr[mid] < key) {
                low = mid + 1;
            }

            // If the middle element is greater than the key value, update the high index to be the index before the middle index
            else {
                high = mid - 1;
            }
        }

        // If the key value is not found, return -1
        return -1;
    }
}