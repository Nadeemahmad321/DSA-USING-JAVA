package ARRAYS.PRINT_SUBARRAY;

import java.util.Scanner;

public class PrintSubarray {

    // Method to print all subarrays of a given array
    static void printSubArray(int array[]) {
        // Outer loop to set the starting index of the subarray
        for (int i = 0; i < array.length; i++) {
            // Inner loop to set the ending index of the subarray
            for (int j = i; j < array.length; j++) {
                // Third loop to print the elements of the subarray from i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");  // Print each element followed by a space
                }
                System.out.println();  // Move to the next line after printing each subarray
            }
            System.out.println();  // Print an additional blank line after finishing the subarrays for a specific starting index
        }
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();  // Read the size of the array

        // Initialize an array of the specified size
        int[] array = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();  // Read each element and store it in the array
        }

        // Output header for subarrays
        System.out.println("Subarrays:");

        // Call the method to print all subarrays
        printSubArray(array);

        // Close the scanner to avoid resource leakage
        sc.close();
    }
}
