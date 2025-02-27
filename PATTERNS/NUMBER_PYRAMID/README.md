# Number Pyramid Program

## Overview

The **Number Pyramid** program prints a pyramid pattern using numbers. The number of rows for the pyramid is provided by the user as input. Each row of the pyramid contains numbers equal to the row number, and the numbers are printed in a way that they form a pyramid shape. The program also handles spacing to ensure proper alignment.

## Features

- Takes input from the user for the number of rows.
- Prints a pyramid with numbers in each row.
- The numbers in each row correspond to the row number.
- The pyramid is aligned properly with spaces before the numbers in each row.

## Example Output

For an input of `5` rows, the output will look like this:

```
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
```

### Explanation:

1. The first row has one number `1`.
2. The second row has two numbers `2` with spaces before it.
3. The third row has three numbers `3`, and so on.
4. The number of spaces decreases as the row number increases to maintain the pyramid shape.

## Code Explanation

### 1. Package Declaration

```java
package PATTERNS.NUMBER_PYRAMID;
```

- The package `PATTERNS.NUMBER_PYRAMID` is used to logically group this program.

### 2. Importing Scanner for User Input

```java
import java.util.Scanner;
```

- The `Scanner` class is imported to allow the program to take user input from the console.

### 3. Method to Print the Number Pyramid

```java
static void numberPyramid(int row) {
    for (int i = 1; i <= row; i++) {
        // Loop to print spaces before the numbers in each row
        for (int j = 1; j <= row - i; j++) {
            System.out.print(" ");
        }

        // Loop to print numbers in each row
        for (int j = 1; j <= i; j++) {
            System.out.print(i); // Print the current row number
            System.out.print(" "); // Add space between numbers
        }

        System.out.println(); // Move to the next line after each row
    }
}
```

- The method `numberPyramid(int row)` prints the pyramid pattern:
  - **Spaces:** In the first inner loop, spaces are printed to align the pyramid.
  - **Numbers:** In the second inner loop, numbers corresponding to the current row (`i`) are printed. The number is repeated `i` times in each row.
  - After each row, `System.out.println()` moves to the next line to start printing the next row.

### 4. Main Method

```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
    System.out.print("Enter the number of rows: "); // Prompt the user for input
    int row = sc.nextInt(); // Read the number of rows
    numberPyramid(row); // Call the numberPyramid method to print the pyramid
    sc.close(); // Close the scanner to prevent memory leaks
}
```

- The main method initializes the `Scanner` object to take user input for the number of rows (`row`).
- The method `numberPyramid(row)` is called to print the pyramid based on the input.
- The scanner is closed after the input is read and processed.

## How to Run the Program

### Prerequisites

- Ensure that Java is installed on your machine.

### Steps to Run the Program

1. **Clone the Repository** (if the project is hosted on GitHub):

   ```bash
   git clone https://github.com/yourusername/number-pyramid.git
   ```

2. **Navigate to the Project Directory**:

   ```bash
   cd number-pyramid
   ```

3. **Compile the Java Program**:

   - Compile the Java program using the `javac` command:

   ```bash
   javac NumberPyramid.java
   ```

4. **Run the Program**:

   - Run the compiled Java program:

   ```bash
   java NumberPyramid
   ```

5. **Enter the number of rows when prompted**.

## Example Run

### Input:

```
Enter the number of rows: 5
```

### Output:

```
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
```

### Explanation:

1. The first row has one `1`, followed by spaces.
2. The second row has two `2`s with spaces before them.
3. The third row has three `3`s, and the number increases as the rows increase.
4. The program prints the pyramid with proper spacing to make the alignment symmetrical.
