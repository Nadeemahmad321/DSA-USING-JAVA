# Counting Sort in Java

This repository contains a simple implementation of the **Counting Sort** algorithm in Java. Counting Sort is an integer sorting algorithm that operates by counting the number of occurrences of each distinct element in the input array, then using this information to place each element in its correct position.

### Algorithm Overview

Counting Sort works by:

1. Finding the largest element in the input array to determine the range.
2. Creating a **count array** to keep track of the frequency of each element in the input array.
3. Rebuilding the sorted array using the information from the count array.

### Features

- **Time Complexity:** O(n + k), where `n` is the number of elements in the input array and `k` is the range of the input.
- **Space Complexity:** O(k), where `k` is the range of the input values.

### Prerequisites

- Java 8 or higher.

### Usage

1. **Clone the repository** to your local machine:

   ```bash
   git clone https://github.com/yourusername/counting-sort-java.git
   ```

2. **Navigate to the project directory**:

   ```bash
   cd counting-sort-java
   ```

3. **Compile and run the program**:

   - Open a terminal and compile the program using `javac`:
     ```bash
     javac CountingSort.java
     ```
   - Run the program:
     ```bash
     java SORTING.COUNTING_SORT.CountingSort
     ```

4. **Input Format**:

   - The program will first ask for the size of the array.
   - Then, it will prompt you to input the elements of the array.

5. **Output Format**:
   - The program will output the sorted array in the following format:
     ```
     [0, 1, 2, 3, 4]
     ```

### Example Run

```
Enter the size of array: 5
Enter the element of array: 4 2 1 3 0
[0, 1, 2, 3, 4]
```

### Code Explanation

#### CountingSort Class

This class implements the **Counting Sort** algorithm. It includes:

1. **countingSort()**: The main method implementing the sorting logic.

   - It first finds the largest element in the array to determine the range.
   - Then it creates a count array that stores the frequency of each element.
   - Finally, it reconstructs the sorted array by placing each element in its correct position.

2. **print()**: This method is used to print the sorted array in a readable format with square brackets and commas separating elements.

3. **Main Method**:
   - Takes user input for the size and elements of the array.
   - Calls the `countingSort()` method to sort the array.
   - Prints the sorted array using the `print()` method.

#### Key Concepts

- **Count Array**: A helper array that stores the frequency of each element in the input array.
- **Rebuilding Sorted Array**: After counting the frequency of each element, we reconstruct the sorted array by placing elements in the correct order based on their frequency.

### Example Code

```java
package SORTING.COUNTING_SORT;

import java.util.Scanner;

public class CountingSort {

    // Method to perform Counting Sort
    static void countingSort(int array[]){
        int largest = Integer.MIN_VALUE;  // Initialize largest element as the smallest possible value

        // Finding the largest element in the array to determine the range
        for(int i=0; i<array.length; i++){
            largest = Math.max(largest, array[i]);  // Update largest to be the maximum of current largest and current array element
        }

        int [] count = new int[largest+1];  // Create a count array with size equal to largest element + 1 (for zero-based indexing)

        // Fill the count array with frequency of each element
        for(int i=0; i<array.length; i++){
            count[array[i]]++;  // Increment the index in count array corresponding to the value in array
        }

        int j = 0;  // Index for placing sorted elements back into original array
        // Reconstruct the sorted array by checking the count array
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){  // While there are occurrences of element i
                array[j] = i;  // Place i at position j in the original array
                j++;  // Move to the next position
                count[i]--;  // Decrease the count of i in the count array
            }
        }
    }

    // Method to print the sorted array
    static void print(int array[]){
        // Print the array in a formatted way: [element1, element2, element3, ...]
        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if (i < array.length - 1) {  // Avoid printing a comma after the last element
                System.out.print(", ");
            }
        }
        System.out.println("]");  // Print closing square bracket after the array
    }

    // Main method to take input and execute the sorting
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Taking input for the size of the array
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();

        int [] array = new int[size];  // Declare array with input size

        // Taking input for array elements
        System.out.print("Enter the element of array:");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();  // Read each element from the user
        }

        // Perform the sorting using Counting Sort
        countingSort(array);

        // Print the sorted array
        print(array);

        // Close the scanner to avoid resource leak
        sc.close();
    }
}
```
