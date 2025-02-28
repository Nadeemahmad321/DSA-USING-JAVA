package ARRAYS.KADANES_ALGORITHM;

import java.util.Scanner;

public class Kadanes {
    
    // This method implements Kadane's Algorithm to find the maximum subarray sum
    static int kadanesAlgorithm(int[] array) {
        // currentSum keeps track of the sum of the current subarray being considered
        int currentSum = 0;
        
        // maxSum holds the largest sum found so far
        int maxSum = Integer.MIN_VALUE;
        
        // Loop through each element in the array
        for (int i = 0; i < array.length; i++) {
            // Add the current element to the current subarray sum
            currentSum += array[i];
            
            // If the current sum becomes negative, reset it to 0, as a negative sum won't contribute to a larger sum
            if (currentSum < 0) {
                currentSum = 0;
            }
            
            // Update the max sum if the current subarray sum is greater than the previously recorded max sum
            maxSum = Math.max(currentSum, maxSum);
        }
        
        // Return the largest sum found
        return maxSum;
    }

    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        // Create an array of the specified size
        int[] array = new int[size];
        
        // Prompt the user to enter the elements of the array
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        
        // Call Kadane's algorithm to find the maximum subarray sum and print the result
        System.out.println("The maximum subarray sum is: " + kadanesAlgorithm(array));
        
        // Close the scanner
        sc.close();
    }
}
