# Palindromic Pattern with Numbers Program

## Overview

The **Palindromic Pattern with Numbers** program generates a pyramid-shaped pattern using numbers, with each row forming a palindrome. The number of rows is provided by the user as input. Each row contains a sequence of numbers that decrease from the row number to 1 and then increase back to the row number, creating a symmetric (palindromic) structure.

## Features

- Takes input from the user for the number of rows.
- Prints a pyramid pattern with numbers.
- The numbers in each row form a palindrome.
- The pyramid is aligned properly with spaces for centering.

## Example Output

For an input of `5` rows, the output will look like this:

```
    1
   212
  32123
 4321234
543212345
```

### Explanation:

- **First Row:** The number `1`.
- **Second Row:** The numbers `2 1 2`.
- **Third Row:** The numbers `3 2 1 2 3`.
- **Fourth Row:** The numbers `4 3 2 1 2 3 4`.
- **Fifth Row:** The numbers `5 4 3 2 1 2 3 4 5`.

The numbers in each row start from the row number and decrease down to 1, then increase back to the row number.

## Code Explanation

### 1. Package Declaration

```java
package PATTERNS.PALINDROMIC_PATTERN_WITH_NUMBER;
```

- The program belongs to the package `PATTERNS.PALINDROMIC_PATTERN_WITH_NUMBER`.

### 2. Importing Scanner for User Input

```java
import java.util.Scanner;
```

- The `Scanner` class is imported to allow the program to take user input from the console.

### 3. Method to Print the Palindromic Pattern

```java
static void palindromicPattern(int row) {
    for (int i = 1; i <= row; i++) {
        // Loop for printing spaces before the numbers in each row
        for (int j = 1; j <= row - i; j++) {
            System.out.print(" ");  // Printing spaces for alignment
        }

        // Loop to print decreasing numbers (left side of the palindrome)
        for (int j = i; j >= 1; j--) {
            System.out.print(j);  // Print the number decreasing from i to 1
        }

        // Loop to print increasing numbers (right side of the palindrome)
        for (int j = 2; j <= i; j++) {
            System.out.print(j);  // Print the number increasing from 2 to i
        }

        // Move to the next line after completing the current row
        System.out.println();
    }
}
```

- **First Loop:** Prints spaces to ensure the pyramid is centered.
- **Second Loop:** Prints the decreasing numbers from the current row number (`i`) to `1` on the left side of the palindrome.
- **Third Loop:** Prints the increasing numbers from `2` to the current row number (`i`) on the right side, completing the palindromic structure.
- **Line Break:** After each row is printed, `System.out.println()` moves the cursor to the next line.

### 4. Main Method

```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
    System.out.print("Enter the number of rows: "); // Prompt the user for input
    int row = sc.nextInt(); // Read the number of rows
    palindromicPattern(row); // Call the palindromicPattern method to print the pattern
    sc.close(); // Close the scanner to prevent memory leaks
}
```

- The `Scanner` object is used to read the number of rows (`row`) from the user.
- The method `palindromicPattern(row)` is called to print the pattern based on the user input.
- The scanner is closed using `sc.close()` to avoid memory leaks.

## How to Run the Program

### Prerequisites

- Ensure that Java is installed on your machine.

### Steps to Run the Program

1. **Clone the Repository** (if the project is hosted on GitHub):

   ```bash
   git clone https://github.com/yourusername/palindromic-pattern.git
   ```

2. **Navigate to the Project Directory**:

   ```bash
   cd palindromic-pattern
   ```

3. **Compile the Java Program**:

   - Compile the Java program using the `javac` command:

   ```bash
   javac Palindromic.java
   ```

4. **Run the Program**:

   - Run the compiled Java program:

   ```bash
   java Palindromic
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
   212
  32123
 4321234
543212345
```

### Explanation:

1. **First Row:**
   - 4 spaces, then the number `1`.
2. **Second Row:**
   - 3 spaces, then the numbers `2 1 2`.
3. **Third Row:**
   - 2 spaces, then the numbers `3 2 1 2 3`.
4. **Fourth Row:**
   - 1 space, then the numbers `4 3 2 1 2 3 4`.
5. **Fifth Row:**
   - 0 spaces, then the numbers `5 4 3 2 1 2 3 4 5`.

### How the Program Works:

- The `for` loop with `i` determines the current row.
- The second and third loops create the palindrome pattern by printing numbers first in decreasing order and then in increasing order.
- The spaces before the numbers keep the pyramid centered.
