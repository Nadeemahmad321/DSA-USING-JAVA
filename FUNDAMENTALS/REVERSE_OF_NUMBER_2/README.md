# Reverse of Number Program (Version 2)

This is a simple Java program that reverses the digits of a number entered by the user. It works by extracting the last digit of the number, building the reversed number step by step, and then outputting the reversed number.

## Features

- Prompts the user to enter a number.
- Reverses the digits of the entered number.
- Outputs the reversed number.

## How to Run

1. Ensure that Java is installed on your system. If not, download and install the latest version of [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. Clone or download this repository to your local machine.

3. Open a terminal (or command prompt) and navigate to the directory where the program is located.

4. Compile the program using the `javac` command:

   ```bash
   javac Reverse.java
   ```

5. Run the program using the `java` command:

   ```bash
   java Reverse
   ```

6. The program will prompt you to enter a number. After entering the number, it will display the reversed number.

## Example Output

```
Enter the number: 12345
Reverse: 54321
```

Explanation:

- The user entered `12345`, and the program reversed the digits to produce `54321`.

## Code Explanation

- **Scanner Object**: The program uses the `Scanner` class to take input from the user.
- **While Loop**: The program uses a `while` loop to repeatedly extract the last digit of the number using the modulus operator (`% 10`) and removes the last digit by dividing the number by 10 (`number /= 10`).
- **Reversed Output**: As the loop extracts and appends each digit, the number is effectively reversed.
- **Reversed Number Calculation**: Each digit is added to the reversed number (`rev = (rev * 10) + lastDigit`), which shifts the existing digits left before adding the new digit.
- **Closing Scanner**: After the program finishes reading the input, the `Scanner` object is closed to avoid resource leaks.
