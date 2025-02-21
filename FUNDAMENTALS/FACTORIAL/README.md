```markdown
# Factorial Program

This is a simple Java program that calculates the factorial of a given number. It uses a `for` loop to multiply all integers from 1 to the input number. The program also handles the special case where the factorial of 0 is 1.

## How It Works:

1. The program prompts the user to input a number.
2. It then calculates the factorial by multiplying all integers from 1 up to the entered number.
3. If the number is 0, it directly returns 1 since \( 0! = 1 \) by definition.

### Formula for Factorial:

\[
n! = n \times (n-1) \times (n-2) \times \dots \times 1
\]

For special case:
\[
0! = 1
\]

### Example:

For the input `5`, the program calculates:
```

5! = 5 _ 4 _ 3 _ 2 _ 1 = 120

```
And the output will be:
```

Factorial of 5 is: 120

````

### Instructions:

1. Clone or download this repository.
2. Compile the `Factorial.java` file using a Java compiler:
   ```bash
   javac Factorial.java
````

3. Run the compiled program:
   ```bash
   java Factorial
   ```
4. Enter a number when prompted, and the program will display the factorial of that number.

### Additional Notes:

- The factorial of numbers can grow very large, and for very large numbers, the program might need optimization or a different approach to handle large integers, such as using `BigInteger` in Java.
- The program currently uses an iterative approach to calculate the factorial.

```

```
