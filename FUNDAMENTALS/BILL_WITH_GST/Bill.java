package FUNDAMENTALS.BILL_WITH_GST;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the cost of the pencil
        System.out.print("Enter the cost of pencil: ");
        float pencilCost = sc.nextFloat();

        // Prompt the user to enter the cost of the pen
        System.out.print("Enter the cost of pen: ");
        float penCost = sc.nextFloat();  // Renamed variable to penCost for consistency

        // Prompt the user to enter the cost of the eraser
        System.out.print("Enter the cost of eraser: ");
        float eraserCost = sc.nextFloat();  // Renamed variable to eraserCost for clarity

        // Calculate the total cost without GST
        float totalCostWithoutGst = pencilCost + penCost + eraserCost;

        // Calculate the GST (18% of total cost without GST)
        float gst = (18 / 100f) * totalCostWithoutGst;

        // Calculate the total cost with GST added
        float totalCostWithGst = totalCostWithoutGst + gst;

        // Output the total cost including GST
        System.out.println("Total cost (with 18% GST): " + totalCostWithGst);

        // Close the scanner object to free resources
        sc.close();
    }
}

