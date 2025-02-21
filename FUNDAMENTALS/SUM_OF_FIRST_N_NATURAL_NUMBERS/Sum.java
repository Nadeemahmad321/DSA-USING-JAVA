package FUNDAMENTALS.SUM_OF_FIRST_N_NATURAL_NUMBERS;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input the number 'n' up to which the sum should be calculated
        System.out.print("Enter the number up to which you want to calculate the sum of natural numbers: ");
        int number = sc.nextInt();  // Store the input in the variable 'number'
        
        // Initialize the sum variable to 0
        int sum = 0;

        // Loop through all numbers from 1 to 'number'
        for (int i = 1; i <= number; i++) {
            sum += i;  // Add each number to the sum
        }

        // Output the result, showing the sum of the first 'number' natural numbers
        System.out.println("The sum of the first " + number + " natural numbers is: " + sum);
        
        // Close the scanner object to prevent resource leaks
        sc.close();
    }
}
