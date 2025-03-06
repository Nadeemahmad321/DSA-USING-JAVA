# Insertion Sort Implementation in Java

This repository contains the implementation of the **Insertion Sort** algorithm in Java. The program prompts the user to input an array of integers, sorts the array using the Insertion Sort algorithm, and then displays the sorted array.

## Table of Contents

- [Overview](#overview)
- [Algorithm](#algorithm)
- [How to Run](#how-to-run)
- [Code Explanation](#code-explanation)
- [Example](#example)
- [License](#license)

## Overview

Insertion Sort is a simple comparison-based sorting algorithm. It works by iterating through the array, taking one element at a time and placing it in its correct position within the sorted portion of the array. The algorithm is efficient for small datasets or arrays that are partially sorted but becomes inefficient for large datasets.

## Algorithm

1. Start with the second element of the array (index 1), considering the first element as already sorted.
2. Compare the current element with the elements in the sorted portion of the array (elements before it).
3. Move all elements larger than the current element one position to the right to make space for the current element.
4. Place the current element in its correct position.
5. Repeat the process for all remaining elements until the entire array is sorted.

### Time Complexity

- Best case: **O(n)** (if the array is already sorted)
- Worst case: **O(n²)** (if the array is in reverse order)
- Average case: **O(n²)**
- Space Complexity: **O(1)** (in-place sorting)

## How to Run

1. Ensure you have Java installed on your system.
   - You can download and install Java from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Clone or download the repository.
3. Compile the Java file:

   ```bash
   javac InsertionSort.java
   ```

4. Run the program:

   ```bash
   java InsertionSort
   ```

5. The program will prompt you to input the size of the array, followed by the elements. Once the array is inputted, it will output the sorted array.

## Code Explanation

- **`insertionSort(int[] array)`**:

  - This method sorts the array using the Insertion Sort algorithm. It iterates through the array and inserts each element into the correct position in the sorted portion of the array.

- **`print(int[] array)`**:

  - This method prints the elements of the array to the console.

- **`main(String[] args)`**:
  - The entry point of the program. It prompts the user for input, invokes the sorting function, and prints the sorted array.

### Example Code Walkthrough

Here is an example input and output for the program:

#### Input:

```
Enter the size of the array: 5
Enter the elements of the array: 64 25 12 22 11
```

#### Output:

```
Displaying the elements of the sorted array: 11 12 22 25 64
```

### Explanation of Example:

- The program starts by accepting an array of size 5: `[64, 25, 12, 22, 11]`.
- It then applies the **Insertion Sort** algorithm:
  - Iteration 1: 25 is placed in the sorted portion and moves to the correct position.
  - Iteration 2: 12 is inserted into the correct position in the sorted portion.
  - Iteration 3: 22 is placed in the correct sorted position.
  - Iteration 4: 11 is inserted in its correct sorted position.
- Finally, the program displays the sorted array: `[11, 12, 22, 25, 64]`.
