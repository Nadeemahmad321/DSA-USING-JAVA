# Inverted Half-Pyramid with Numbers

This Java program prints an inverted half-pyramid pattern with numbers. The number of rows for the pyramid is entered by the user, and the program generates a pattern where each row starts with `1` and increases the numbers up to a certain value, but the number of values decreases as we go down to the next row.

## Program Description

The program takes user input to define the number of rows for the inverted half-pyramid. The program then prints numbers in such a way that each row contains one less number than the previous row, starting from the largest number (which is the row count) and ending with a single number at the bottom row.

### Steps:

1. **User Input**: The program prompts the user to enter the number of rows.
2. **Pattern Generation**: The program uses two loops:
   - The outer loop iterates over each row.
   - The inner loop prints numbers for the current row, decreasing the numbers printed with each row.
3. **Output**: The program prints the inverted half-pyramid pattern with numbers in the console.

## How the Code Works

### Method: `invertedHalfPyramidWithNumber(int rows)`

- **Parameters**:
  - `rows`: The number of rows for the inverted half-pyramid pattern.
- **Functionality**:
  - The method uses two nested loops:
    - The outer loop (`i`) handles each row of the pyramid.
    - The inner loop (`j`) prints numbers for the current row. The number of printed numbers decreases with each row.
  - The inner loop prints the numbers from `1` to `rows - i + 1`, where `i` is the current row number. This creates the inverted effect, with fewer numbers printed in each subsequent row.
  - After printing the numbers for a row, the method moves to the next line using `System.out.println()`.

### Main Method:

- **Scanner**: The program uses a `Scanner` object to take input from the user for the number of rows.
- **Pattern Generation**: The program calls the `invertedHalfPyramidWithNumber` method to generate and display the pattern.
- **Closing Scanner**: The `Scanner` object is closed after use to prevent any potential resource leaks.

### Example:

#### Input:

```
Enter the number of rows: 5
```

#### Output:

```
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```

### Explanation:

1. **Row 1**: The first row starts with the numbers from `1` to `5`.
2. **Row 2**: The second row starts with the numbers from `1` to `4`.
3. **Row 3**: The third row starts with the numbers from `1` to `3`.
4. **Row 4**: The fourth row starts with the numbers from `1` to `2`.
5. **Row 5**: The fifth and final row only contains `1`.

This pattern creates an inverted half-pyramid, where the first row has the most numbers and each subsequent row has one less number.

## How to Run the Program

### Prerequisites:

- Make sure you have Java installed on your system. You can check if Java is installed by running the following command:
  ```
  java -version
  ```

### Steps to Run:

1. Copy the code into a file named `Pattern.java`.
2. Compile the Java file using the following command:
   ```
   javac Pattern.java
   ```
3. Run the compiled program:
   ```
   java Pattern
   ```

The program will then prompt you to enter the number of rows and will display the corresponding inverted half-pyramid pattern with numbers.
