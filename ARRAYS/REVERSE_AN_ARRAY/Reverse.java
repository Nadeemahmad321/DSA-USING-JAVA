package ARRAYS.REVERSE_AN_ARRAY;

import java.util.Scanner;

public class Reverse {
    
    // Method to reverse the elements of the array
    static void reverse(int array[]) {
        // Initializing two pointers: one at the start, one at the end of the array
        int start = 0;
        int end = array.length - 1;
        
        // Iterate until the start pointer is less than or equal to the end pointer
        while (start <= end) {
            // Swapping the elements at start and end using the swap method
            swap(array, start, end);
            
            // Increment start and decrement end to move towards the middle
            start++;
            end--;
        }
    }

    // Method to swap two elements in the array
    static void swap(int array[], int start, int end) {
        // Temporary variable to store the value of array[start]
        int temp = array[start];
        
        // Swapping the values at the start and end indices
        array[start] = array[end];
        array[end] = temp;
    }

    // Method to print the elements of the array
    static void print(int array[]) {
        System.out.println("Elements of the array: ");
        
        // Loop through the array and print each element
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Move to a new line after printing all elements
    }

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        // Declare an array with the specified size
        int[] array = new int[size];
        
        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt(); // Store each entered value in the array
        }
        
        // Reverse the array using the reverse method
        reverse(array);
        
        // Print the reversed array
        print(array);
        
        // Close the scanner to prevent memory leaks
        sc.close();
    }
}
