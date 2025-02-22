# Multiplication Table Program

This is a simple Java program that generates and displays the multiplication table for a given number. The user is prompted to enter a number, and the program will display its multiplication table from 1 to 10.

## Features

- The user is asked to input a number.
- The program displays the multiplication table for that number from 1 to 10.
- The output is formatted in a clear and easy-to-read way.
- It uses a `Scanner` object to read user input.

## How to Run

1. Ensure you have Java installed on your system. If not, download and install the latest version of [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. Clone or download this repository to your local machine.

3. Open a terminal (or command prompt) and navigate to the directory where the program is located.

4. Compile the program using the `javac` command:

   ```bash
   javac Multiplication.java
   ```

5. Run the program using the `java` command:

   ```bash
   java Multiplication
   ```

6. You will be prompted to enter a number. After entering the number, the program will print the multiplication table for that number.

## Example Output

```
Enter a number for multiplication: 5
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50
```

## Code Explanation

- **Scanner Object**: The program uses the `Scanner` class to take input from the user.
- **For Loop**: A `for` loop runs from 1 to 10, and for each iteration, it calculates and prints the result of the multiplication.
- **Formatted Output**: The result of each multiplication is printed in the format `number * i = result`.
