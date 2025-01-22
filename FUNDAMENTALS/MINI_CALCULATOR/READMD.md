# Mini Calculator

This is a simple console-based calculator program written in Java. The calculator can perform basic arithmetic operations such as addition, subtraction, multiplication, division, and modulus. The program takes input from the user, performs the operation, and displays the result. It continues to allow more calculations until the user opts to exit.

## Features

- **Addition**: Adds two numbers.
- **Subtraction**: Subtracts the second number from the first.
- **Multiplication**: Multiplies two numbers.
- **Division**: Divides the first number by the second (with handling for division by zero).
- **Modulus**: Finds the remainder when dividing the first number by the second.

## Requirements

- Java 8 or higher
- A terminal or command prompt to run the program

## How to Run

1. **Download or clone the repository**:
   - Clone the repository using the command:
     ```bash
     git clone https://github.com/yourusername/mini-calculator.git
     ```
2. **Compile the Java file**:
   - Open a terminal and navigate to the directory where the file is located.
   - Run the following command to compile the program:
     ```bash
     javac Calculator.java
     ```
3. **Run the program**:
   - After compilation, run the program using:
     ```bash
     java FUNDAMENTALS.MINI_CALCULATOR.Calculator
     ```

## Example Usage

### Sample Run 1

```
Enter the first number: 5
Enter the operator you want (+, -, *, /, %): +
Enter the second number: 3
Addition of two numbers is: 8

Enter 'y' for more calculations and 'n' for termination: y
Enter the first number: 10
Enter the operator you want (+, -, *, /, %): /
Enter the second number: 2
Division of two numbers is: 5

Enter 'y' for more calculations and 'n' for termination: n
```

### Sample Run 2 (Error Handling for Division by Zero)

```
Enter the first number: 10
Enter the operator you want (+, -, *, /, %): /
Enter the second number: 0
Error: Cannot divide by zero!

Enter 'y' for more calculations and 'n' for termination: n
```

## Program Flow

1. **User Input**:
   - The program asks the user for the first number.
   - It then asks the user for the operator (`+`, `-`, `*`, `/`, `%`).
   - The program then asks for the second number.
2. **Operation Execution**:
   - Based on the operator entered, the program performs the corresponding arithmetic operation.
   - If division is attempted by zero, the program handles the error and displays an appropriate message.
3. **Result Output**:
   - After performing the operation, the program outputs the result of the operation.
4. **Repeat or Exit**:
   - The user is asked if they want to continue with another calculation or terminate the program. If they choose `y`, the program continues; otherwise, it terminates.

## Example Code

```java
package FUNDAMENTALS.MINI_CALCULATOR;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isCalculate = true;

        while(isCalculate){
            // Enter the first number
            System.out.print("Enter the first number: ");
            int num_1 = sc.nextInt();

            // Entering arithmetic operator for operation
            System.out.print("Enter the operator you want (+, -, *, /, %): ");
            char operator = sc.next().charAt(0);

            // Enter the second number
            System.out.print("Enter the second number: ");
            int num_2 = sc.nextInt();

            switch (operator) {
                case '+':
                    int add = num_1 + num_2;
                    System.out.println("Addition of two numbers is: " + add);
                    break;

                case '-':
                    int sub = num_1 - num_2;
                    System.out.println("Subtraction of two numbers is: " + sub);
                    break;

                case '*':
                    int mul = num_1 * num_2;
                    System.out.println("Multiplication of two numbers is: " + mul);
                    break;

                case '/':
                    if (num_2 != 0) {
                        int div = num_1 / num_2;
                        System.out.println("Division of two numbers is: " + div);
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;

                case '%':
                    int mod = num_1 % num_2;
                    System.out.println("Modulus of two numbers is: " + mod);
                    break;

                default:
                    System.out.println("Invalid operator! Please enter one of +, -, *, /, %.");
            }

            System.out.print("Enter 'y' for more calculations and 'n' for termination: ");
            char letter = sc.next().charAt(0);

            if(letter == 'y'){
                isCalculate = true;
            } else {
                isCalculate = false;
            }
        }

        sc.close();
    }
}
```

## Error Handling

- **Division by Zero**: The program checks for division by zero when the `/` operator is selected. If the second number is zero, it displays an error message: "Error: Cannot divide by zero!"
- **Invalid Operator**: If the user enters an operator that is not supported (`+`, `-`, `*`, `/`, `%`), the program will prompt the user to enter a valid operator.
