# Sum of Two Numbers in Java (FUNDAMENTALS.SUM_OF_TWO_NUMBER)

This is a simple Java program that calculates the sum of two numbers entered by the user. The program uses the `Scanner` class for input and performs basic integer addition.

## Prerequisites

- Java 8 or higher is required to run this program.
- A Java IDE (like IntelliJ IDEA, Eclipse) or a text editor with a terminal for compiling and running Java code.

## Files

1. **Sum.java** - The main Java program located in the `FUNDAMENTALS.SUM_OF_TWO_NUMBER` package.
2. **README.md** - Documentation for the program.

## Program Overview

This program:

1. Prompts the user to enter two integers.
2. Calculates the sum of the two integers.
3. Displays the result to the user.

### How to Run

#### 1. Clone or Download the Project

You can clone this project to your local machine using the following command:

```bash
git clone https://github.com/yourusername/sum-of-two-numbers-java.git
```

Alternatively, download the `Sum.java` file directly.

#### 2. Compile the Java Program

Open a terminal (or Command Prompt on Windows) and navigate to the directory where your `Sum.java` file is located. Then run the following command to compile the program:

```bash
javac FUNDAMENTALS/SUM_OF_TWO_NUMBER/Sum.java
```

#### 3. Run the Program

Once compiled, you can run the program with the following command:

```bash
java FUNDAMENTALS.SUM_OF_TWO_NUMBER.Sum
```

#### 4. Input

The program will prompt you to enter two integers (positive or negative).

#### 5. Output

After entering both numbers, the program will display the sum.

### Example

**Input:**

```
Enter the first number: 15
Enter the second number: 25
```

**Output:**

```
15 + 25 = 40
```

## Code Explanation

Below is a breakdown of the Java code in the `Sum.java` file.

```java
package FUNDAMENTALS.SUM_OF_TWO_NUMBER;

import java.util.Scanner; // Importing Scanner class to handle user input

public class Sum {
    public static void main(String[] args) {
        // Creating an instance of the Scanner class to read user input
        Scanner Sc = new Scanner(System.in);

        // Prompting the user to enter the first number
        System.out.print("Enter the first number: ");
        int firstNumber = Sc.nextInt(); // Reading the first number as an integer

        // Prompting the user to enter the second number
        System.out.print("Enter the second number: ");
        int secondNumber = Sc.nextInt(); // Reading the second number as an integer

        // Performing the addition and storing the result in 'sum'
        int sum = firstNumber + secondNumber;

        // Displaying the result
        System.out.print(firstNumber + " + " + secondNumber + " = " + sum);

        // Closing the Scanner object
        Sc.close();
    }
}
```

### Detailed Code Breakdown:

1. **Package Declaration**:

   ```java
   package FUNDAMENTALS.SUM_OF_TWO_NUMBER;
   ```

   - The program is placed within the `FUNDAMENTALS.SUM_OF_TWO_NUMBER` package, which organizes the code logically for better maintainability.

2. **Importing Scanner**:

   ```java
   import java.util.Scanner;
   ```

   - This imports the `Scanner` class, which allows us to read input from the user.

3. **Main Method**:

   ```java
   public static void main(String[] args) {
   ```

   - The `main()` method is the entry point for the program.

4. **Creating Scanner Object**:

   ```java
   Scanner Sc = new Scanner(System.in);
   ```

   - A `Scanner` object `Sc` is created to read input from the user.

5. **User Input for First Number**:

   ```java
   System.out.print("Enter the first number: ");
   int firstNumber = Sc.nextInt();
   ```

   - The user is prompted to input the first number, which is then read and stored as an integer in `firstNumber`.

6. **User Input for Second Number**:

   ```java
   System.out.print("Enter the second number: ");
   int secondNumber = Sc.nextInt();
   ```

   - Similarly, the second number is read and stored as an integer in `secondNumber`.

7. **Calculating the Sum**:

   ```java
   int sum = firstNumber + secondNumber;
   ```

   - The sum of `firstNumber` and `secondNumber` is computed and stored in the `sum` variable.

8. **Displaying the Result**:

   ```java
   System.out.print(firstNumber + " + " + secondNumber + " = " + sum);
   ```

   - The result is displayed in the format `firstNumber + secondNumber = sum`.

9. **Closing the Scanner**:
   ```java
   Sc.close();
   ```
   - It's good practice to close the `Scanner` object to free up system resources once it's no longer needed.
     uests with improvements or bug fixes. If you find any issues, please report them in the Issues section.
