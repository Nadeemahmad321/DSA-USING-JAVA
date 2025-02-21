package FUNDAMENTALS.SIMPLE_INTEREST; 

import java.util.Scanner; 

public class SimpleInterest {  // Class name corrected to follow the Java naming convention (capitalized)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a scanner object to get user input
        
        // Asking the user to input the principal amount
        System.out.print("Enter the principal value: "); // Corrected spelling of "principal"
        int principal = sc.nextInt();  // Store the entered principal amount
        
        // Asking the user to input the rate of interest
        System.out.print("Enter the rate: ");
        int rate = sc.nextInt();  // Store the entered rate
        
        // Asking the user to input the time period
        System.out.print("Enter the time: ");
        int time = sc.nextInt();  // Store the entered time
        
        // Calculate the simple interest using the formula: Simple Interest = (Principal * Rate * Time) / 100
        int simpleInterest = (principal * rate * time) / 100;
        
        // Display the calculated simple interest
        System.out.print("Simple interest: " + simpleInterest);
        
        sc.close();  // Close the scanner object to prevent resource leak
    }
}
