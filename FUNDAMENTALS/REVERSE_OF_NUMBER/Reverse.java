package FUNDAMENTALS.REVERSE_OF_NUMBER;  

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();  // Store the number entered by the user

        // Use a while loop to reverse the number
        while (number != 0) {
            // Get the last digit of the number (remainder when divided by 10)
            int rem = number % 10;

            // Remove the last digit from the number by dividing by 10
            number /= 10;

            // Print the remainder (last digit) to form the reversed number
            System.out.print(rem);
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
