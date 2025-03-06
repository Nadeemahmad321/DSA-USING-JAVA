package SORTING.COUNTING_SORT;

import java.util.Scanner;

public class CountingSort {
    
    // Method to perform Counting Sort
    static void countingSort(int array[]){
        int largest = Integer.MIN_VALUE;  // Initialize largest element as the smallest possible value
        
        // Finding the largest element in the array to determine the range
        for(int i=0; i<array.length; i++){
            largest = Math.max(largest, array[i]);  // Update largest to be the maximum of current largest and current array element
        }
        
        int [] count = new int[largest+1];  // Create a count array with size equal to largest element + 1 (for zero-based indexing)
        
        // Fill the count array with frequency of each element
        for(int i=0; i<array.length; i++){
            count[array[i]]++;  // Increment the index in count array corresponding to the value in array
        }
        
        int j = 0;  // Index for placing sorted elements back into original array
        // Reconstruct the sorted array by checking the count array
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){  // While there are occurrences of element i
                array[j] = i;  // Place i at position j in the original array
                j++;  // Move to the next position
                count[i]--;  // Decrease the count of i in the count array
            }
        }
    }

    static void print(int array[]){
        // Print the array in a formatted way: [element1, element2, element3, ...]
        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if (i < array.length - 1) {  // Avoid printing a comma after the last element
                System.out.print(", ");
            }
        }
        System.out.println("]");  // Print closing square bracket after the array
    }

    
    // Main method to take input and execute the sorting
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        // Taking input for the size of the array
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();
        
        int [] array = new int[size];  // Declare array with input size
        
        // Taking input for array elements
        System.out.print("Enter the element of array:");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();  // Read each element from the user
        }
        
        // Perform the sorting using Counting Sort
        countingSort(array);
        
        // Print the sorted array
        print(array);
        
        // Close the scanner to avoid resource leak
        sc.close();
    }
}
