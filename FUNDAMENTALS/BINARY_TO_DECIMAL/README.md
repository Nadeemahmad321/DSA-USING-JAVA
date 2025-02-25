# Binary to Decimal Conversion

This Java program takes a binary number as input from the user and converts it to its decimal equivalent. The program demonstrates how to work with binary numbers and perform mathematical operations to convert from one base to another.

## Table of Contents

1. [Introduction](#introduction)
2. [How It Works](#how-it-works)
3. [Example](#example)
4. [Code Explanation](#code-explanation)
5. [How to Run](#how-to-run)
6. [Notes](#notes)

## Introduction

In this program, we take a binary number (base 2) as input and convert it to a decimal number (base 10). The binary number is processed by extracting each digit (from right to left) and calculating the corresponding decimal value using powers of 2. This is done using simple arithmetic and iteration.

## How It Works

1. **Input**: The user provides a binary number as input.
2. **Conversion Process**:
   - Start from the least significant bit (rightmost digit) of the binary number.
   - Multiply each binary digit by the corresponding power of 2.
   - Add the results to get the decimal equivalent.
3. **Output**: The program outputs the decimal equivalent of the entered binary number.

### Algorithm

For example, to convert the binary number `1011` to decimal:

- Start from the right:  
  \( 1 \times 2^0 + 1 \times 2^1 + 0 \times 2^2 + 1 \times 2^3 \)
- This simplifies to:  
  \( 1 + 2 + 0 + 8 = 11 \)

So, the decimal equivalent of binary `1011` is `11`.

## Example

### Input:

```
Enter a binary number: 1011
```

### Output:

```
Decimal equivalent: 11
```

### Input:

```
Enter a binary number: 1101
```

### Output:

```
Decimal equivalent: 13
```

## Code Explanation

### `binaryToDecimal` Method

- This method takes an integer `bNumber` (the binary number) as input.
- It uses a `while` loop to iterate over the digits of the binary number.
- In each iteration, the least significant digit (rightmost) is extracted by `bNumber % 10` and added to the result, multiplied by the corresponding power of 2 (`Math.pow(2, i)`).
- The number `bNumber` is then divided by 10 (removing the last digit) and `i` is incremented to move to the next power of 2.
- Finally, the method returns the decimal value.

### `main` Method

- The `main` method prompts the user to enter a binary number.
- It calls the `binaryToDecimal` method to convert the binary input to decimal.
- It then prints the decimal equivalent.

## How to Run

1. **Prerequisites**: Make sure you have Java installed on your system.

   - You can check if Java is installed by running the following command in your terminal:
     ```
     java -version
     ```

2. **Steps**:
   - Clone or download the project to your local machine.
   - Open a terminal or command prompt and navigate to the directory where the Java file is located.
   - Compile the program using the following command:
     ```
     javac BinaryToDecimal.java
     ```
   - Run the program using:
     ```
     java BinaryToDecimal
     ```
   - Enter a binary number when prompted to see the decimal conversion.

## Notes

- This program assumes that the input is a valid binary number (i.e., it contains only `0` and `1`).
- The program does not handle edge cases like negative binary numbers or invalid input (non-binary digits).
- The result will be displayed as an integer, as binary to decimal conversion inherently results in an integer.

## License

This project is open-source and free to use.

```

### How to Use:

1. Save this content to a `README.md` file.
2. You can add this `README.md` to the root directory of your project to provide users and contributors with a clear overview of how the program works and how to use it.
```
