// Package for creating a hollow rectangle pattern
package PATTERNS.HOLLOW_RECTANGLE;

import java.util.Scanner;

public class Hollow {
    
    // Method to print a hollow rectangle pattern with stars
    static void hollowStar(int row, int column) {
        // Loop through each row
        for (int i = 1; i <= row; i++) {
            // Loop through each column
            for (int j = 1; j <= column; j++) {
                // Print '*' for the border (top row, bottom row, left column, right column)
                if (i == 1 || i == row || j == 1 || j == column) {
                    System.out.print("*");
                } else {
                    // Print space for the inner part of the rectangle
                    System.out.print(" ");
                }
            }
            // Move to the next line after completing a row
            System.out.println();  
        }
    }
    
    public static void main(String[] args) {
        // Scanner object to take user input for the row and column
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        
        // Ask the user to enter the number of columns
        System.out.print("Enter the number of columns: ");
        int column = sc.nextInt();
        
        // Call the method to print the hollow rectangle pattern
        hollowStar(row, column);
        
        // Close the scanner to prevent resource leak
        sc.close();
    }
}
