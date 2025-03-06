# Matrix Operations in Java

This repository contains a simple Java program that demonstrates how to work with 2D matrices. The program allows users to input a matrix's dimensions (number of rows and columns) and the elements of the matrix, then prints the matrix in a formatted manner.

## Features

- Take user input for the number of rows and columns in the matrix.
- Take user input for the matrix elements in a row-major order.
- Display the matrix in a readable format.

## Prerequisites

- Java 8 or higher.

## Usage

1. **Clone the repository** to your local machine:

   ```bash
   git clone https://github.com/yourusername/matrix-java.git
   ```

2. **Navigate to the project directory**:

   ```bash
   cd matrix-java
   ```

3. **Compile and run the program**:

   - Open a terminal and compile the program using `javac`:
     ```bash
     javac Matrix.java
     ```
   - Run the program:
     ```bash
     java TWO_D_ARRAY.MATRIX.Matrix
     ```

4. **Input Format**:

   - The program will first ask for the number of rows and columns in the matrix.
   - Then, it will prompt you to input the elements of the matrix in a row-major order.

5. **Output Format**:
   - The program will print the entered matrix in a formatted manner with each row on a new line.

### Example Run

```
Enter the number of rows: 2
Enter the number of columns: 3
Enter the elements of the matrix row by row:
1 2 3
4 5 6

The entered matrix is:
1 2 3
4 5 6
```

### Code Explanation

#### `Matrix` Class

The `Matrix` class contains:

1. **`printMatrix(int[][] matrix, int row, int column)`**:

   - This method is responsible for printing the 2D matrix in a readable format. It iterates over each row and column and prints the elements.

2. **`main(String[] args)`**:
   - This is the entry point of the program. It asks the user for the matrix dimensions (rows and columns) and the matrix elements.
   - It then calls the `printMatrix` method to display the matrix in a formatted way.

#### Key Concepts

- **Row-major order:** This is the way elements are input into the matrix, row by row.
- **2D Array:** A matrix in Java is represented as a 2D array, i.e., an array of arrays. Each element in the matrix is accessed using two indices: one for the row and one for the column.

### Example Code

```java
package TWO_D_ARRAY.MATRIX;

import java.util.Scanner;

public class Matrix {

    // Method to print the matrix in a readable format
    static void printMatrix(int matrix[][], int row, int column){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " "); // Print each element in a row
            }
            System.out.println(); // Print a new line after each row
        }
    }

    // Main method to read input and perform operations
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Take input for number of rows and columns in the matrix
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = sc.nextInt();

        // Declare a 2D array (matrix) with the given number of rows and columns
        int[][] matrix = new int[row][column];

        // Prompt user to enter elements of the matrix in row-major order
        System.out.println("Enter the elements of the matrix row by row:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt(); // Read matrix elements
            }
        }

        // Print the matrix using the printMatrix method
        System.out.println("The entered matrix is:");
        printMatrix(matrix, row, column);

        // Close the scanner object to prevent resource leak
        sc.close();
    }
}
```
