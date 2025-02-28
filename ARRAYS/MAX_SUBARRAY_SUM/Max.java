package ARRAYS.MAX_SUBARRAY_SUM;

import java.util.Scanner;

public class Max {
    
    // This method calculates the maximum sum of a subarray
    static int maxSubArraySum(int[] array) {
        // Initialize the maximum value as the smallest possible integer
        int max = Integer.MIN_VALUE;
        
        // Variable to keep track of the sum of elements in the subarray
        int sum = 0;

        // Loop to consider all possible subarrays
        for (int i = 0; i < array.length; i++) {
            // Loop for the end of the subarray
            for (int j = i; j < array.length; j++) {
                // Loop to calculate the sum of elements in the subarray from index i to j
                for (int k = i; k <= j; k++) {
                    sum += array[k];  // Add element to the sum

                    // Update the max sum if the current sum is greater
                    if (sum > max) {
                        max = sum;
                    }
                }
                sum = 0;  // Reset sum for the next subarray
            }
        }
        return max;  // Return the maximum sum found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Create an array of the given size
        int[] array = new int[size];

        // Prompt user to enter the elements of the array
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Call the method to calculate the maximum subarray sum
        int max = maxSubArraySum(array);

        // Output the maximum sum
        System.out.println("The maximum subarray sum is: " + max);

        // Close the scanner
        sc.close();
    }
}
