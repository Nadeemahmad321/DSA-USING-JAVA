package ARRAYS.LARGEST_NUMBER;

import java.util.Scanner;

public class Largest {
    
    // Method to find the largest element in the array
    static int findLargestInArray(int array[]) {
        // If the array is empty, return a message or handle the case appropriately.
        if (array.length == 0) {
            System.out.println("Array is empty.");
            return Integer.MIN_VALUE;  // Return a placeholder for an empty array.
        }

        // Initialize the max value to the smallest possible integer value
        int max = Integer.MIN_VALUE;
        
        // Iterate through the array to find the largest element
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {  // If the current element is greater than max, update max
                max = array[i];
            }
        }
        
        return max;  // Return the largest element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        // Declare the array with the specified size
        int[] array = new int[size];
        
        // Ask the user to input the elements of the array
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        
        // Call the method to find the largest element
        int max = findLargestInArray(array);
        
        // If the array was not empty, display the result
        if (max != Integer.MIN_VALUE) {
            System.out.println("The largest element in the array is: " + max);
        }
        
        // Close the scanner to avoid memory leaks
        sc.close();
    }
}
