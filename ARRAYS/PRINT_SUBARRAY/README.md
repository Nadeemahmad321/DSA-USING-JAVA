# PrintSubarray Java Program

## Overview

This Java program demonstrates how to print all possible subarrays of a given array. It takes an array as input from the user and prints every possible contiguous subarray. A subarray is a contiguous part of an array, and this program shows how to extract and display them one by one.

## Features

- **User Input:** Prompts the user to input the size of the array and the array elements.
- **Subarray Generation:** Generates all possible subarrays of the array.
- **Subarray Printing:** Prints each subarray in a formatted manner.
- **Efficient Use of Loops:** Uses three nested loops to generate and print subarrays.

## How It Works

The program uses three nested loops:

1. The outer loop determines the starting point (`i`) of the subarray.
2. The second loop determines the ending point (`j`) of the subarray.
3. The third loop prints the elements between `i` and `j` (both inclusive).

For each combination of `i` and `j`, the program extracts the subarray from the array and prints it.

### Example

Let's walk through an example.

### Input:

```
Enter the size of the array: 3
Enter the elements of the array: 1 2 3
```

### Output:

```
Subarrays:
1
1 2
1 2 3
2
2 3
3
```

### Explanation of Example:

For an array of size 3 with elements `[1, 2, 3]`, the subarrays are:

- Subarrays starting with `1`: `[1]`, `[1, 2]`, `[1, 2, 3]`
- Subarrays starting with `2`: `[2]`, `[2, 3]`
- Subarrays starting with `3`: `[3]`

Thus, the output lists all possible subarrays, each on a new line.

## Program Code

```java
package ARRAYS.PRINT_SUBARRAY;

import java.util.Scanner;

public class PrintSubarray {

    // Method to print all subarrays of a given array
    static void printSubArray(int array[]) {
        // Outer loop to set the starting index of the subarray
        for (int i = 0; i < array.length; i++) {
            // Inner loop to set the ending index of the subarray
            for (int j = i; j < array.length; j++) {
                // Third loop to print the elements of the subarray from i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");  // Print each element followed by a space
                }
                System.out.println();  // Move to the next line after printing each subarray
            }
            System.out.println();  // Print an additional blank line after finishing the subarrays for a specific starting index
        }
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();  // Read the size of the array

        // Initialize an array of the specified size
        int[] array = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();  // Read each element and store it in the array
        }

        // Output header for subarrays
        System.out.println("Subarrays:");

        // Call the method to print all subarrays
        printSubArray(array);

        // Close the scanner to avoid resource leakage
        sc.close();
    }
}
```

## Requirements

- **Java JDK 8 or higher** installed on your machine.
- **Text Editor/IDE** (like IntelliJ IDEA, Eclipse, or VS Code) to run the Java code.

## How to Run

1. **Clone this repository** (or copy the code).
2. **Compile** the Java program:
   ```
   javac PrintSubarray.java
   ```
3. **Run** the program:
   ```
   java PrintSubarray
   ```
4. Follow the prompts to input the array size and elements.
5. The program will display all subarrays of the array.

## Output Explanation

### Sample Run 1:

```
Enter the size of the array: 3
Enter the elements of the array: 1 2 3
Subarrays:
1
1 2
1 2 3
2
2 3
3
```

- **Subarrays starting from index 0**: `[1]`, `[1, 2]`, `[1, 2, 3]`
- **Subarrays starting from index 1**: `[2]`, `[2, 3]`
- **Subarrays starting from index 2**: `[3]`

### Sample Run 2:

```
Enter the size of the array: 4
Enter the elements of the array: 4 5 6 7
Subarrays:
4
4 5
4 5 6
4 5 6 7
5
5 6
5 6 7
6
6 7
7
```

- **Subarrays starting from index 0**: `[4]`, `[4, 5]`, `[4, 5, 6]`, `[4, 5, 6, 7]`
- **Subarrays starting from index 1**: `[5]`, `[5, 6]`, `[5, 6, 7]`
- **Subarrays starting from index 2**: `[6]`, `[6, 7]`
- **Subarrays starting from index 3**: `[7]`

## Conclusion

This program is a simple and efficient way to generate and print all possible subarrays from a given array. It can be useful in understanding how subarrays work in Java and is a common exercise in competitive programming.
