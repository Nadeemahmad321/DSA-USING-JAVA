# Prime Number Checker

This Java program allows users to check whether a number is prime or not. The user is prompted to input a number, and the program determines if it is a prime number. The user can continue checking multiple numbers until they choose to terminate the program.

## Overview

The program continuously asks the user to input a number and checks if that number is prime. The user can choose to continue checking more numbers or terminate the program by entering specific inputs.

## Features

- Accepts integer input from the user.
- Checks whether the input number is prime or not.
- Allows the user to check multiple numbers in one run.
- Exits the loop based on user input (`'y'` for continue, `'n'` for termination).
- Handles invalid user input and prompts accordingly.

## How to Run the Program

### Prerequisites:

- Java Development Kit (JDK) installed on your machine.

### Steps:

1. Clone or download the repository.
2. Open a terminal or command prompt.
3. Navigate to the directory where the `IsPrime.java` file is located.
4. Compile the Java file:
   ```bash
   javac IsPrime.java
   ```
5. Run the compiled Java program:
   ```bash
   java IsPrime
   ```

### Example Usage:

1. The program will prompt you to enter a number.
2. After entering a number, the program will display whether the number is prime or not.
3. The program will then ask if you want to continue checking another number or terminate.

Example:

```
Enter the number: 5
5 is prime.
Type 'y' for more checking and 'n' for termination: y
Enter the number: 10
10 is not prime.
Type 'y' for more checking and 'n' for termination: n
```

In this case:

- The program checks if `5` is prime and outputs that it is.
- Then, it checks if `10` is prime and outputs that it is not.
- Finally, the program terminates as the user enters 'n'.

## Code Structure

- **`Scanner sc = new Scanner(System.in);`**: Creates a `Scanner` object to take input from the user.
- **Prime Number Logic**: The program uses a loop from `2` to `number-1` to check for divisibility. If the number is divisible by any of these, it is not prime.
- **Loop Control**: After each check, the program asks the user whether they want to continue with another number. If the user enters 'y', the program continues; if 'n', it terminates.
- **Invalid Input Handling**: If the user enters anything other than 'y' or 'n', the program informs them of the invalid input and prompts again.
