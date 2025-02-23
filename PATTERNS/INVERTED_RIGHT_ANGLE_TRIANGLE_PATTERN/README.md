# Inverted Right-Angle Triangle Star Pattern

This Java program generates an inverted right-angled triangle pattern of stars (`*`) based on the number of rows provided by the user. The program takes an integer input from the user, which represents the number of rows in the pattern, and prints a corresponding inverted triangle of stars on the console.

## Features

- Prompts the user to enter the number of rows for the pattern.
- Prints an inverted right-angled triangle pattern of stars.
- Uses nested loops to generate the pattern.
- Closes the scanner after taking user input to prevent resource leaks.

## Example Output

For an input of `5` rows, the output will be:

```
Enter the number of rows for the pattern: 5
* * * * *
* * * *
* * *
* *
*
```

For an input of `3` rows, the output will be:

```
Enter the number of rows for the pattern: 3
* * *
* *
*
```

## How to Run

1. **Clone this repository** to your local machine.
2. **Navigate to the project directory** where the `Inverted.java` file is located.
3. **Compile the Java program** using the following command:
   ```bash
   javac Inverted.java
   ```
4. **Run the program** with the following command:
   ```bash
   java Inverted
   ```
5. The program will prompt you to enter the number of rows for the pattern. After entering the desired number, the inverted triangle pattern will be displayed on the console.

## Code Explanation

### 1. **Scanner for User Input**

- The program begins by creating a `Scanner` object to take input from the user.
- The program then prompts the user to enter the number of rows they want in the inverted triangle pattern.

  ```java
  System.out.print("Enter the number of rows for the pattern: ");
  int row = sc.nextInt();  // Read the number of rows from the user
  ```

### 2. **Outer Loop (Rows)**

- The outer loop controls the number of rows in the pattern.
- The loop runs from `0` to `row - 1`, so it will execute exactly `row` times.

  ```java
  for (int i = 0; i < row; i++) {
  ```

### 3. **Inner Loop (Stars)**

- The inner loop controls the number of stars to be printed in each row.
- For each row, the number of stars decreases as `i` increases. Initially, the row will have `row` stars, then `row - 1`, then `row - 2`, and so on.

  ```java
  for (int j = 0; j < row - i; j++) {
      System.out.print("* ");  // Print a star and a space after it
  }
  ```

### 4. **Newline After Each Row**

- After printing the stars for a particular row, a new line is printed to move to the next row in the pattern.

  ```java
  System.out.println();
  ```

### 5. **Closing the Scanner**

- Finally, the `Scanner` object is closed to release resources after it has been used.

  ```java
  sc.close();
  ```

## Prerequisites

- Java Development Kit (JDK) installed on your machine.
- Basic knowledge of Java programming and loops.
