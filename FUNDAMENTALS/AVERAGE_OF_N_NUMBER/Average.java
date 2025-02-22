package FUNDAMENTALS.AVERAGE_OF_N_NUMBER;
import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter how many numbers they want to calculate the average for
        System.out.print("Enter the number of values to calculate the average: ");
        int N = sc.nextInt(); // Read the total number of values (N)

        int number;  // Variable to store each individual number
        int sum = 0; // Variable to store the sum of the numbers

        // Loop through N times to take N numbers from the user
        for(int i = 1; i <= N; i++){
            System.out.print("Enter the " + i + " number: ");
            number = sc.nextInt(); // Read the current number
            sum += number;  // Add the current number to the sum
        }

        // Calculate the average. Cast sum to double to ensure accurate division.
        double average = (double) sum / N;  // This ensures that the result is a decimal if necessary

        // Output the calculated average
        System.out.println("The average of the " + N + " numbers is: " + average);

        // Close the scanner to free resources
        sc.close();
    }
}

