// Package declaration to organize classes related to pass/fail checking
package FUNDAMENTALS.CHECK_PASS_OR_FAIL;

// Importing Scanner class to take input from the user
import java.util.Scanner;

public class Check {
    
    public static void main(String[] args) {
        
        // Create a Scanner object to get user input from the console
        Scanner sc = new Scanner(System.in);
        
        // Variable to control the loop; initially set to true for entering the loop
        boolean flag = true;
        
        // Start a loop to keep asking for marks until the user decides to exit
        while (flag) {
            
            // Prompt the user to enter the marks to check whether they pass or fail
            System.out.print("Enter the marks you want to check: ");
            
            // Read the marks entered by the user as an integer
            int marks = sc.nextInt();
            
            // Check if the marks are greater than or equal to 33
            if (marks >= 33) {
                // If marks are 33 or more, print "Pass"
                System.out.println("Pass");
            } else {
                // If marks are less than 33, print "Fail"
                System.out.println("Fail");
            }
            
            // Prompt the user if they want to check more marks or terminate the program
            System.out.print("Type 'y' to check more marks and 'n' to terminate: ");
            
            // Read the user's response (y for more checks, n for termination)
            String t = sc.next();
            
            // If the user types 'y', the loop continues for another round of input
            if (t.equals("y")) {
                flag = true;  // Set flag to true to continue the loop
            } else {
                // If the user types anything other than 'y', set the flag to false to exit the loop
                flag = false;
            }
        }
        
        // Close the scanner object to free up resources after use
        sc.close();
    }
}
