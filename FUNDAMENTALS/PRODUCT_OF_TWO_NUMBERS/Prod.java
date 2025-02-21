package FUNDAMENTALS.PRODUCT_OF_TWO_NUMBERS;
import java.util.Scanner;

public class Prod {
    public static void main(String[] args){
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();  // Read the first number and store it in 'firstNumber'

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();  // Read the second number and store it in 'secondNumber'

        // Calculate the product of the two numbers
        int product = firstNumber * secondNumber;  // Multiply the two numbers

        // Output the result in the format: firstNumber * secondNumber = product
        System.out.print(firstNumber + " * " + secondNumber + " = " + product);

        // Close the scanner object to prevent resource leaks
        sc.close();
    }
}

