package PATTERNS.SQUARE_PATTERN;  

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the square pattern
        System.out.print("Enter the size: ");
        int size = scanner.nextInt(); // Store the size entered by the user

        // Outer loop to print each row of the square
        for (int i = 0; i < size; i++) {
            // Inner loop to print the stars in each column of the current row
            for (int j = 0; j < size; j++) {
                // Print a star followed by a space for each column
                System.out.print("* ");
            }
            // After printing all columns, move to the next line (new row)
            System.out.println();
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

