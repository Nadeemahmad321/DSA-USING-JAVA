// Package for converting Decimal to Binary
package FUNDAMENTALS.DECIMAL_TO_BINARY;

import java.util.Scanner;

public class DecimalToBinary {

    // Method to convert a decimal number to binary
    static int decimalToBinary(int dNumber) {
        int ans = 0; // Variable to store the binary result
        int i = 0; // Variable to keep track of the position (power of 10) for binary digits
        // While the decimal number is not zero
        while (dNumber != 0) {
            int rem = dNumber % 2; // Find the remainder when divided by 2 (binary digit)
            ans = ans + rem * (int)(Math.pow(10, i)); // Add the binary digit to the result at the correct position
            dNumber /= 2; // Divide the decimal number by 2 to move to the next digit
            i++; // Increment the position for the next binary digit
        }
        return ans; // Return the final binary number
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Asking the user to enter a decimal number
        System.out.print("Enter the decimal number: ");
        int dNumber = sc.nextInt(); // Read the decimal number entered by the user
        
        // Call the decimalToBinary method to convert the decimal to binary
        int ans = decimalToBinary(dNumber);
        
        // Print the binary result
        System.out.print("The binary equivalent is: " + ans);
        
        // Close the scanner to prevent resource leak
        sc.close();
    }
}
