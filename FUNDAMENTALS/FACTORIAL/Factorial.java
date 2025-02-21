package FUNDAMENTALS.FACTORIAL;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        // Create a scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Asking user for input
        System.out.print("Enter the number you want: ");
        int number = sc.nextInt();  // Read the number entered by the user
        
        // Initialize factorial as 1 (since factorial of 0 is 1)
        int fact = 1;
        
        // Loop to calculate factorial
        for(int i = 1; i <= number; i++){
            fact *= i;  // Multiply current fact by the counter i
        }
        
        // Print the result
        System.out.println("Factorial of " + number + " is: " + fact);
        
        // Close the scanner
        sc.close();
    }
}

