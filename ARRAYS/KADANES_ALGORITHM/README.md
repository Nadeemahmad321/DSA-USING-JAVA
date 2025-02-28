# Kadane's Algorithm - Maximum Subarray Sum

This program implements **Kadane's Algorithm** to find the maximum sum of any contiguous subarray from a given array of integers. Kadane's Algorithm is an efficient approach with **O(n)** time complexity, which makes it suitable for large datasets.

## Overview

Kadane's Algorithm works by iterating through the array and keeping track of the maximum subarray sum at each position. It uses a dynamic approach to calculate the sum of the subarray and resets the sum when it goes negative, as a negative sum will never contribute to a larger sum.

## How It Works

1. **Initialization**:
   - The variable `currentSum` is initialized to 0. This variable stores the sum of the current subarray being considered.
   - The variable `maxSum` is initialized to `Integer.MIN_VALUE`. This variable keeps track of the maximum sum found during the iteration.
2. **Iterating Through the Array**:
   - The algorithm loops through each element in the array.
   - For each element, it adds it to `currentSum`. If `currentSum` becomes negative, it is reset to 0 because a negative sum will decrease the potential sum of future subarrays.
3. **Updating the Maximum Sum**:

   - After adding each element to `currentSum`, the algorithm checks if `currentSum` is greater than `maxSum`. If it is, `maxSum` is updated with `currentSum`.

4. **Final Result**:
   - After the iteration finishes, `maxSum` contains the maximum sum of any contiguous subarray in the array.

## Time Complexity

- **O(n)**, where `n` is the length of the input array. The algorithm makes a single pass through the array, making it more efficient than brute-force approaches with higher time complexities (like O(n²) or O(n³)).

## Example

### Input:

```
Enter the size of the array: 5
Enter the elements of the array: -2 1 -3 4 -1
```

### Output:

```
The maximum subarray sum is: 4
```

### Explanation:

For the given input array `[-2, 1, -3, 4, -1]`, Kadane's Algorithm identifies that the subarray `[4]` has the maximum sum of `4`. The sum of the subarray `[4]` is greater than the sum of any other contiguous subarray in the array.

## Code

```java
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
```

## Usage

1. **Compile the Java Program**:

   First, compile the `Kadanes.java` file using the Java compiler:

   ```bash
   javac Kadanes.java
   ```

2. **Run the Program**:

   After compiling, run the program using:

   ```bash
   java Kadanes
   ```

3. **Input the Data**:

   - Enter the size of the array.
   - Enter the elements of the array (separate each element by a space).

   Example:

   ```
   Enter the size of the array: 5
   Enter the elements of the array: -2 1 -3 4 -1
   ```

   The program will output:

   ```
   The maximum subarray sum is: 4
   ```

## Conclusion

This program efficiently calculates the maximum sum of any contiguous subarray using **Kadane's Algorithm**, which runs in linear time **O(n)**. This makes it much more efficient than brute-force methods. The algorithm resets the sum whenever it goes negative, ensuring it always finds the maximum possible sum of subarrays in a single pass through the array.

For larger datasets or applications requiring high efficiency, Kadane's Algorithm is a powerful solution.
