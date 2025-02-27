package PATTERNS.PALINDROMIC_PATTER_WITH_NUMBER;
  
import java.util.Scanner; // Importing Scanner class for reading input from the user

public class Palindromic {

    // Method to print the Palindromic number pattern
    static void palindromicPattern(int row) {
        
        // Loop for each row of the pattern
        for (int i = 1; i <= row; i++) {
            
            // Loop to print spaces before the numbers to create the pyramid shape
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            
            // Loop to print numbers in decreasing order from 'i' to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);  // Print the number
            }
            
            // Loop to print numbers in increasing order from 2 to 'i'
            for (int j = 2; j <= i; j++) {
                System.out.print(j);  // Print the number
            }
            
            // Move to the next line after printing the row
            System.out.println();
        }
    }

    // Main method to take user input and call the function to print the pattern
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Create Scanner object to read input
        
        // Prompt the user for the number of rows in the pattern
        System.out.print("Enter the number of rows: ");  
        
        // Read the input number of rows
        int row = sc.nextInt();
        
        // Call the method to print the Palindromic pattern
        palindromicPattern(row);
        
        // Close the scanner object to free up resources
        sc.close();
    }
}
