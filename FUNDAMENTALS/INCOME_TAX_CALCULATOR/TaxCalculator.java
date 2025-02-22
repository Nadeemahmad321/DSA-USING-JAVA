// Package declaration to organize classes into a specific package for income tax calculations
package FUNDAMENTALS.INCOME_TAX_CALCULATOR;

// Importing the Scanner class to read user input from the console
import java.util.Scanner;

public class TaxCalculator {

    // The main method where program execution begins
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input their income
        System.out.print("Enter your income: ");
        
        // Read the income entered by the user (as an integer)
        int income = sc.nextInt();
        
        // Initialize a variable to store the tax amount, starting with 0
        int tax = 0;

        // If the income is less than 5,00,000, there is no tax
        if (income < 500000) {
            System.out.print("You do not pay any tax amount.");
        }
        // If the income is between 5,00,000 and 10,00,000 (inclusive), tax rate is 20%
        else if (income >= 500000 && income <= 1000000) {
            // Calculate 20% tax (multiply income by 20, then divide by 100)
            tax = (20 * income) / 100; // This gives 20% of the income
            System.out.print("You need to pay 20% tax amount: " + tax);
        }
        // If the income is greater than 10,00,000, tax rate is 30%
        else if (income > 1000000) {
            // Calculate 30% tax (multiply income by 30, then divide by 100)
            tax = (30 * income) / 100; // This gives 30% of the income
            System.out.print("You need to pay 30% tax amount: " + tax);
        }
        
        // Close the scanner object to free up resources once input is taken
        sc.close();
    }
}
