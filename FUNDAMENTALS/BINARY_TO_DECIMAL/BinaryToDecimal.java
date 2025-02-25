package FUNDAMENTALS.BINARY_TO_DECIMAL;

import java.util.Scanner;

public class BinaryToDecimal {
    // Method to convert binary to decimal
    static int binaryToDecimal(int bNumber) {
        int ans = 0;  // Using integer for the result
        int i = 0;
        int lastDigit;
        
        // Loop through each digit of the binary number
        while (bNumber != 0) {
            lastDigit = bNumber % 10; // Get the last digit of the binary number
            ans = ans + lastDigit * (int) (Math.pow(2, i)); // Add the corresponding power of 2 to the result
            bNumber /= 10; // Remove the last digit from the binary number
            i++;  // Increment the power of 2
        }
        return ans;  // Return the result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt for the user to enter the binary number
        System.out.print("Enter a binary number: ");
        int bNumber = sc.nextInt();  // Read the binary number from user
        
        // Call the binaryToDecimal method and store the result
        int ans = binaryToDecimal(bNumber);  
        
        // Print the result
        System.out.println("Decimal equivalent: " + ans);
        sc.close();
    }
}
