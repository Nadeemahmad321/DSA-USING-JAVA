# Selection Sort Implementation in Java

This repository contains the implementation of the **Selection Sort** algorithm in Java. The program prompts the user to input an array of integers, then sorts the array using the Selection Sort algorithm, and finally displays the sorted array.

## Table of Contents

- [Overview](#overview)
- [Algorithm](#algorithm)
- [How to Run](#how-to-run)
- [Code Explanation](#code-explanation)
- [Example](#example)
- [License](#license)

## Overview

Selection Sort is a simple comparison-based sorting algorithm. It works by repeatedly selecting the smallest (or largest, depending on sorting order) element from the unsorted portion of the array and swapping it with the first unsorted element. This process continues until the entire array is sorted.

## Algorithm

1. Start from the first element in the array.
2. Find the smallest element in the unsorted portion of the array.
3. Swap this smallest element with the element at the current position.
4. Move the boundary of the sorted portion of the array by one.
5. Repeat the process for all elements until the array is fully sorted.

### Time Complexity

- Best case: **O(n²)**
- Worst case: **O(n²)**
- Average case: **O(n²)**
- Space Complexity: **O(1)** (in-place sorting)

## How to Run

1. Ensure you have Java installed on your system.
   - You can download and install Java from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Clone or download the repository.
3. Compile the Java file:

   ```bash
   javac SelectionSort.java
   ```

4. Run the program:

   ```bash
   java SelectionSort
   ```

5. The program will prompt you to input the size of the array, followed by the elements. Once the array is inputted, it will output the sorted array.

## Code Explanation

- **`selectionSort(int[] array)`**:

  - This method performs the sorting by selecting the smallest element in the unsorted part of the array and swapping it with the current position in the array.

- **`print(int[] array)`**:

  - This method prints the elements of the sorted array to the console.

- **`main(String[] args)`**:
  - This is the entry point of the program. It takes user input for the array size and elements, invokes the sorting function, and prints the sorted array.

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
- It then applies the **Selection Sort** algorithm:
  - Iteration 1: Finds 11 as the minimum and swaps it with 64, resulting in `[11, 25, 12, 22, 64]`.
  - Iteration 2: Finds 12 as the minimum and swaps it with 25, resulting in `[11, 12, 25, 22, 64]`.
  - Iteration 3: Finds 22 as the minimum and swaps it with 25, resulting in `[11, 12, 22, 25, 64]`.
  - Iteration 4: 64 is already the largest, so no swap is needed.
- Finally, the program displays the sorted array: `[11, 12, 22, 25, 64]`.
