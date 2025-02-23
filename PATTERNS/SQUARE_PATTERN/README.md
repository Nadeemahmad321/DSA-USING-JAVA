# Square Pattern Program

This is a simple Java program that generates a square pattern of asterisks (`*`) based on a user-defined size. The program asks the user to enter the size of the square and then prints the square pattern of that size.

## Features

- Prompts the user to input the size of the square.
- Prints a square grid made of asterisks (`*`), where both the rows and columns are equal to the size entered by the user.
- The program uses nested loops to generate the pattern.

## How to Run

1. Ensure you have Java installed on your system. If not, download and install the latest version of [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. Clone or download this repository to your local machine.

3. Open a terminal (or command prompt) and navigate to the directory where the program is located.

4. Compile the program using the `javac` command:

   ```bash
   javac SquarePattern.java
   ```

5. Run the program using the `java` command:

   ```bash
   java SquarePattern
   ```

6. The program will ask you to enter a size for the square. After entering the size, the square pattern will be printed on the screen.

## Example Output

```
Enter the size: 5
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

## Code Explanation

- **Scanner Object**: The program uses the `Scanner` class to read input from the user.
- **Outer Loop**: The outer `for` loop (`for (int i = 0; i < size; i++)`) iterates for each row.
- **Inner Loop**: The inner `for` loop (`for (int j = 0; j < size; j++)`) iterates for each column in the current row, printing the asterisk (`*`) followed by a space.
- **New Line**: After completing each row, the program moves to the next line using `System.out.println();`.
- **Scanner Close**: After completing the task, the program closes the `Scanner` object to prevent resource leaks.
