// Package for creating an inverted and rotated half pyramid pattern
package PATTERNS.INVERTED_AND_ROTATED_HALF_PYRAMID;

import java.util.Scanner;

public class InvertedAndRotatedHalfPyramid {

    // Method to print an inverted and rotated half-pyramid pattern
    static void invertedAndRotatedHalfPyramid(int rows) {
        // Loop to handle each row
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for the inverted and rotated effect
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars ('*') for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input for the number of rows
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt(); // Read the input for rows
        
        // Call the method to print the inverted and rotated half-pyramid pattern
        invertedAndRotatedHalfPyramid(rows);

        // Close the Scanner to avoid resource leaks
        sc.close();
    }
}
