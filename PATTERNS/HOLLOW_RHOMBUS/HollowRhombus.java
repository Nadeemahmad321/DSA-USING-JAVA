package PATTERNS.HOLLOW_RHOMBUS;  

import java.util.Scanner;

public class HollowRhombus {

    // This method generates a hollow rhombus pattern.
    static void hollowRhombus(int row) {
        
        // Outer loop: iterating through the rows of the rhombus
        for (int i = 1; i <= row; i++) {
            
            // Print leading spaces for alignment
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");  // Printing spaces to create the rhombus shape.
            }
            
            // Inner loop: iterating through the columns of each row
            for (int j = 1; j <= row; j++) {
                
                // Print stars at the borders (first and last row, and first and last column)
                if (i == 1 || j == 1 || i == row || j == row) {
                    System.out.print("*");  // Printing stars on the border.
                } else {
                    System.out.print(" ");  // Printing spaces in the middle (hollow part).
                }
            }
            
            // Move to the next line after completing a row of the rhombus
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a scanner to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter the number of rows for the hollow rhombus
        System.out.print("Enter the number of rows: ");  
        // Read the number of rows from the user input
        int row = sc.nextInt();
        
        // Call the hollowRhombus method to print the pattern
        hollowRhombus(row);
        
        // Close the scanner to prevent resource leak
        sc.close();
    }
}
