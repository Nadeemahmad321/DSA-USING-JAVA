# Simple Interest Calculator

This Java program calculates the **Simple Interest** based on the principal value, rate of interest, and time period provided by the user.

## Overview

Simple Interest (SI) is calculated using the formula:

```
SI = (P * R * T) / 100
```

Where:

- **P** = Principal amount
- **R** = Rate of interest
- **T** = Time period (in years)

## Features

- Takes user input for **Principal**, **Rate**, and **Time**.
- Calculates the **Simple Interest** using the provided formula.
- Displays the result of the calculation to the user.

## How to Run the Program

### Prerequisites:

- Java Development Kit (JDK) installed on your machine.

### Steps:

1. Clone or download the repository.
2. Open a terminal or command prompt.
3. Navigate to the directory where the `SimpleInterest.java` file is located.
4. Compile the Java file:
   ```bash
   javac SimpleInterest.java
   ```
5. Run the compiled Java program:
   ```bash
   java SimpleInterest
   ```

### Example Usage:

When you run the program, you will be prompted to input the following:

1. **Principal**: The initial amount of money.
2. **Rate**: The interest rate (in percentage).
3. **Time**: The time period for which interest is calculated (in years).

The program will then output the Simple Interest based on your inputs.

Example:

```
Enter the principal value: 1000
Enter the rate: 5
Enter the time: 2
Simple interest: 100
```

In this case, the program will calculate the Simple Interest as:

```
(1000 * 5 * 2) / 100 = 100
```

## Code Structure

- `Scanner sc = new Scanner(System.in);`: Creates a `Scanner` object to take user inputs.
- `int principal = sc.nextInt();`: Accepts the principal amount from the user.
- `int rate = sc.nextInt();`: Accepts the rate of interest from the user.
- `int time = sc.nextInt();`: Accepts the time period from the user.
- The formula `(principal * rate * time) / 100` is used to calculate the Simple Interest.
- The result is displayed using `System.out.print()`.
