package PATTERNS.SOLID_RHOMBUS;  

import java.util.Scanner;

public class SolidRhombus {

    // This method generates a solid rhombus pattern.
    static void solidRhombus(int row) {
        
        // Loop through the rows to print the rhombus.
        for (int i = 1; i <= row; i++) {
            
            // Print leading spaces to create the rhombus shape.
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");  // Printing spaces before stars to align the rhombus.
            }
            
            // Print stars in each row.
            for (int j = 1; j <= row; j++) {
                System.out.print("*");  // Printing stars to form the solid part of the rhombus.
            }
            
            // Move to the next line after printing one row of the rhombus.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a scanner to take input from the user.
        Scanner sc = new Scanner(System.in);
        
        // Ask the user for the number of rows for the rhombus.
        System.out.print("Enter the number of rows: ");  
        
        // Read the number of rows input by the user.
        int row = sc.nextInt();
        
        // Call the solidRhombus method to print the pattern.
        solidRhombus(row);
        
        // Close the scanner to prevent resource leak.
        sc.close();
    }
}
