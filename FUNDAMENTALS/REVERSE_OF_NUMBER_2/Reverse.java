package FUNDAMENTALS.REVERSE_OF_NUMBER_2; 

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();  // Store the number entered by the user

        // Initialize a variable to store the reversed number
        int rev = 0;

        // Use a while loop to reverse the digits of the number
        while (number != 0) {
            // Extract the last digit of the number
            int lastDigit = number % 10;

            // Add the last digit to the reversed number (shift digits to the left)
            rev = (rev * 10) + lastDigit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Print the reversed number
        System.out.print("Reverse: " + rev);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

