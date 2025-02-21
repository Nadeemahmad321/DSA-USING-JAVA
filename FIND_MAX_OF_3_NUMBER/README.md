# Find Maximum of 3 Numbers

This Java program takes three numbers as input from the user and determines which one is the greatest. It then outputs the greatest number.

## Overview

The program compares three numbers entered by the user and outputs which number is greater, or if two or more numbers are equal. It uses conditional statements (`if-else`) to compare the values and prints the result accordingly.

## Features

- Accepts three integer inputs from the user.
- Compares the three numbers to find the greatest one.
- Outputs the greatest number with a message indicating which number is the largest.

## How to Run the Program

### Prerequisites:

- Java Development Kit (JDK) installed on your machine.

### Steps:

1. Clone or download the repository.
2. Open a terminal or command prompt.
3. Navigate to the directory where the `Maximum.java` file is located.
4. Compile the Java file:
   ```bash
   javac Maximum.java
   ```
5. Run the compiled Java program:
   ```bash
   java Maximum
   ```

### Example Usage:

When you run the program, you will be prompted to input three numbers. The program will then compare the numbers and display the greatest one.

Example:

```
Enter the first number: 12
Enter the second number: 25
Enter the third number: 19
Second number is greater.
```

In this case, the program compares the numbers and outputs that the second number (`25`) is the greatest.

## Code Structure

- **`Scanner sc = new Scanner(System.in);`**: Creates a `Scanner` object to take input from the user.
- **`int firstNumber = sc.nextInt();`**: Accepts the first number from the user.
- **`int secondNumber = sc.nextInt();`**: Accepts the second number from the user.
- **`int thirdNumber = sc.nextInt();`**: Accepts the third number from the user.
- **Comparison Logic**: The program uses a series of `if-else` statements to compare the numbers and prints which one is the largest.
  - The program checks if the first number is greater than the second and third, and similarly for the second and third numbers.
- **`sc.close();`**: Closes the `Scanner` object to release resources after use.
