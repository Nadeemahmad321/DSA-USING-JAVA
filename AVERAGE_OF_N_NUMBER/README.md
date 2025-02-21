# Average of N Numbers

This Java program calculates the average of `N` numbers entered by the user. It prompts the user to input the number of values they want to average, then reads each number, computes the sum, and calculates the average.

## Overview

The program allows users to input multiple numbers and computes their average using the formula:
\[
\text{Average} = \frac{\text{Sum of numbers}}{N}
\]
Where `N` is the total number of values.

## Features

- Takes the number of values `N` as input.
- Accepts `N` individual numbers from the user.
- Calculates the sum of the numbers.
- Computes and outputs the average of the entered numbers.
- Handles division with precision by casting the sum to `double`.

## How to Run the Program

### Prerequisites:

- Java Development Kit (JDK) installed on your machine.

### Steps:

1. Clone or download the repository containing the `Average.java` file.
2. Open a terminal or command prompt.
3. Navigate to the directory where the `Average.java` file is located.
4. Compile the Java file:
   ```bash
   javac Average.java
   ```
5. Run the compiled Java program:
   ```bash
   java Average
   ```

### Example Usage:

When you run the program, you will be prompted to input the number of values and then input the values themselves. The program will compute and display the average.

Example:

```
Enter the number of values to calculate the average: 3
Enter the 1 number: 5
Enter the 2 number: 10
Enter the 3 number: 15
The average of the 3 numbers is: 10.0
```

In this example:

- The user inputs `3` as the number of values.
- The program reads the numbers `5`, `10`, and `15`.
- The program calculates the average: \(\frac{5 + 10 + 15}{3} = 10.0\).

## Code Structure

- **`Scanner sc = new Scanner(System.in);`**: Creates a `Scanner` object to handle user input.
- **`int N = sc.nextInt();`**: Reads the number of values the user will input.
- **`for(int i = 1; i <= N; i++)`**: Loops `N` times to read each number entered by the user.
- **`sum += number;`**: Adds each number to the running total (`sum`).
- **`double average = (double) sum / N;`**: Computes the average using the sum of numbers divided by `N`. The `double` cast ensures that division results in a decimal value if necessary.
- **`System.out.println("The average of the " + N + " numbers is: " + average);`**: Outputs the average to the user.
- **`sc.close();`**: Closes the `Scanner` object to release resources.
