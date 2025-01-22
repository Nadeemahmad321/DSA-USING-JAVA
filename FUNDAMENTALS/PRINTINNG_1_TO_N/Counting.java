package FUNDAMENTALS.PRINTINNG_1_TO_N;  // Define the package name, organizing the code in a directory structure.

import java.util.Scanner;  // Import the Scanner class for taking input from the user.

public class Counting {  // Define a public class named 'Counting'.
    
    public static void main(String[] args) {  // Main method where the program execution begins.
        
        Scanner sc = new Scanner(System.in);  // Create a Scanner object 'sc' to capture input from the user.
        
        // Ask the user to enter the range they want to print.
        System.out.print("Enter the range you want to print:"); 
        
        int range = sc.nextInt();  // Capture the user input for the range and store it in the 'range' variable.
        
        System.out.print("Counting:");  // Print a prompt indicating that the counting will begin.
        
        // Loop from 0 to the entered range, printing each number followed by a space.
        for(int i = 0; i <= range; i++) {  
            System.out.print(i);  // Print the current value of 'i'.
            System.out.print(" ");  // Print a space after each number.
        }
        sc.close();
    }
}
