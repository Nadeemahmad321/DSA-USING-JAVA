package FUNDAMENTALS.AREA_OF_CIRCLE;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat();  // Read the radius of the circle from the user input

        // Define the value of pi
        double pi = 3.14159;  // Using double for more accuracy instead of float

        // Calculate the area of the circle using the formula: area = pi * radius^2
        double area = pi * radius * radius;

        // Output the calculated area of the circle
        System.out.println("Area of the circle is: " + area);

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
