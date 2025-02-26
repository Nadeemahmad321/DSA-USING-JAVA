// Package for generating Floyd's Triangle pattern
package PATTERNS.FLOYDS_TRIANGLE;

import java.util.Scanner;

public class Floyds {

    // Method to print Floyd's Triangle pattern
    static void floydTriangle(int rows) {
        int count = 1;  // Initialize a counter to keep track of the number to be printed
        
        // Outer loop to handle each row
        for (int i = 1; i <= rows; i++) {
            // First inner loop to print numbers for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(count++);  // Print the current number and increment the counter
                System.out.print(" ");  // Print a space after each number
            }

            // Second inner loop to print spaces after the numbers in the current row
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");  // Print the spaces to form the triangle's shape
            }

            // Move to the next line after printing all numbers and spaces in the current row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input for the number of rows
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the number of rows for Floyd's Triangle
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();  // Read the input for rows
        
        // Call the method to print Floyd's Triangle
        floydTriangle(rows);

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}
