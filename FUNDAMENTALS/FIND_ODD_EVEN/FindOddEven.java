// Package declaration for organizing related classes
package FUNDAMENTALS.FIND_ODD_EVEN;

// Importing the Scanner class to read input from the user
import java.util.Scanner;

// Class to find whether a number is odd or even
public class FindOddEven {

    // Method to check if a number is odd or even
    static void isOddOrEven(int number) {
        // If the number is divisible by 2 with no remainder, it's even
        if (number % 2 == 0) {
            System.out.print(number + " is even");
        } else {
            // If it's not divisible by 2, it's odd
            System.out.print(number + " is odd");
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the number you want to check: ");
        
        // Read the integer input from the user
        int number = sc.nextInt();
        
        // Call the method to check if the number is odd or even
        isOddOrEven(number);
        
        // Close the scanner to prevent resource leak
        sc.close();
    }
}
