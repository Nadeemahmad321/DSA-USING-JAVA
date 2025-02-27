# Diamond Pattern Program

## Overview

This program generates a diamond pattern made up of asterisks (`*`). The number of rows is provided by the user as input. The program first prints the upper half of the diamond (including the middle row), followed by the lower half.

## Features

- User can input the number of rows (height) for the diamond.
- The program prints a symmetrical diamond pattern of asterisks (`*`).
- Handles both the upper and lower halves of the diamond.

## Example Output

For an input of `5` rows, the program will generate the following diamond pattern:

```
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```

### Explanation of the Diamond Pattern

- The first half starts with a single `*` at the top and increases the number of stars by 2 for each subsequent row until the middle row is reached.
- The second half starts with the row just below the middle row, decreasing the number of stars by 2 for each subsequent row, until a single `*` appears at the bottom.

## Code Explanation

### Package Declaration

```java
package PATTERNS.DIAMOND_PATTERN;
```

- The package is named `PATTERNS.DIAMOND_PATTERN`, which is a logical grouping of the program.

### Importing Scanner

```java
import java.util.Scanner;
```

- The `Scanner` class is imported to allow the user to input the number of rows for the diamond pattern.

### Method to Print the Diamond Pattern

```java
static void diamondPattern(int row) {
    // Upper half of the diamond
    for (int i = 1; i <= row; i++) {
        // Loop for spaces before stars
        for (int j = 1; j <= row - i; j++) {
            System.out.print(" ");
        }
        // Loop for printing stars (*)
        for (int j = 1; j <= (2 * i) - 1; j++) {
            System.out.print("*");
        }
        // Move to the next line after each row
        System.out.println();
    }

    // Lower half of the diamond
    for (int i = row - 1; i >= 1; i--) {
        // Loop for spaces before stars
        for (int j = 1; j <= row - i; j++) {
            System.out.print(" ");
        }
        // Loop for printing stars (*)
        for (int j = 1; j <= (2 * i) - 1; j++) {
            System.out.print("*");
        }
        // Move to the next line after each row
        System.out.println();
    }
}
```

- This method prints the diamond pattern.
  - **Upper half:** Starts from `i=1` and goes up to `i=row`. For each `i`, it prints `row-i` spaces, followed by `(2*i)-1` stars (`*`).
  - **Lower half:** Starts from `i=row-1` and goes down to `i=1`. For each `i`, it prints `row-i` spaces, followed by `(2*i)-1` stars (`*`).

### Main Method

```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Create Scanner object to read user input
    System.out.print("Enter the number of rows: "); // Ask the user for input
    int row = sc.nextInt(); // Read the input (number of rows)
    diamondPattern(row); // Call the diamondPattern method to print the pattern
    sc.close(); // Close the scanner to avoid resource leak
}
```

- The main method initializes a `Scanner` object to take input from the user for the number of rows (`row`) and calls the `diamondPattern(row)` method to display the pattern.
- Finally, it closes the `Scanner` object to prevent memory leaks.

## How to Run the Program

1. **Clone the Repository** (if it's hosted on GitHub):

   ```bash
   git clone https://github.com/yourusername/diamond-pattern.git
   ```

2. **Navigate to the Project Directory**:

   ```bash
   cd diamond-pattern
   ```

3. **Compile the Java Program**:

   ```bash
   javac DiamondPattern.java
   ```

4. **Run the Program**:

   ```bash
   java DiamondPattern
   ```

5. **Enter the number of rows when prompted**.

## Example Run

### Input:

```
Enter the number of rows: 5
```

### Output:

```
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```

## Explanation of Example

1. The program asks the user to input the number of rows for the diamond.
2. For `5` rows:
   - The first loop prints the upper half of the diamond, increasing the stars for each row.
   - The second loop prints the lower half, decreasing the stars after reaching the middle row.

## Contribution

- Feel free to fork this project and create a pull request with improvements or additional features. For example, you could modify it to accept custom characters instead of stars.
