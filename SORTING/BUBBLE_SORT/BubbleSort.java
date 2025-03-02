package SORTING.BUBBLE_SORT;

import java.util.Scanner;

public class BubbleSort {

    // Function to perform bubble sort on an array
    static void bubbleSort(int array[]) {
        // Outer loop to iterate over the entire array
        for (int i = 0; i < array.length; i++) {
            // Variable to track if a swap has occurred during the inner loop
            boolean isSwap = false;

            // Inner loop to perform the actual comparison and swapping
            // The inner loop goes until array.length - i - 1 because after each pass the largest element "bubbles" to the correct position at the end of the array
            for (int j = 0; j < array.length - i - 1; j++) {
                // If the current element is greater than the next element, swap them
                if (array[j] > array[j + 1]) {
                    // Mark that a swap has occurred
                    isSwap = true;

                    // Swapping the elements
                    int temp = array[j]; // Store current element in temp variable
                    array[j] = array[j + 1]; // Swap the current element with the next
                    array[j + 1] = temp; // Assign the temp value to the next element
                }
            }

            // If no elements were swapped in the inner loop, the array is already sorted
            if (!isSwap) {
                // Break the outer loop early to save unnecessary passes if the array is already sorted
                break;
            }
        }
    }

    // Function to print the sorted array
    static void print(int array[]) {
        System.out.print("Displaying array after sorting: ");
        // Print each element of the array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Print a newline for clean output
    }

    // Main function to drive the program
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt(); // Read the size of the array

        // Create an array of the specified size
        int[] array = new int[size];

        // Prompt user to input the elements of the array
        System.out.print("Enter the element of array: ");
        for (int i = 0; i < size; i++) {
            // Read each element of the array
            array[i] = sc.nextInt();
        }

        // Call the bubbleSort function to sort the array
        bubbleSort(array);

        // Call the print function to display the sorted array
        print(array);

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
