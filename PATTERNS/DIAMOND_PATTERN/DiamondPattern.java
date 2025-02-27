package PATTERNS.DIAMOND_PATTERN; 
import java.util.Scanner; // Importing Scanner class to take user input

public class DiamondPattern {
    
    // Method to print diamond pattern with the given number of rows
    static void diamondPattern(int row) {
        
        // Loop for the upper half of the diamond (including the middle row)
        for (int i = 1; i <= row; i++) {
            // Loop for printing spaces before the stars
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // Loop for printing stars (*)
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
        
        // Loop for the lower half of the diamond (excluding the middle row)
        for (int i = row - 1; i >= 1; i--) {
            // Loop for printing spaces before the stars
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // Loop for printing stars (*)
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }

    // Main method to take input from the user and call the method to print the pattern
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to take user input
        System.out.print("Enter the number of rows: "); // Prompt the user for the number of rows
        int row = sc.nextInt(); // Read the number of rows from the user
        diamondPattern(row); // Call the diamondPattern method with the user input
        sc.close(); // Close the Scanner object to avoid memory leaks
    }
}
