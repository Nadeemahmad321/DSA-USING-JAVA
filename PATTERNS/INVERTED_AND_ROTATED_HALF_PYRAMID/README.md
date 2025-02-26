# Inverted and Rotated Half-Pyramid Pattern Generator

This Java program generates an inverted and rotated half-pyramid pattern based on the number of rows input by the user. The pyramid starts with one star (`*`) at the top and increases the number of stars with each subsequent row, all while shifting the stars to the right to create a rotated effect.

## Program Description

The program prompts the user to enter the number of rows, then prints an inverted and rotated half-pyramid pattern. The pyramid's base (the last row) contains the most stars, while the first row contains the least. Leading spaces are added to each row to achieve the rotated effect.

### Steps:

1. **User Input**: The program asks the user to input the number of rows for the pyramid.
2. **Pattern Generation**: The program uses loops to generate spaces and stars to form the pattern.
3. **Output**: The program prints the pyramid pattern to the console.

## How the Code Works

### Method: `invertedAndRotatedHalfPyramid(int rows)`

- **Parameters**:
  - `rows`: The number of rows in the pyramid.
- **Functionality**:
  - The method uses two nested loops:
    - The outer loop handles each row of the pyramid.
    - The first inner loop prints leading spaces to rotate the pyramid.
    - The second inner loop prints stars (`*`) in each row.
  - The stars increase with each row, starting with one star in the first row and increasing by one star in each subsequent row.
  - After completing a row, it moves to the next line using `System.out.println()`.

### Main Method:

- **Scanner**: The program uses a `Scanner` object to take input from the user for the number of rows.
- **Pattern Generation**: The program calls the `invertedAndRotatedHalfPyramid` method to generate the pattern.
- **Resource Management**: The `Scanner` is closed after use to prevent resource leaks.

### Example:

#### Input:

```
Enter the number of rows: 5
```

#### Output:

```
    *
   **
  ***
 ****
*****
```

### Detailed Explanation:

1. **Row 1**: The first row starts with 1 star and 4 spaces before it (since it's rotated).
2. **Row 2**: The second row starts with 1 space and 2 stars.
3. **Row 3**: The third row starts with no spaces and 3 stars.
4. **Row 4**: The fourth row has no spaces and 4 stars.
5. **Row 5**: The fifth and final row has no spaces and 5 stars.

The result is an inverted half-pyramid rotated to the right, with spaces decreasing from left to right.

## How to Run the Program

### Prerequisites:

- Make sure you have Java installed on your system. You can check if Java is installed by running the following command:
  ```
  java -version
  ```

### Steps to Run:

1. Copy the code into a file named `InvertedAndRotatedHalfPyramid.java`.
2. Compile the Java file using the following command:
   ```
   javac InvertedAndRotatedHalfPyramid.java
   ```
3. Run the compiled program:
   ```
   java InvertedAndRotatedHalfPyramid
   ```

The program will then prompt you to enter the number of rows and will display the corresponding inverted and rotated half-pyramid.
