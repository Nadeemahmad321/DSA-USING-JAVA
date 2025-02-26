package PATTERNS.BUTTERFLY_PATTERN; 

import java.util.Scanner;

public class Butterfly {
    
    // This method generates the butterfly pattern
    static void butterfly(int row, int column) {
        
        // First part: top half of the butterfly
        for (int i = 1; i <= row; i++) {  // Loop through the rows for the upper half
            for (int j = 1; j <= i; j++) {  // Print stars for the first half
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (row - i); j++) {  // Print spaces in the middle
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {  // Print stars for the second half
                System.out.print("*");
            }
            System.out.println();  // Move to the next line
        }
        
        // Second part: bottom half of the butterfly (inverse of the top part)
        for (int i = row; i >= 1; i--) {  // Loop through the rows for the lower half
            for (int j = 1; j <= i; j++) {  // Print stars for the first half
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (row - i); j++) {  // Print spaces in the middle
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {  // Print stars for the second half
                System.out.print("*");
            }
            System.out.println();  // Move to the next line
        }
    }

    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to input the number of rows
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();  // Read the number of rows for the pattern
        
        // The column variable is unused, so it can be removed. But keeping it for now to match the original code.
        System.out.print("Enter the number of columns: ");
        int column = sc.nextInt();  // Read the number of columns (not actually used)
        
        // Call the butterfly method with the row and column values
        butterfly(row, column);
        
        // Close the scanner
        sc.close();
    }
}
