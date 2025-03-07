# Binary Search in Java

This program demonstrates how to implement binary search in Java. It accepts an array of integers from the user, sorts the array, and then performs a binary search to find a specified key within the sorted array. The program uses the **binary search algorithm**, which is efficient for searching in sorted arrays.

## **Features**

- Takes input from the user for the size of the array and the elements of the array.
- Sorts the array in ascending order using `Arrays.sort()`.
- Searches for a key (user-provided) in the sorted array using the binary search algorithm.
- Prints the index of the key if found, or indicates if the key is not found in the array.

## **How It Works**

1. **Input Array Size and Elements:**
   - The user is prompted to enter the size of the array and the elements in the array.
2. **Sorting the Array:**

   - The program uses `Arrays.sort()` to sort the array in ascending order.

3. **Binary Search:**

   - The sorted array is searched for a given key using the binary search algorithm. The key is input by the user, and the binary search checks if the key is present in the array.
   - The search is performed by dividing the array into two halves until the element is found or it is determined that the key is absent.

4. **Output:**
   - The program prints the sorted array for verification and the index of the key if found.

## **Code Explanation**

```java
package ARRAYS.BINARY_SEARCH;

import java.util.Arrays;  // Import Arrays class for sorting
import java.util.Scanner; // Import Scanner class for input from user

public class BinarySearch {

    // Method to perform binary search
    static int binarySearch(int array[], int key) {
        int start = 0;
        int end = array.length - 1;

        // Perform binary search while start index is less than or equal to the end index
        while (start <= end) {
            // Calculate the mid index
            int mid = start + (end - start) / 2;

            // If the element at mid is equal to the key, return the mid index
            if (array[mid] == key) {
                return mid;
            }
            // If the element at mid is greater than the key, search in the left half
            else if (array[mid] > key) {
                end = mid - 1;
            }
            // If the element at mid is smaller than the key, search in the right half
            else {
                start = mid + 1;
            }
        }

        // If the key is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Initialize an array with the given size
        int[] array = new int[size];

        // Ask the user to enter the elements of the array
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt(); // Fill the array with user inputs
        }

        // Sort the array in ascending order using Arrays.sort
        Arrays.sort(array);

        // Print the sorted array
        System.out.print("Printing the elements of the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " "); // Print each element separated by a space
        }
        System.out.println(); // Print a newline for better formatting

        // Ask the user to enter the key (element to search for)
        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        // Call the binarySearch method to find the index of the key
        int ans = binarySearch(array, key);

        // If the key is not found, print that it's not found
        if (ans == -1) {
            System.out.println("Element is not found.");
        } else {
            // If the key is found, print the index at which it was found
            System.out.println("Element is found at index " + ans);
        }

        // Close the scanner to avoid memory leak
        sc.close();
    }
}
```

## **Steps for Execution:**

1. **Start the program.**
2. **Enter the size of the array.**
3. **Enter the array elements one by one.**
4. **The program will sort the array and print it out.**
5. **Enter the key (element to search).**
6. **The program will search for the key using binary search and output its index if found.**

## **Example Run:**

#### Input:

```
Enter the size of the array: 5
Enter the elements of the array: 5 2 9 1 4
Enter the key: 9
```

#### Output:

```
Printing the elements of the array: 1 2 4 5 9
Element is found at index 4
```

#### Explanation:

- The array `[5, 2, 9, 1, 4]` is entered.
- The array is sorted to `[1, 2, 4, 5, 9]`.
- The key `9` is searched and found at index 4 (0-based index).

## **Edge Cases:**

- **Empty Array:**
  - If the array has a size of `0`, the program will not allow the user to enter any elements.
- **Key Not Found:**
  - If the entered key is not present in the array, the program will output `Element is not found.`

## **Complexity:**

- **Time Complexity:**

  - Sorting the array takes `O(n log n)` using `Arrays.sort()`.
  - Binary search itself has a time complexity of `O(log n)`.

- **Space Complexity:**
  - The space complexity is `O(n)` due to the storage required for the array.

## **Conclusion:**

This Java program efficiently implements binary search on a sorted array. It demonstrates both the use of the `Arrays.sort()` method and the binary search algorithm to find an element in the array.
