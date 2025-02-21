# Find Maximum of 2 Numbers

This Java program takes two numbers as input from the user and determines which one is greater. It then outputs the greater number along with a message.

## Overview

This program prompts the user to enter two numbers and compares them. It then outputs which number is greater, or if both numbers are equal.

## Features

- Accepts two integer inputs from the user.
- Compares the two numbers to find the maximum.
- Outputs the greater number with a message indicating which number is greater.

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

When you run the program, you will be prompted to input the following:

1. **First number**: The first integer to compare.
2. **Second number**: The second integer to compare.

The program will then output which number is greater.

Example:

```
Enter the first number: 7
Enter the second number: 5
7 is greater than 5
```

In this case, the program compares the two numbers and outputs that `7` is greater than `5`.

## Code Structure

- **`Scanner sc = new Scanner(System.in);`**: Creates a `Scanner` object to take user inputs.
- **`int firstNumber = sc.nextInt();`**: Accepts the first number from the user.
- **`int secondNumber = sc.nextInt();`**: Accepts the second number from the user.
- **`if (firstNumber > secondNumber)`**: Compares the two numbers and prints the greater one.
- **`sc.close();`**: Closes the `Scanner` object to release resources.
