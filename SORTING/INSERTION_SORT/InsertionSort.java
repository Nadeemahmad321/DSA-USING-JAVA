package SORTING.INSERTION_SORT;

import java.util.Scanner;

public class InsertionSort {
    
    // Method to perform Insertion Sort on the array
    static void insertionSort(int array[]) {
        // Traverse the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            // Store the current element in the key variable
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]; // Shift element to the right
                j = j - 1; // Move to the previous position
            }
            // Insert the key at the correct position
            array[j + 1] = key;
        }
    }

    // Method to print the elements of the array
    static void print(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // Print each element followed by a space
        }
    }

    // Main method to drive the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Create an array of the given size
        int[] array = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt(); // Read each element from the user
        }

        // Sort the array using Insertion Sort
        insertionSort(array);

        // Display the sorted array
        System.out.print("Displaying the elements of the sorted array: ");
        print(array);

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
