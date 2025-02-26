# Hollow Rhombus Pattern Generator

This Java program generates a **hollow rhombus** pattern made of asterisks (`*`) based on the number of rows entered by the user. The program prints stars (`*`) on the borders of the rhombus, leaving spaces in the middle to form a hollow effect.

## Features

- Generates a hollow rhombus pattern.
- Takes an integer input (the number of rows) to determine the size of the rhombus.
- Prints stars (`*`) on the borders, and spaces (` `) inside to create a hollow effect.

## Pattern Example

For an input of `5` rows, the output will look like this:

```
    *****
   *    *
  *    *
 *    *
******
```

### Explanation of the Pattern:

- The pattern consists of `5` rows, each containing `5` positions where stars and spaces are printed.
- The first and last rows are completely filled with stars.
- In the middle rows, stars are printed only at the borders (first and last position in each row), and spaces are printed in between to create the hollow effect.

## How It Works

1. **Input**: The user is prompted to enter the number of rows they want for the hollow rhombus pattern.
2. **Pattern Generation**:
   - The program iterates through the rows, printing spaces at the beginning of each row to align the stars.
   - It prints stars (`*`) on the borders (first and last row, and first and last column of each row).
   - The middle portion of the rhombus (inside the borders) is filled with spaces.
3. **Output**: After generating the pattern, it is printed line by line on the console.

## Code Breakdown

1. **`hollowRhombus(int row)`**:
   - This method generates the hollow rhombus pattern.
   - It uses nested loops:
     - The **outer loop** controls the rows.
     - The **first inner loop** prints the leading spaces before the stars in each row.
     - The **second inner loop** prints stars on the borders and spaces in the middle.
2. **`main(String[] args)`**:
   - The main method is the entry point of the program.
   - It prompts the user for input (number of rows), calls the `hollowRhombus` method, and prints the pattern.
   - It also ensures the `Scanner` is closed after the input to prevent resource leaks.

## Example

### Input:

```
Enter the number of rows: 5
```

### Output:

```
     *****
   *    *
  *    *
 *    *
******
```

In this example, the user entered `5` as the number of rows, so the program generated a hollow rhombus with 5 rows and 5 stars in each row. The hollow space in the middle is formed by printing spaces between the stars on the inner rows.

## How to Run

1. **Clone or download the repository**.

2. **Compile and run the program** using the following commands:

   ```bash
   javac HollowRhombus.java
   java HollowRhombus
   ```

3. **Enter the number of rows** when prompted (for example, enter `5`).
4. **View the hollow rhombus pattern** printed on the console.

## Requirements

- Java 8 or later.

```

### Key Sections of the `README.md`:

1. **Pattern Explanation**: This section explains the structure of the hollow rhombus and how the stars and spaces form the pattern, with a visual example.

2. **Code Breakdown**: A concise explanation of the `hollowRhombus` method and the main method, which explains their respective roles in generating the hollow rhombus pattern.

3. **Example**: An example of what the input and output will look like when the user enters `5` rows.

4. **How to Run**: Instructions on how to compile and run the program, and how to provide the number of rows for the pattern.

5. **License**: Specifies that the project is under the MIT license.

This `README.md` file provides all the necessary details to understand how the Hollow Rhombus program works and how to use it.
```
