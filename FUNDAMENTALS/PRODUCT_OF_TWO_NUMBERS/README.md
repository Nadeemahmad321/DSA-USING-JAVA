# Product of Two Numbers

This Java program calculates and displays the product of two numbers entered by the user. The program multiplies the two input values and prints the result in a simple and easy-to-understand format.

## Overview

The program prompts the user to input two numbers, computes their product, and displays the result in the form of an equation (e.g., `a * b = product`). It demonstrates basic input and output handling, as well as arithmetic operations in Java.

## Features

- Accepts two integer inputs from the user.
- Computes the product of the two numbers.
- Outputs the result in the format: `firstNumber * secondNumber = product`.
- Easy-to-understand code structure.

## How to Run the Program

### Prerequisites:

- Java Development Kit (JDK) installed on your machine.

### Steps:

1. Clone or download the repository containing the `Prod.java` file.
2. Open a terminal or command prompt.
3. Navigate to the directory where the `Prod.java` file is located.
4. Compile the Java file:
   ```bash
   javac Prod.java
   ```
5. Run the compiled Java program:
   ```bash
   java Prod
   ```

### Example Usage:

When you run the program, you will be prompted to enter two numbers. After entering the numbers, the program will calculate and display their product.

Example:

```
Enter the first number: 4
Enter the second number: 5
4 * 5 = 20
```

In this case:

- The user inputs `4` and `5`.
- The program multiplies `4` and `5` and outputs the result: `4 * 5 = 20`.

## Code Structure

- **`Scanner sc = new Scanner(System.in);`**: Creates a `Scanner` object to take input from the user.
- **Input Handling**: The program uses `sc.nextInt()` to read two integer inputs (first and second numbers).
- **Product Calculation**: The program calculates the product by multiplying the two input numbers.
- **Output**: The program prints the product in the form: `firstNumber * secondNumber = product`.
- **`sc.close();`**: Closes the scanner to release system resources after use.
