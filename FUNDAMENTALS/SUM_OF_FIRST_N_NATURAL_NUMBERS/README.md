# Sum of First N Natural Numbers

This Java program calculates the sum of the first N natural numbers, where N is provided by the user. The program uses a simple loop to add numbers from 1 to N and outputs the result.

## Overview

The program prompts the user to enter a number, and then calculates the sum of all natural numbers from 1 to the entered number. The result is displayed to the user.

## Features

- Takes an integer input from the user (N).
- Calculates the sum of the first N natural numbers.
- Outputs the calculated sum.

## How to Run the Program

### Prerequisites:

- Java Development Kit (JDK) installed on your machine.

### Steps:

1. Clone or download the repository containing the `Sum.java` file.
2. Open a terminal or command prompt.
3. Navigate to the directory where the `Sum.java` file is located.
4. Compile the Java file:
   ```bash
   javac Sum.java
   ```
5. Run the compiled Java program:
   ```bash
   java Sum
   ```

### Example Usage:

When you run the program, you will be prompted to enter a number. The program will calculate and display the sum of the first N natural numbers.

Example:

```
Enter the number up to which you want to calculate the sum of natural numbers: 5
The sum of the first 5 natural numbers is: 15
```

In this case, the program sums the numbers from 1 to 5: `1 + 2 + 3 + 4 + 5 = 15`.

## Code Structure

- **`Scanner sc = new Scanner(System.in);`**: Creates a `Scanner` object to read user input.
- **`int sum = 0;`**: Initializes a variable `sum` to store the sum of natural numbers.
- **`for (int i = 1; i <= number; i++)`**: Loops through numbers from 1 to the user-provided number `N`.
- **`sum += i;`**: Adds the current number to `sum` during each iteration.
- **`System.out.println("The sum of the first " + number + " natural numbers is: " + sum);`**: Outputs the calculated sum.
- **`sc.close();`**: Closes the scanner object to prevent resource leakage after use.
