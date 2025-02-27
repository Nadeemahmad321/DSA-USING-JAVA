package ARRAYS.POSSIBLE_PAIR;
import java.util.Scanner;

public class PossiblePair {
    
    // Method to generate all possible pairs of elements from the array
    static void possiblePair(int array[]) {
        // Outer loop runs from the first element to the second last element
        for (int i = 0; i < array.length - 1; i++) {
            
            // Inner loop starts from the element after the current element in the outer loop
            for (int j = i + 1; j < array.length; j++) {
                // Prints the pair in the form of (array[i], array[j])
                System.out.print("(" + array[i] + "," + array[j] + ")");
            }
            // Print a new line after printing all pairs of one element with others
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        // Declare the array based on the user-provided size
        int[] array = new int[size];
        
        // Ask the user to input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            // Read each element and store it in the array
            array[i] = sc.nextInt();
        }
        
        // Call the possiblePair method to print all possible pairs of elements
        possiblePair(array);
        
        // Close the scanner to avoid memory leaks
        sc.close();
    }
}
