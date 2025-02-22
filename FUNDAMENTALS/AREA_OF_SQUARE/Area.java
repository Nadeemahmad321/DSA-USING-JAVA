package FUNDAMENTALS.AREA_OF_SQUARE;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the side length of the square
        System.out.print("Enter the side of the square: ");
        
        // Read the side length of the square as a float (decimal value is allowed)
        float side = sc.nextFloat();  // Changed to nextFloat() to allow decimal values

        // Calculate the area of the square using the formula: area = side * side
        float area = side * side;

        // Display the area of the square
        System.out.println("Area of square: " + area);  // Used println for better formatting of the output
        
        // Close the scanner to free resources
        sc.close();
    }
}
