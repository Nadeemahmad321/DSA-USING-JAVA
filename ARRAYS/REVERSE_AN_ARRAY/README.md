# Reverse an Array - Java Program

This Java program demonstrates how to reverse an array of integers. It reads an array from the user, reverses the array, and then prints the reversed array.

## Description

The program consists of three main components:

1. **`reverse` method**: Reverses the array by swapping elements.
2. **`swap` method**: Swaps two elements of the array.
3. **`print` method**: Prints the elements of the array.

### Steps:

1. The program first asks the user for the size of the array.
2. It then takes input for the elements of the array.
3. The program reverses the array.
4. Finally, it prints the reversed array.

## Features:

- The program allows the user to input the size and elements of the array.
- It reverses the array using a two-pointer technique.
- The array is printed before and after reversal.

## Code Walkthrough

### 1. `reverse` Method:

This method reverses the array in place. It uses two pointers: one at the beginning (`start`) and one at the end (`end`) of the array. It swaps the elements at these positions, then moves the pointers towards the center of the array. The process continues until the pointers meet in the middle.

### 2. `swap` Method:

This method swaps the elements at the `start` and `end` positions in the array using a temporary variable to hold one of the values during the swap.

### 3. `print` Method:

This method prints the elements of the array after reversal.

### 4. Main Method:

The main method:

- Prompts the user to enter the size and elements of the array.
- Calls the `reverse` method to reverse the array.
- Calls the `print` method to display the reversed array.

## Code Example

```java
package ARRAYS.REVERSE_AN_ARRAY;

import java.util.Scanner;

public class Reverse {

    // Method to reverse the elements of the array
    static void reverse(int array[]) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    // Method to swap two elements in the array
    static void swap(int array[], int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

    // Method to print the elements of the array
    static void print(int array[]) {
        System.out.println("Elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Declare an array with the specified size
        int[] array = new int[size];

        // Ask the user to input the elements of the array
        System.out.println("Enter " + size + " elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Reverse the array using the reverse method
        reverse(array);

        // Print the reversed array
        print(array);

        // Close the scanner to prevent memory leaks
        sc.close();
    }
}
```

## Example

### Input:

```
Enter the size of the array: 5
Enter the elements of the array:
1 2 3 4 5
```

### Output:

```
Elements of the array:
5 4 3 2 1
```

### Explanation:

- The program first prompts the user to enter the size of the array (in this case, 5).
- Then, the user enters the elements of the array (`1 2 3 4 5`).
- The program reverses the array and prints it in reversed order (`5 4 3 2 1`).

## Usage

1. Compile the program using the Java compiler:

   ```bash
   javac Reverse.java
   ```

2. Run the program:

   ```bash
   java Reverse
   ```

3. The program will ask for the size of the array and the array elements.
4. It will then print the reversed array.

## Conclusion

This program demonstrates how to reverse an array in Java using the two-pointer technique. It is simple, efficient, and easy to understand for beginners learning about arrays and basic algorithms.
