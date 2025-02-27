package ARRAYS.BINARY_SEARCH;

import java.util.Arrays;  // Import Arrays class for sorting
import java.util.Scanner; // Import Scanner class for input from user

public class BinarySearch {

    // Method to perform binary search
    static int binarySearch(int array[], int key) {
        // Initialize the start and end indices
        int start = 0;
        int end = array.length - 1;
        
        // Perform binary search while start index is less than or equal to the end index
        while (start <= end) {
            // Calculate the mid index
            int mid = start + (end - start) / 2;
            
            // If the element at mid is equal to the key, return the mid index
            if (array[mid] == key) {
                return mid;
            }
            // If the element at mid is greater than the key, search in the left half
            else if (array[mid] > key) {
                end = mid - 1;
            }
            // If the element at mid is smaller than the key, search in the right half
            else {
                start = mid + 1;
            }
        }
        
        // If the key is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Initialize an array with the given size
        int[] array = new int[size];

        // Ask the user to enter the elements of the array
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt(); // Fill the array with user inputs
        }

        // Sort the array in ascending order using Arrays.sort
        Arrays.sort(array);

        // Print the sorted array
        System.out.print("Printing the elements of the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " "); // Print each element separated by a space
        }
        System.out.println(); // Print a newline for better formatting

        // Ask the user to enter the key (element to search for)
        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        // Call the binarySearch method to find the index of the key
        int ans = binarySearch(array, key);

        // If the key is not found, print that it's not found
        if (ans == -1) {
            System.out.println("Element is not found.");
        } else {
            // If the key is found, print the index at which it was found
            System.out.println("Element is found at index " + ans);
        }

        // Close the scanner to avoid memory leak
        sc.close();
    }
}
