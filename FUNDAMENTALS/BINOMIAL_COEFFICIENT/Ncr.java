package FUNDAMENTALS.BINOMIAL_COEFFICIENT;

import java.util.Scanner;

public class Ncr {

    // Method to calculate the factorial of a number
    static int factorial(int x) {
        int fact = 1;
        // Loop to calculate factorial (fact = x * (x-1) * (x-2) * ... * 1)
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;  // Return the calculated factorial
    }

    // Method to calculate nCr (Binomial Coefficient)
    static int nCr(int n, int r) {
        // Calculate the factorial of n, r, and (n-r)
        int nFact = factorial(n);
        int rFact = factorial(r);
        int denominator = rFact * factorial(n - r); // Calculate the denominator (r! * (n-r)!)
        
        // nCr formula: nCr = n! / (r! * (n-r)!)
        int nCrResult = nFact / denominator;
        return nCrResult;  // Return the result of nCr
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Print a message reminding the user that n should be greater than or equal to r
        System.out.println("The value of n must be greater than or equal to r!");
        
        // Prompt the user to input the value of n (the total number of elements)
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Prompt the user to input the value of r (the number of elements to choose)
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();

        // Calculate nCr using the nCr method
        int nCrResult = nCr(n, r);

        // Output the result of the calculation
        System.out.println("The value of " + n + "C" + r + " is: " + nCrResult);

        // Close the scanner object to prevent memory leaks
        sc.close();
    }
}
