// Package for creating an inverted half-pyramid pattern with numbers
package PATTERNS.INVERTED_HALF_PYRAMID_WITH_NUMBER;

import java.util.Scanner;

public class Pattern {
    
    // Method to print an inverted half-pyramid pattern with numbers
    static void invertedHalfPyramidWithNumber(int rows) {
        // Outer loop to handle each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print numbers in each row
            for (int j = 1; j <= rows - i + 1; j++) {
                // Print the number 'j' followed by a space
                System.out.print(j);
                System.out.print(" ");
            }
            // Move to the next line after printing all numbers in the current row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input for the number of rows
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows for the pyramid
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt(); // Read the input for rows
        
        // Call the method to print the inverted half-pyramid with numbers
        invertedHalfPyramidWithNumber(rows);

        // Close the Scanner to prevent resource leaks
        sc.close();
    }
}
