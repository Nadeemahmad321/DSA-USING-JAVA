# Solid Rhombus Pattern Generator

This Java program generates a **solid rhombus** pattern made of asterisks (`*`) based on the number of rows entered by the user. The pattern is displayed with each row having the same number of stars (`*`), and spaces are added in the beginning to align the stars to form a rhombus shape.

## Features

- The program generates a solid rhombus pattern using asterisks (`*`).
- Takes an integer input (the number of rows) to determine the size of the rhombus.
- Outputs a properly aligned rhombus shape on the console.

## Pattern Example

For an input of `5` rows, the output will look like this:

```
    *****
   *****
  *****
 *****
*****
```

### Explanation of the Pattern:

- The pattern consists of `5` rows, each containing `5` stars (`*`).
- Each row starts with some spaces to align the stars in the shape of a rhombus.
- The first row has `4` spaces and `5` stars, the second row has `3` spaces and `5` stars, and so on until the last row, which has no spaces.

## How It Works

1. **Input**: The user is prompted to enter the number of rows they want for the rhombus pattern.
2. **Pattern Generation**:
   - The program iterates through the number of rows.
   - For each row, it first prints spaces (`" "`) to properly align the stars to form the rhombus.
   - Then, it prints the stars (`*`).
3. **Output**: After generating the pattern, it is printed line by line on the console.

## Code Structure

1. **`solidRhombus(int row)`**:
   - This method generates the rhombus pattern.
   - It uses nested loops:
     - The outer loop handles the rows.
     - The first inner loop prints leading spaces.
     - The second inner loop prints the stars (`*`).
2. **`main(String[] args)`**:
   - This is the entry point of the program.
   - It prompts the user for input (number of rows), calls the `solidRhombus` method, and prints the pattern.

## Example

### Input:

```
Enter the number of rows: 5
```

### Output:

```
    *****
   *****
  *****
 *****
*****
```

In this example, the user entered `5` as the number of rows, so the program generated a rhombus with 5 stars per row.

## How to Run

1. **Clone or download the repository**.

2. **Compile and run the program** using the following commands:

   ```bash
   javac SolidRhombus.java
   java SolidRhombus
   ```

3. **Enter the number of rows** when prompted (for example, enter `5`).
4. **View the solid rhombus pattern** printed on the console.

## Requirements

- Java 8 or later.
