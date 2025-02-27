package ARRAYS.SMALLEST_NUMBER;

import java.util.Scanner;

public class Smallest {
    
    // Method to find the smallest element in the array
    static int findSmallestInArray(int array[]) {
        // If the array is empty, return a message or handle the case appropriately.
        if (array.length == 0) {
            System.out.println("Array is empty.");
            return Integer.MAX_VALUE;  // Return a placeholder for an empty array.
        }

        // Initialize the min value to the largest possible integer value
        int min = Integer.MAX_VALUE;
        
        // Iterate through the array to find the smallest element
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {  // If the current element is smaller than min, update min
                min = array[i];
            }
        }
        
        return min;  // Return the smallest element
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
            array[i] = sc.nextInt(); // User input for each element of the array
        }
        
        // Call the method to find the smallest element
        int min = findSmallestInArray(array);
        
        // If the array was not empty, display the result
        if (min != Integer.MAX_VALUE) {
            System.out.println("The smallest element in the array is: " + min);
        }
        
        // Close the scanner object to avoid memory leaks
        sc.close();
    }
}
