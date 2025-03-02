package ARRAYS.TRAPPING_RAINWATER;

import java.util.Scanner;

public class TrappingRainwater {

    // Function to calculate the total amount of trapped rainwater
    static int trappingRainWater(int height[]) {
        // Variable to store the total trapped water
        int trappedWater = 0;

        // Array to store the maximum height encountered from the left up to each index
        int[] leftMax = new int[height.length];
        leftMax[0] = height[0]; // The first element's left max is the element itself
        // Fill the leftMax array by finding the maximum height from the left for each position
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Array to store the maximum height encountered from the right up to each index
        int[] rightMax = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1]; // The last element's right max is the element itself
        // Fill the rightMax array by finding the maximum height from the right for each position
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Calculate the trapped water for each index by finding the minimum of leftMax and rightMax
        // and subtracting the height at that index from it.
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]); // The water level is the minimum of left and right max heights
            trappedWater += waterLevel - height[i]; // Trapped water is the difference between the water level and the current height
        }

        // Return the total trapped water
        return trappedWater;
    }

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to input the size of the height array
        System.out.print("Enter the size of height:");
        int size = sc.nextInt();

        // Create an array to store the height values
        int[] height = new int[size];

        // Prompt the user to input the height values
        System.out.print("Enter the element of height:");
        for (int i = 0; i < size; i++) {
            height[i] = sc.nextInt(); // Read each height value from the user
        }

        // Call the trappingRainWater function to calculate the trapped water
        int trappedWater = trappingRainWater(height);

        // Print the total amount of trapped water
        System.out.print("Trapped water:" + trappedWater);
        
        // Close the scanner object to avoid resource leaks
        sc.close();
    }
}
