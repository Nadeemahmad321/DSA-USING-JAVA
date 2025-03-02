# Trapping Rainwater Problem Solution

This project solves the **Trapping Rainwater** problem using a dynamic programming approach. The problem is about finding how much rainwater can be trapped between an array of bars of varying heights.

## Problem Description

Given an array of non-negative integers representing the heights of bars, each bar has a width of 1. The task is to compute how much water can be trapped after it rains.

For example:

- Given the heights `[0,1,0,2,1,0,1,3,2,1,2,1]`, the total amount of trapped rainwater is `6`.

## Approach

The solution uses the following steps:

1. **Compute the maximum height from the left (`leftMax[]`)**:

   - This array stores the maximum height encountered up to each index from the left side of the array.

2. **Compute the maximum height from the right (`rightMax[]`)**:

   - This array stores the maximum height encountered up to each index from the right side of the array.

3. **Calculate trapped water for each index**:

   - For each bar, the trapped water can be determined by taking the minimum of `leftMax[i]` and `rightMax[i]` and subtracting the height of the bar at that index.
   - The trapped water for a bar is `min(leftMax[i], rightMax[i]) - height[i]`.

4. **Sum the trapped water**:
   - The total trapped water is the sum of trapped water for each index.

## Code Explanation

```java
package ARRAYS.TRAPPING_RAINWATER;

import java.util.Scanner;

public class TrappingRainwater {

    // Function to calculate the total amount of trapped rainwater
    static int trappingRainWater(int height[]) {
        // Variable to store the total trapped water
        int trappedWater = 0;

        // Array to store the maximum height encountered from the left up to each index
        int[] leftMax = new int[height.length];
        leftMax[0] = height[0]; // The first element's left max is the element itself
        // Fill the leftMax array by finding the maximum height from the left for each position
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Array to store the maximum height encountered from the right up to each index
        int[] rightMax = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1]; // The last element's right max is the element itself
        // Fill the rightMax array by finding the maximum height from the right for each position
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Calculate the trapped water for each index by finding the minimum of leftMax and rightMax
        // and subtracting the height at that index from it.
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]); // The water level is the minimum of left and right max heights
            trappedWater += waterLevel - height[i]; // Trapped water is the difference between the water level and the current height
        }

        // Return the total trapped water
        return trappedWater;
    }

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input the size of the height array
        System.out.print("Enter the size of height:");
        int size = sc.nextInt();

        // Create an array to store the height values
        int[] height = new int[size];

        // Prompt the user to input the height values
        System.out.print("Enter the element of height:");
        for (int i = 0; i < size; i++) {
            height[i] = sc.nextInt(); // Read each height value from the user
        }

        // Call the trappingRainWater function to calculate the trapped water
        int trappedWater = trappingRainWater(height);

        // Print the total amount of trapped water
        System.out.print("Trapped water:" + trappedWater);

        // Close the scanner object to avoid resource leaks
        sc.close();
    }
}
```

### Explanation of the Code:

1. **`trappingRainWater()`**: This function calculates the trapped water by creating two arrays (`leftMax[]` and `rightMax[]`), which store the maximum heights from the left and right, respectively. The water trapped at each position is computed by the difference between the minimum of the two maximum heights and the current height.

2. **`main()`**: This is the entry point of the program. It prompts the user to input the size of the height array and the individual height values. Then, it calculates and displays the trapped water.

## How to Run

1. Clone this repository or download the source code.
2. Compile the Java file:
   ```
   javac TrappingRainwater.java
   ```
3. Run the program:

   ```
   java TrappingRainwater
   ```

4. Enter the size of the height array and the height values as prompted.

## Example

**Input:**

```
Enter the size of height: 12
Enter the element of height: 0 1 0 2 1 0 1 3 2 1 2 1
```

**Output:**

```
Trapped water: 6
```

## Time and Space Complexity

- **Time Complexity**: O(n), where `n` is the number of elements in the `height[]` array. This is because we traverse the array a constant number of times (3 passes: one for `leftMax[]`, one for `rightMax[]`, and one for calculating trapped water).
- **Space Complexity**: O(n), due to the use of the `leftMax[]` and `rightMax[]` arrays.
