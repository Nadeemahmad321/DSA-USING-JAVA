package PATTERNS.RIGHT_ANGLE_TRIANGLE_PATTERN;
import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args){
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the size or number of rows for the pattern
        System.out.print("Enter the number of rows for the pattern: ");
        int row = sc.nextInt();  // Read the number of rows from the user
        
        // Outer loop to iterate through each row
        for(int i = 0; i < row; i++){
            // Inner loop to print stars in each row
            for(int j = 0; j <= i; j++){
                System.out.print("* ");  // Print a star and a space after it
            }
            // Move to the next line after printing stars in each row
            System.out.println();
        }
        
        // Close the scanner object to prevent resource leakage
        sc.close();
    }
}

