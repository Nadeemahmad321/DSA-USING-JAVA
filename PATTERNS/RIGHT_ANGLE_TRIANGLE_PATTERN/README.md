# Right Angle Triangle Star Pattern

This Java program generates a right-angled triangle pattern of stars (`*`) based on the number of rows provided by the user. The program takes an integer input from the user, which represents the number of rows in the pattern, and prints a corresponding pattern of stars on the console.

## Features

- Prompts the user to enter the number of rows for the pattern.
- Prints the right-angled triangle pattern of stars.
- Uses nested loops to generate the pattern.
- Closes the scanner after taking user input to prevent resource leaks.

## Example Output

For an input of `5` rows, the output will be:

```
Enter the number of rows for the pattern: 5
*
* *
* * *
* * * *
* * * * *
```

## How to Run

1. **Clone this repository** to your local machine.
2. **Navigate to the project directory** where the `TrianglePattern.java` file is located.
3. **Compile the Java program** using the following command:
   ```bash
   javac TrianglePattern.java
   ```
4. **Run the program** with the following command:
   ```bash
   java TrianglePattern
   ```
5. The program will prompt you to enter the number of rows for the pattern. After entering the desired number, the triangle pattern will be displayed on the console.

## Code Explanation

- The program starts by creating a `Scanner` object to take input from the user.
- The user is prompted to input the number of rows they want in the pattern.
- Two nested loops are used to generate the pattern:
  - The outer loop runs from 0 to the number of rows (exclusive), controlling the number of rows.
  - The inner loop runs from 0 to the current row index, printing stars (`*`) in each row.
- After printing the stars for each row, a newline (`System.out.println()`) is used to move to the next line for the subsequent row of stars.
- Finally, the `Scanner` object is closed to release resources.

## Prerequisites

- Java Development Kit (JDK) installed on your machine.
- Basic knowledge of Java programming and loops.
