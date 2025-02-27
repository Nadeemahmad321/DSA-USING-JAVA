package PATTERNS.NUMBER_PYRAMID;  
import java.util.Scanner; // Importing Scanner class to take input from the user

public class NumberPyramid {

    // Method to print the number pyramid pattern
    static void numberPyramid(int row) {
        
        // Loop for the rows of the pyramid
        for (int i = 1; i <= row; i++) {
            
            // Loop for printing spaces before the numbers
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            
            // Loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(i); // Print the current row number
                System.out.print(" "); // Add space between numbers
            }
            
            // Move to the next line after printing each row
            System.out.println();
        }
    }

    // Main method to take user input and call the method to print the pyramid
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
        
        // Prompt the user to enter the number of rows for the pyramid
        System.out.print("Enter the number of rows: ");
        
        // Read the input for the number of rows
        int row = sc.nextInt();
        
        // Call the numberPyramid method with the user input to print the pyramid
        numberPyramid(row);
        
        // Close the scanner to avoid resource leaks
        sc.close();
    }
}
