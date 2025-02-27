# Smallest Number in Array - Java Program

## Overview

This Java program allows the user to input an array of integers and determines the **smallest element** in the array. It handles edge cases such as empty arrays and provides a clear and informative output.

## Features

- **User Input:** The program prompts the user to enter the size of the array and the elements of the array.
- **Smallest Element Search:** It finds the smallest element in the array using a simple linear search algorithm.
- **Edge Case Handling:** The program checks if the array is empty before attempting to find the smallest element.
- **Efficient Output:** The program displays the smallest element in a user-friendly manner, with appropriate messages for edge cases.

## Problem Statement

Given an array of integers, the goal is to find the smallest element in the array.

### Example:

- **Input:** `[10, 20, 30, 40, 50]`
- **Output:** `10`

### Constraints:

- The array must contain at least one integer.
- If the array is empty, the program should notify the user with an appropriate message.

---

## Code Implementation

```java
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

        // Step 1: Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Step 2: Declare the array with the specified size
        int[] array = new int[size];

        // Step 3: Ask the user to input the elements of the array
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt(); // User input for each element of the array
        }

        // Step 4: Call the method to find the smallest element
        int min = findSmallestInArray(array);

        // Step 5: If the array was not empty, display the result
        if (min != Integer.MAX_VALUE) {
            System.out.println("The smallest element in the array is: " + min);
        }

        // Close the scanner object to avoid memory leaks
        sc.close();
    }
}
```

---

## Explanation of the Code

### **1. User Input:**

- The program first asks the user to input the size of the array.
- After getting the size, the program requests the user to input the elements of the array. The array size will determine how many elements are input by the user.

### **2. Finding the Smallest Element:**

- The method `findSmallestInArray` is called to find the smallest element in the array.
- The method initializes the `min` variable to `Integer.MAX_VALUE` to ensure that any value in the array will be smaller than the initial value of `min`.
- The method then loops through each element of the array and compares it with the current `min`. If an element is smaller than the current `min`, the `min` value is updated.
- If the array is empty (i.e., `size == 0`), the method returns `Integer.MAX_VALUE` and prints `"Array is empty."` to the console.

### **3. Output:**

- The program checks if the result of `findSmallestInArray` is different from `Integer.MAX_VALUE`. If so, it prints the smallest element in the array. Otherwise, it indicates that the array is empty.

### **4. Edge Case Handling:**

- If the user inputs an empty array (size 0), the program handles this case by returning a message indicating that the array is empty and avoids any further processing.

### **5. Closing the Scanner:**

- After the program completes, the `Scanner` object is closed to avoid memory leaks and ensure proper resource management.

---

## Example Input/Output

### **Example 1:**

**Input:**

```
Enter the size of the array: 5
Enter 5 elements of the array:
10 20 30 40 50
```

**Output:**

```
The smallest element in the array is: 10
```

### **Example 2 (Empty Array):**

**Input:**

```
Enter the size of the array: 0
```

**Output:**

```
Array is empty.
```

---

## Key Concepts

### **Linear Search:**

- The program uses a linear search algorithm to find the smallest element in the array. It iterates over each element in the array and compares it with the current minimum value.
- **Time Complexity:** O(n), where `n` is the number of elements in the array. Each element is checked once.
- **Space Complexity:** O(1), as the algorithm uses only a constant amount of extra space.

### **Edge Case Handling:**

- **Empty Array:** If the array is empty, the program will notify the user and avoid any errors by not performing the search operation.

---

## Conclusion

This program is a simple and efficient way to find the smallest element in an array. It is robust enough to handle edge cases like empty arrays and provides clear and informative outputs.

### Advantages:

- **Simplicity:** The implementation is easy to understand and straightforward.
- **Edge Case Handling:** The program accounts for empty arrays and notifies the user.
- **Efficiency:** The algorithm works well for small to medium-sized arrays.

### Possible Improvements:

- **Handling Negative Numbers:** The program already works well for negative numbers, but further optimizations could be made if additional constraints or requirements are specified.
- **Large Array Optimization:** For very large datasets, advanced algorithms (like divide and conquer) can be used, but for typical usage, this linear search is sufficient.
