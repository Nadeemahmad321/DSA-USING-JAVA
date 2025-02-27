# Possible Pair of Elements in an Array

## Overview

This program generates and prints all possible pairs of elements from a user-provided array. It uses two nested loops to iterate through the elements and prints each pair of elements in the array.

### Features:

- Accepts an array size and array elements from the user.
- Generates all unique pairs of elements from the array.
- Displays each pair in the format `(array[i], array[j])`.

## Problem Statement

Given an array of integers, the task is to find all possible pairs of elements where each pair consists of two elements (array[i], array[j]) where `i < j`. The program prints all the unique pairs that can be formed from the given array.

## Code Explanation

### 1. `possiblePair` Method

This method is responsible for generating and printing the pairs from the array.

- The method uses a nested loop:
  - The outer loop runs from the first element (`i = 0`) to the second last element (`i < array.length - 1`).
  - The inner loop runs from the element after `i` (`j = i + 1`) to the last element.
  - The pair `(array[i], array[j])` is printed for each combination of `i` and `j`.
  - After printing all pairs for an element in the outer loop, a new line is printed to separate the next set of pairs.

### 2. `main` Method

The `main` method handles user input and calls the `possiblePair` method.

- The program first asks the user for the size of the array.
- It then reads the elements of the array from the user.
- After obtaining the array elements, it calls the `possiblePair` method to print all possible pairs.
- The scanner is closed at the end to avoid memory leaks.

## Example

**Input:**

```
Enter the size of the array: 3
Enter the elements of the array:
1 2 3
```

**Output:**

```
(1,2)(1,3)
(2,3)
```

### Explanation of Output:

- The input array is `[1, 2, 3]`.
- The program prints all pairs of elements:
  - `(1,2)` and `(1,3)` are printed for the first element.
  - `(2,3)` is printed for the second element.
- No more pairs can be formed for the third element since it is the last one.

## Code Complexity Analysis

- **Time Complexity:**

  - The time complexity of this algorithm is **O(n^2)**, where `n` is the number of elements in the array. This is due to the use of two nested loops, where the outer loop runs `n-1` times and the inner loop runs `n-i` times for each iteration of the outer loop.

- **Space Complexity:**
  - The space complexity is **O(n)** for storing the array of size `n` in memory. The space for the pairs is only printed and not stored in memory.

## How to Run the Program

1. Compile the code using a Java compiler:
   ```bash
   javac PossiblePair.java
   ```
2. Run the program:
   ```bash
   java PossiblePair
   ```
3. Input the size of the array and the array elements when prompted.
4. The program will print all possible pairs of elements from the array.

## Conclusion

This program demonstrates how to generate and display all unique pairs of elements from an array using nested loops. The code is simple and effective for small to moderate-sized arrays.
