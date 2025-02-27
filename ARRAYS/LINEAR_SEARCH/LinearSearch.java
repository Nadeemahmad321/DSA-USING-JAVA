package ARRAYS.LINEAR_SEARCH;
import java.util.Scanner;

public class LinearSearch {
    // Method to perform linear search
    static int linearSearch(int array[], int key) {
        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // If the key is found, return the index
            }
        }
        return -1; // If key is not found, return -1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Take the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        // Step 2: Initialize the array
        int[] array = new int[size];
        
        // Step 3: Take array elements from the user
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt(); // Fill the array with user input
        }

        // Step 4: Take the key (element to search for) from the user
        System.out.print("Enter the element you need to find: ");
        int key = sc.nextInt();

        // Step 5: Perform the linear search
        int ans = linearSearch(array, key);
        
        // Step 6: Output the result
        if (ans == -1) {
            System.out.println("Element is not found.");
        } else {
            System.out.println("Element is found at index " + ans);
        }

        // Close the scanner object
        sc.close();
    }
}
