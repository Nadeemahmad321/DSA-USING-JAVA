// Package for generating a specific number pattern in a triangle shape
package PATTERNS.TRIANGLE_01;

import java.util.Scanner;

public class Patter {

    // Method to print a triangle with alternating 1s and 0s
    static void Triangle(int rows) {
        // Outer loop to handle the rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop to handle the columns within each row
            for (int j = 1; j <= i; j++) {
                // Check if the sum of row and column index is even
                if ((i + j) % 2 == 0) {
                    // If the sum is even, print 1
                    System.out.print("1 ");
                } else {
                    // If the sum is odd, print 0
                    System.out.print("0 ");
                }
            }
            // Move to the next line after printing a row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt(); // Read the user input for rows

        // Call the Triangle method to generate the pattern
        Triangle(rows);

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}
