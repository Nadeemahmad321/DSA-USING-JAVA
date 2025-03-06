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
