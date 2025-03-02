# Bubble Sort Algorithm in Java

This project implements the **Bubble Sort** algorithm in Java. The Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

## Problem Description

Bubble Sort works by comparing adjacent items in the list and swapping them if necessary. After each pass, the largest unsorted element "bubbles up" to its correct position. The algorithm continues until no swaps are required, indicating that the array is sorted.

### Example:

Consider the array: `[64, 25, 12, 22, 11]`

**Step 1**: Compare 64 and 25 → Swap → `[25, 64, 12, 22, 11]`

**Step 2**: Compare 64 and 12 → Swap → `[25, 12, 64, 22, 11]`

**Step 3**: Compare 64 and 22 → Swap → `[25, 12, 22, 64, 11]`

**Step 4**: Compare 64 and 11 → Swap → `[25, 12, 22, 11, 64]`

After the first pass, the largest element (64) is in its correct position.

The algorithm then proceeds with further passes until all elements are sorted.

## Code Explanation

```java
package SORTING.BUBBLE_SORT;

import java.util.Scanner;

public class BubbleSort {

    // Function to perform bubble sort on an array
    static void bubbleSort(int array[]) {
        // Outer loop to iterate over the entire array
        for (int i = 0; i < array.length; i++) {
            // Variable to track if a swap has occurred during the inner loop
            boolean isSwap = false;

            // Inner loop to perform the actual comparison and swapping
            // The inner loop goes until array.length - i - 1 because after each pass the largest element "bubbles" to the correct position at the end of the array
            for (int j = 0; j < array.length - i - 1; j++) {
                // If the current element is greater than the next element, swap them
                if (array[j] > array[j + 1]) {
                    // Mark that a swap has occurred
                    isSwap = true;

                    // Swapping the elements
                    int temp = array[j]; // Store current element in temp variable
                    array[j] = array[j + 1]; // Swap the current element with the next
                    array[j + 1] = temp; // Assign the temp value to the next element
                }
            }

            // If no elements were swapped in the inner loop, the array is already sorted
            if (!isSwap) {
                // Break the outer loop early to save unnecessary passes if the array is already sorted
                break;
            }
        }
    }

    // Function to print the sorted array
    static void print(int array[]) {
        System.out.print("Displaying array after sorting: ");
        // Print each element of the array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Print a newline for clean output
    }

    // Main function to drive the program
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt(); // Read the size of the array

        // Create an array of the specified size
        int[] array = new int[size];

        // Prompt user to input the elements of the array
        System.out.print("Enter the element of array: ");
        for (int i = 0; i < size; i++) {
            // Read each element of the array
            array[i] = sc.nextInt();
        }

        // Call the bubbleSort function to sort the array
        bubbleSort(array);

        // Call the print function to display the sorted array
        print(array);

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
```

### Functions:

- **`bubbleSort(int array[])`**: This is the core function that performs the Bubble Sort. It iterates over the array and swaps adjacent elements if they are in the wrong order.
- **`print(int array[])`**: This function prints the sorted array to the console.

- **`main()`**: The entry point of the program that reads the input from the user, calls the `bubbleSort()` function to sort the array, and then prints the sorted array.

## Example Walkthrough

### Input:

```
Enter the size of array: 5
Enter the element of array: 64 25 12 22 11
```

### Output:

```
Displaying array after sorting: 11 12 22 25 64
```

**Explanation**:

- Initially, the array is `[64, 25, 12, 22, 11]`.
- After the first pass, the array becomes `[25, 12, 22, 11, 64]`, with the largest element (64) moved to the correct position.
- In the next passes, the array gets progressively sorted, and the final sorted array is `[11, 12, 22, 25, 64]`.

## Time and Space Complexity

- **Time Complexity**: O(n²) in the worst case, where `n` is the number of elements in the array. This occurs when the array is sorted in reverse order and all elements need to be compared and swapped. However, if the array is already sorted, the algorithm terminates early, making the best-case time complexity O(n).
- **Space Complexity**: O(1), since the sorting is done in place with no additional memory used (other than temporary variables).

## How to Run

1. **Clone this repository** or **download the source code**.
2. **Compile the Java file**:
   ```
   javac BubbleSort.java
   ```
3. **Run the program**:

   ```
   java BubbleSort
   ```

4. **Enter the size of the array** and **the elements of the array** as prompted.
