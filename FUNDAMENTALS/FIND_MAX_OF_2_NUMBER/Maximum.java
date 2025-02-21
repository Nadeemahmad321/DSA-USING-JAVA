package FUNDAMENTALS.FIND_MAX_OF_2_NUMBER;
 

import java.util.Scanner;  

public class Maximum {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a scanner object to get user input
        
        // Prompt the user to input the first number
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();  // Store the first number entered by the user
        
        // Prompt the user to input the second number
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();  // Store the second number entered by the user
        
        // Check if the first number is greater than the second number
        if (firstNumber > secondNumber) {
            // If true, print the first number is greater
            System.out.print(firstNumber + " is greater than " + secondNumber);
        } else {
            // If false (second number is greater or equal), print the second number is greater
            System.out.print(secondNumber + " is greater than " + firstNumber);
        }
        
        sc.close();  // Close the scanner object to prevent resource leak
    }
}

