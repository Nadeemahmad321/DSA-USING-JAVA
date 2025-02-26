# Floyd's Triangle in Java

This Java program generates Floyd's Triangle, a triangular pattern of numbers where the numbers are arranged in rows, starting with 1 and incrementing by 1 with each number. The program takes the number of rows as input from the user and prints the corresponding Floyd's Triangle pattern.

## Program Description

Floyd's Triangle is a number pattern that starts with 1 and continues incrementing row by row. The first row contains 1 number, the second row contains 2 numbers, the third row contains 3 numbers, and so on. After each number is printed, the counter increments to the next number, forming a sequential pattern. The rows are aligned to form a triangle.

### Steps:

1. **User Input**: The program prompts the user to enter the number of rows they want in the triangle.
2. **Pattern Generation**: The program generates the pattern using nested loops:
   - The outer loop iterates over each row.
   - The first inner loop prints the numbers for each row.
   - The second inner loop prints spaces after the numbers in each row, creating the triangular shape.
3. **Output**: The program prints the generated Floyd's Triangle on the console.

## Code Explanation

### Method: `floydTriangle(int rows)`

- **Parameters**:
  - `rows`: The number of rows for the triangle (entered by the user).
- **Functionality**:
  - The method uses a variable `count` initialized to 1 to keep track of the numbers to be printed.
  - The outer loop iterates through each row.
  - The first inner loop prints the numbers for the current row, with the number of numbers increasing as the row number increases.
  - The second inner loop prints spaces after the numbers, so the numbers form a right-aligned triangular pattern.
  - The `count++` ensures the numbers are sequential, starting from 1.
  - After each row, `System.out.println()` is used to move to the next line.

### Main Method:

- **Scanner**: A `Scanner` object is used to take input from the user for the number of rows.
- **Calling the Method**: The main method calls `floydTriangle(rows)` to print the Floyd's Triangle pattern.
- **Closing the Scanner**: The `Scanner` is closed after its use to prevent resource leaks.

### Example:

#### Input:

```
Enter the number of rows: 5
```

#### Output:

```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

### Explanation:

- **Row 1**: The first row contains the number `1`.
- **Row 2**: The second row contains the numbers `2 3`.
- **Row 3**: The third row contains the numbers `4 5 6`.
- **Row 4**: The fourth row contains the numbers `7 8 9 10`.
- **Row 5**: The fifth and final row contains the numbers `11 12 13 14 15`.

Each row contains one more number than the previous one, and the numbers increment sequentially from 1 to the last number.

## How to Run the Program

### Prerequisites:

Make sure you have Java installed on your system. You can check if Java is installed by running the following command:

```
java -version
```

### Steps to Run:

1. Copy the code into a file named `Floyds.java`.
2. Compile the Java file using the following command:
   ```
   javac Floyds.java
   ```
3. Run the compiled program:
   ```
   java Floyds
   ```

The program will prompt you to enter the number of rows for the Floyd's Triangle, and it will display the corresponding pattern in the console.
