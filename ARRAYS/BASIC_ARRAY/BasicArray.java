package ARRAYS.BASIC_ARRAY;
import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args){
         // Create a Scanner object to read user input
         Scanner sc = new Scanner(System.in);
        
         // Prompt the user to enter the size of the array
         System.out.print("Enter the size of the array: ");
         int size = sc.nextInt();  // Read the size as an integer
         
         // Create an array with the user-provided size
         int[] array = new int[size];
         
         // Prompt the user to enter the elements of the array
         System.out.println("Enter " + size + " elements:");
         for (int i = 0; i < size; i++) {
             array[i] = sc.nextInt();  // Read each element of the array
         }
         
         // Display the entered elements
         System.out.println("The entered array is:");
         for (int i = 0; i < size; i++) {
             System.out.print(array[i] + " ");
         }
         
         // Close the scanner
         sc.close();
    }
}
