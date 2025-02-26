# Hollow Rectangle Pattern Generator

This Java program prints a hollow rectangle pattern with stars (`*`) based on user input for the number of rows and columns. The rectangle will have stars as its borders, and spaces in the interior.

## Program Description

The program prompts the user to input the number of rows and columns for the rectangle. It then prints a hollow rectangle where the boundary (first and last rows, and first and last columns) is filled with stars (`*`), and the inner space of the rectangle is left empty with spaces.

### Steps:

1. **User Input**: The program asks the user to input the number of rows and columns for the hollow rectangle.
2. **Pattern Generation**: Using loops, the program generates the hollow rectangle pattern.
3. **Display Output**: The program prints the hollow rectangle on the console.

## How the Code Works

### Method: `hollowStar(int row, int column)`

- **Parameters**:
  - `row` (int): The number of rows in the rectangle.
  - `column` (int): The number of columns in the rectangle.
- **Functionality**: This method generates the hollow rectangle. It uses nested loops:
  - The outer loop iterates over each row.
  - The inner loop iterates over each column of that row.
  - For the border (first row, last row, first column, or last column), the program prints a star (`*`).
  - For the inner area, the program prints a space (` `), creating a hollow effect.

### Main Method:

- **Scanner**: It takes user input for the number of rows and columns.
- **Pattern Generation**: It calls the `hollowStar` method to generate and print the hollow rectangle pattern.

### Example:

### Input:

```
Enter the number of rows: 5
Enter the number of columns: 7
```

### Output:

```
*******
*     *
*     *
*     *
*******
```

### Detailed Explanation:

1. The program first prints the top row of stars (since it's the border).
2. Then, it prints the middle rows. These rows start and end with stars (`*`), but the inside spaces are left empty.
3. Finally, the program prints the last row of stars to complete the rectangle.

## How to Run the Program

### Prerequisites:

- Make sure you have Java installed on your system. You can check if Java is installed by running the following command:
  ```
  java -version
  ```

### Steps to Run:

1. Copy the code into a file named `Hollow.java`.
2. Compile the Java file using the following command:
   ```
   javac Hollow.java
   ```
3. Run the compiled program:
   ```
   java Hollow
   ```

The program will then prompt you to enter the number of rows and columns and will display the corresponding hollow rectangle.
