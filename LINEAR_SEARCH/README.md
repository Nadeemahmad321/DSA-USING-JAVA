# Linear Search in Java

## Overview

This Java program implements the **Linear Search** algorithm, which is used to search for a specific element in an array. Linear search checks each element in the array sequentially until the target element is found or the entire array is searched.

### Linear Search Algorithm

Linear search is the simplest search algorithm. It works by iterating through each element in the array and checking if it matches the target (key). If the target is found, its index is returned; otherwise, the search continues until the end of the array. If the target is not found, the algorithm returns `-1`.

## Features

- User-friendly interface for entering the size of the array and elements.
- Efficient linear search that returns the index of the element if found.
- Returns `-1` if the element is not found in the array.
- Handles arrays of any size specified by the user.

## Program Explanation

The program consists of the following key components:

1. **User Input:**

   - The program takes the size of the array from the user.
   - The user then enters the elements of the array.
   - Finally, the user specifies the element they want to search for in the array.

2. **Linear Search Logic:**

   - The `linearSearch` function loops through each element of the array, comparing it to the target element (key).
   - If the target element is found, it returns the index of the element.
   - If the element is not found, it returns `-1`.

3. **Output:**
   - After performing the search, the program outputs whether the element was found and, if so, at which index. If not found, it will output that the element was not found.

## Code Implementation

```java
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
```

## How It Works

### **1. User Input:**

- **Array Size:** First, the program prompts the user to enter the size of the array.
- **Array Elements:** Next, the user enters the elements of the array one by one.
- **Search Key:** Finally, the user enters the element (key) they want to search for in the array.

### **2. Linear Search:**

- The `linearSearch` method iterates over the array and compares each element to the search key.
- If a match is found, the index of the element is returned immediately.
- If no match is found after checking all elements, the method returns `-1`.

### **3. Output:**

- If the element is found, the index of the element in the array is displayed.
- If the element is not found, a message saying "Element is not found" is printed.

## Example

### Input:

```
Enter the size of the array: 5
Enter 5 elements for the array:
10 20 30 40 50
Enter the element you need to find: 30
```

### Output:

```
Element is found at index 2
```

### Input (Element Not Found):

```
Enter the size of the array: 5
Enter 5 elements for the array:
10 20 30 40 50
Enter the element you need to find: 60
```

### Output:

```
Element is not found.
```

## Key Concepts

- **Linear Search:** This is an O(n) algorithm, meaning its time complexity is linear, where `n` is the number of elements in the array. It works by checking each element sequentially until the desired element is found or all elements are checked.
- **Array:** An array is a data structure that holds a fixed-size sequential collection of elements of the same type. It allows us to store multiple values in a single variable, making it easier to manage collections of data.

- **Time Complexity:**
  - **Best Case:** O(1) if the element is found at the first position.
  - **Worst Case:** O(n) if the element is found at the last position or not found at all.
- **Space Complexity:** O(1), as linear search only uses a fixed amount of extra space regardless of the size of the input array.

## Conclusion

Linear Search is one of the simplest and most intuitive search algorithms. Although it is not the most efficient for large datasets, it is easy to implement and works well for smaller arrays or unsorted data where other search algorithms (like binary search) cannot be applied.
