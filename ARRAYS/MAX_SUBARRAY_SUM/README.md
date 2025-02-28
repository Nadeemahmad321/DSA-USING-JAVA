# Max Subarray Sum

This program calculates the maximum sum of any contiguous subarray from a given array of integers. It uses a brute-force approach, iterating through all possible subarrays, calculating their sums, and returning the maximum sum found.

## Description

The program defines a method called `maxSubArraySum` which takes an array of integers as input and returns the maximum sum of any subarray. The approach used here involves three nested loops to check every possible subarray in the array and calculate their sums. The largest sum encountered is returned as the result.

## How It Works

1. **Initialization**:

   - We initialize the `max` variable to `Integer.MIN_VALUE`, ensuring that any sum we calculate will be larger than this initial value.
   - A variable `sum` is used to store the sum of elements in the current subarray being considered.

2. **Nested Loops**:

   - The outermost loop runs through each possible starting index `i` of the subarray.
   - The second loop iterates through each possible ending index `j` of the subarray.
   - The innermost loop sums the elements between the starting index `i` and the ending index `j`.
   - If the sum of the current subarray is greater than the previously found `max`, the value of `max` is updated.

3. **Returning the Result**:
   - After all subarrays have been checked, the program returns the largest sum found.

## Time Complexity

The time complexity of this algorithm is **O(n³)** due to the three nested loops, where `n` is the length of the input array. This can become inefficient for larger arrays, and a more optimal solution (like Kadane's Algorithm) is recommended for large-scale problems.

## Example

### Input

```
Enter the size of the array: 5
Enter the elements of the array: -2 1 -3 4 -1
```

### Output

```
The maximum subarray sum is: 4
```

### Explanation:

For the given input array `[-2, 1, -3, 4, -1]`, the subarray with the maximum sum is `[4]`, and its sum is `4`. This is the largest sum that can be obtained from any contiguous subarray in the array.

## Code

```java
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
```

## Usage

1. Compile the Java program:

   ```bash
   javac Max.java
   ```

2. Run the program:

   ```bash
   java Max
   ```

3. Follow the prompts to enter the size of the array and the elements of the array.

## Limitations

- The algorithm has a time complexity of **O(n³)**, which can be slow for large arrays.
- For larger datasets, it is recommended to use more optimized algorithms like **Kadane's Algorithm** which runs in **O(n)** time.

## Conclusion

This program provides a simple way to compute the maximum sum of a contiguous subarray from a given array of integers using a brute-force approach. Although the approach works for smaller arrays, performance can be significantly improved for larger datasets by using more advanced algorithms.
