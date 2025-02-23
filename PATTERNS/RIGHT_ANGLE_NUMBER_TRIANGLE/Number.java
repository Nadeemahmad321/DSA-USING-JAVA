package PATTERNS.RIGHT_ANGLE_NUMBER_TRIANGLE;
import java.util.Scanner;

public class Number {
    public static void main(String[] args){
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the number of rows for the pattern
        System.out.print("Enter the number of rows for the pattern: ");
        int row = sc.nextInt();  // Read the number of rows from the user
        
        // Outer loop to control the number of rows
        for (int i = 1; i <= row; i++) {
            // Inner loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);  // Print numbers from 1 to i
            }
            // Move to the next line after printing numbers for each row
            System.out.println();
        }
        
        // Close the scanner object to prevent resource leakage
        sc.close();
    }
}
