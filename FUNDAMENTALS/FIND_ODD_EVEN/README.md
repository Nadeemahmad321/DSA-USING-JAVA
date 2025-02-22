# Find Odd or Even

This Java program checks whether a given number is odd or even.

## Description

The program takes an integer input from the user and determines whether the number is **odd** or **even** by performing a simple modulo operation (`%`). If the number is divisible by 2 with no remainder, it is classified as **even**; otherwise, it is classified as **odd**.

## Features

- Prompts the user to enter a number.
- Checks if the entered number is odd or even.
- Outputs the result to the console.

## Requirements

- Java Development Kit (JDK) 8 or higher.
- A terminal or command prompt to run the Java program.

## Usage

### Step 1: Compile the Java Program

In the terminal, navigate to the directory where the `FindOddEven.java` file is located and compile it using the following command:

```bash
javac FindOddEven.java
```

### Step 2: Run the Program

After compiling, run the program using the command below:

```bash
java FUNDAMENTALS.FIND_ODD_EVEN.FindOddEven
```

### Step 3: Input a Number

The program will prompt you to enter a number. Type a number and press Enter.

```bash
Enter the number you want to check: 5
```

### Step 4: Output the Result

The program will then display whether the number is odd or even. For example:

```bash
5 is odd
```

## Example

```bash
Enter the number you want to check: 10
10 is even
```

## Code Explanation

- The `isOddOrEven` method checks if the number is divisible by 2 using the modulo operator (`%`).
- If the result of `number % 2 == 0`, the number is even; otherwise, it is odd.
- A `Scanner` object is used to read the user input from the console.
