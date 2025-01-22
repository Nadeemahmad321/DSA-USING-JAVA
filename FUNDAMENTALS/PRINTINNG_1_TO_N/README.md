````markdown
# Counting Program: Print Numbers from 0 to N

This Java program prompts the user to input a range and then prints the numbers starting from 0 up to the specified range (inclusive). It utilizes the `Scanner` class to take input from the user and a `for` loop to generate the sequence of numbers.

## Features

- User input to define the range of numbers to be printed.
- Output displays all numbers from 0 to the specified range.
- Simple and easy-to-understand logic for beginners learning Java basics.

## Prerequisites

To run this program, you need to have:

- Java Development Kit (JDK) installed on your machine.
- A basic understanding of Java syntax and programming concepts.

## Installation Instructions

1. **Clone this repository** (if you have the source code in a git repository):
   ```bash
   git clone https://github.com/your-username/CountingProgram.git
   ```
````

2. **Alternatively, download the `Counting.java` file** and save it in your desired directory.

3. **Compile the program** using the following command in your terminal:

   ```bash
   javac Counting.java
   ```

4. **Run the program**:
   ```bash
   java Counting
   ```

## Code Explanation

### Package Declaration

```java
package FUNDAMENTALS.PRINTINNG_1_TO_N;
```

- The program is part of the `FUNDAMENTALS.PRINTINNG_1_TO_N` package. This helps to logically organize the code in a directory structure.

### Importing Scanner Class

```java
import java.util.Scanner;
```

- The `Scanner` class is imported to allow the program to read input from the user.

### Class Definition

```java
public class Counting {
```

- The program is wrapped in a `Counting` class.

### Main Method

```java
public static void main(String[] args) {
```

- The main method serves as the entry point for the Java application.

### User Input

```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter the range you want to print:");
int range = sc.nextInt();
```

- A `Scanner` object named `sc` is created to take user input.
- The user is prompted to enter a number, which represents the range of numbers to print.

### Loop for Counting

```java
for (int i = 0; i <= range; i++) {
    System.out.print(i);
    System.out.print(" ");
}
```

- A `for` loop starts from 0 and runs until it reaches the user-specified `range` (inclusive). Each number is printed followed by a space.

### Output Format

The output consists of the numbers starting from 0 and ending at the specified range, all displayed on a single line with spaces in between.

## Example

**User Input:**

```
Enter the range you want to print: 5
```

**Program Output:**

```
Counting: 0 1 2 3 4 5
```

## How It Works:

1. The program prompts the user for a number.
2. It starts counting from 0 up to the specified number (inclusive).
3. Each number is printed on the same line, separated by a space.

## Code Example

```java
package FUNDAMENTALS.PRINTINNG_1_TO_N;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Enter the Range you want to print
        System.out.print("Enter the range you want to print:");
        int range = sc.nextInt();
        System.out.print("Counting:");
        for(int i = 0; i <= range; i++){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
```

## Additional Notes

- The program currently prints numbers starting from 0. If you'd like to modify the program to start from 1, you can change the loop to start at `i = 1`.
- The program prints numbers in a horizontal sequence. If you'd like each number on a new line, you can replace `System.out.print(" ")` with `System.out.println()`.

## Contributing

If you'd like to contribute improvements or bug fixes to this program, feel free to fork the repository and submit a pull request.
