package FUNDAMENTALS.MULTIPLICATION;  

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number for multiplication
        System.out.print("Enter a number for multiplication: ");
        int number = scanner.nextInt(); // Store the number entered by the user

        // Loop through numbers from 1 to 10 and display the multiplication table for the entered number
        for (int i = 1; i <= 10; i++) {
            // Print the result of the multiplication
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
