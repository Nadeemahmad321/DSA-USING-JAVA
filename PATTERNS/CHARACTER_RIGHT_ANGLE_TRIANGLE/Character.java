package PATTERNS.CHARACTER_RIGHT_ANGLE_TRIANGLE;

import java.util.Scanner;

public class Character {
    public static void main(String[] args){
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        
        // Initialize the starting letter to 'A'
        char letter = 'A';
        
        // Outer loop for each row (from 0 to row-1)
        for(int i = 0; i < row; i++){
            // Inner loop for printing the characters in each row
            for(int j = 0; j <= i; j++){
                // Print the current letter and increment it to the next letter
                System.out.print(letter);
                letter++;  // Move to the next letter in the alphabet
            }
            
            // Move to the next line after printing the characters for the current row
            System.out.println();
        }
        
        // Close the scanner object
        sc.close();
    }
}
