package SORTING.SELECTION_SORT;

import java.util.Scanner;

public class SelectionSort {

    // Method to perform selection sort on an array
    static void selectionSort(int array[]) {
        // Loop through the entire array
        for (int i = 0; i < array.length - 1; i++) {
            // Assume the minimum element is at the current index
            int min = i;
            
            // Find the smallest element in the unsorted part of the array
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j; // Update the min index if a smaller element is found
                }
            }
            
            // Swap the found minimum element with the element at index 'i'
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
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
        
        // Prompt user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        // Create an array of the given size
        int[] array = new int[size];
        
        // Prompt user to enter the elements of the array
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt(); // Read each element from the user
        }
        
        // Perform selection sort on the array
        selectionSort(array);
        
        // Display the sorted array
        System.out.print("Displaying the elements of the sorted array: ");
        print(array);
        
        sc.close(); // Close the scanner to prevent resource leak
    }
}
