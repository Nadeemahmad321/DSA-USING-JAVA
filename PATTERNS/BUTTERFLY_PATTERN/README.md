# Butterfly Pattern Generator

This Java program generates a butterfly-shaped pattern of stars based on the number of rows entered by the user. The pattern is symmetrical with stars and spaces, forming a butterfly shape.

## Features

- Generates a butterfly pattern with stars (`*`).
- Takes the number of rows as input from the user.
- The number of columns is provided as input but is not used in the pattern.
- The program prints the top and bottom halves of the butterfly symmetrically.

## Pattern Example

For an input of `5` rows, the output will look like this:

```
*       *
**     **
***   ***
**** ****
*********
**** ****
***   ***
**     **
*       *
```

## How it Works

1. **Input**: The user is asked to enter the number of rows and columns.
2. **Top Half**: The program prints stars (`*`) on both sides with spaces in between, starting with one star on each side and increasing the number of stars as the rows increase.
3. **Bottom Half**: The program then prints the lower half of the pattern, which is the reverse of the top half.
4. **Output**: The pattern is printed on the console, forming a butterfly shape.

## Usage

1. **Clone or download the repository**.

2. **Compile and run the program** using the following commands:

   ```bash
   javac Butterfly.java
   java Butterfly
   ```

3. **Enter the required inputs** when prompted:

   - Enter the number of rows (e.g., `5`).
   - Enter the number of columns (though it is not used, enter any integer).

4. **View the butterfly pattern** printed on the console.

## Example

### Input:

```
Enter the number of rows: 5
Enter the number of columns: 10
```

### Output:

```
*       *
**     **
***   ***
**** ****
*********
**** ****
***   ***
**     **
*       *
```

## Requirements

- Java 8 or later.
