# Triangle Pattern with Alternating 1s and 0s in Java

This Java program generates a triangle pattern where each row alternates between `1`s and `0`s based on the sum of the row and column indices. The program takes the number of rows as input from the user and prints the corresponding triangle pattern.

## Program Description

The program prints a triangle pattern where each row contains a number of elements equal to the row number. The elements alternate between `1` and `0` based on the sum of the row index and column index. If the sum is even, the program prints `1`, and if the sum is odd, it prints `0`. This pattern is printed row by row, forming a triangle shape.

### Steps:

1. **User Input**: The program prompts the user to input the number of rows for the triangle.
2. **Pattern Generation**:
   - The program generates the pattern using nested loops.
   - The outer loop controls the rows.
   - The inner loop prints alternating `1`s and `0`s for each position in the row.
3. **Output**: The program prints the generated pattern to the console.

## Code Explanation

### Method: `Triangle(int rows)`

- **Parameters**:
  - `rows`: The number of rows to print in the triangle pattern.
- **Functionality**:
  - The method starts by initializing a counter for each row.
  - The first inner loop prints alternating `1`s and `0`s by checking if the sum of the row index (`i`) and column index (`j`) is even or odd.
  - The second inner loop moves to the next row after printing the current row.
  - The pattern continues until all rows are printed.

### Main Method:

- **Scanner**: The program uses a `Scanner` object to get the number of rows from the user.
- **Calling the Method**: After reading the input, it calls the `Triangle(rows)` method to print the desired pattern.
- **Closing the Scanner**: The scanner is closed after use to prevent resource leaks.

### Example:

#### Input:

```
Enter the number of rows: 5
```

#### Output:

```
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
```

### Explanation of Output:

- **Row 1**: The first row has only `1`, as `i + j = 1 + 1 = 2` (even).
- **Row 2**: The second row alternates between `0` and `1`, because the sum of the row and column indices alternates between even and odd.
- **Row 3**: The third row alternates between `1`, `0`, and `1`, based on the same principle.
- This alternating pattern continues for the remaining rows.

### How the Code Works:

- The program uses two nested loops:
  - The **outer loop** iterates over each row.
  - The **inner loop** iterates over each column in the row.
  - The sum of the row index (`i`) and column index (`j`) is checked to determine whether the sum is even or odd. If the sum is even, `1` is printed; otherwise, `0` is printed.

### How to Run the Program

1. Ensure you have Java installed on your system. You can check if Java is installed by running the following command:

   ```
   java -version
   ```

2. Save the Java code in a file called `Patter.java`.

3. To compile the Java program, use the following command in your terminal:

   ```
   javac Patter.java
   ```

4. To run the compiled program, use the following command:

   ```
   java Patter
   ```

   The program will prompt you to enter the number of rows and will display the corresponding triangle pattern.
