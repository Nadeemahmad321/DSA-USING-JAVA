package FIND_MAX_OF_3_NUMBER;  // Package name is fine; using uppercase letters is generally not recommended for package names (lowercase preferred)

import java.util.Scanner;  // Import Scanner class to get user input from console

public class Maximum {  // Class name "Maximum" is correctly capitalized according to Java conventions.
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to input the first number
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();  // Read the first number from the user
        
        // Prompt user to input the second number
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();  // Read the second number from the user
        
        // Prompt user to input the third number
        System.out.print("Enter the third number: ");
        int thirdNumber = sc.nextInt();  // Read the third number from the user
        
        // Compare the numbers to determine the largest one
        if (firstNumber > secondNumber) {  // Check if first number is greater than second number
            if (firstNumber > thirdNumber) {  // Check if first number is also greater than the third number
                System.out.print("First number is greater.");  // If true, first number is the greatest
            } else {  // If false, third number is greater
                System.out.print("Third number is greater.");
            }
        } else {  // If the second number is greater than or equal to the first
            if (secondNumber > thirdNumber) {  // Check if second number is greater than third number
                System.out.print("Second number is greater.");  // If true, second number is the greatest
            } else {  // If false, third number is greater
                System.out.print("Third number is greater.");
            }
        }
        
        // Close the scanner object to free up resources
        sc.close();
    }
}
