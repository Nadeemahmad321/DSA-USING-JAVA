package FUNDAMENTALS.IS_PRIME;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Start a loop for multiple prime checks
        boolean primeCheck = true;  // Flag to control the loop
        while(primeCheck){
            System.out.print("Enter the number: ");
            int number = sc.nextInt();  // Read the number to check
            
            // Assume the number is prime initially
            boolean isPrime = true;
            
            // Check divisibility from 2 to number-1
            for(int i = 2; i < number; i++){
                if(number % i == 0){
                    isPrime = false;  // If divisible, it's not prime
                    break;
                }
            }
            
            // Output whether the number is prime or not
            if(isPrime && number > 1){  // Numbers less than or equal to 1 are not prime
                System.out.println(number + " is prime.");
            } else if (number <= 1) {
                System.out.println(number + " is not prime."); // Numbers less than or equal to 1 are not prime
            } else {
                System.out.println(number + " is not prime.");
            }
            
            // Ask the user if they want to check another number
            System.out.print("Type 'y' for more checking and 'n' for termination: ");
            String character = sc.next();
            
            // Compare user input using .equals() method
            if(character.equals("y")){
                primeCheck = true;  // Continue checking
            } else if(character.equals("n")) {
                primeCheck = false;  // Terminate the loop
            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        }
        
        // Close the scanner object to prevent resource leakage
        sc.close();
    }
}
