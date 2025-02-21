package FUNDAMENTALS.SUM_OF_TWO_NUMBER;

import java.util.Scanner; // Importing Scanner class to handle user input

public class Sum {
    public static void main(String[] args) {
        // Creating an instance of the Scanner class to read user input
        Scanner Sc = new Scanner(System.in);
        
        // Prompting the user to enter the first number
        System.out.print("Enter the first number: ");
        int firstNumber = Sc.nextInt(); // Reading the first number as an integer
        
        // Prompting the user to enter the second number
        System.out.print("Enter the second number: ");
        int secondNumber = Sc.nextInt(); // Reading the second number as an integer
        
        // Performing the addition and storing the result in 'sum'
        int sum = firstNumber + secondNumber;
        
        // Displaying the result
        System.out.print(firstNumber + " + " + secondNumber + " = " + sum);
        
        // Closing the Scanner object
        Sc.close();
    }
}
