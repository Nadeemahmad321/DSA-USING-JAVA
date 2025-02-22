# Area of Square

This Java program calculates the area of a square based on the side length entered by the user. It uses the formula:

\[
\text{Area of Square} = \text{side}^2
\]

Where `side` is the length of one side of the square.

## Features

- Prompts the user to input the side length of a square.
- Calculates the area using the formula \( \text{side}^2 \).
- Handles both integer and floating-point inputs for the side length.
- Outputs the area of the square to the user.

## How to Run the Program

### Prerequisites:

- Java Development Kit (JDK) installed on your machine.

### Steps:

1. Clone or download the repository containing the `Area.java` file.
2. Open a terminal or command prompt.
3. Navigate to the directory where the `Area.java` file is located.
4. Compile the Java file:
   ```bash
   javac Area.java
   ```
5. Run the compiled Java program:
   ```bash
   java Area
   ```

### Example Usage:

When you run the program, it will prompt you to enter the side of the square. After inputting the side, it will calculate and display the area.

Example 1:

```
Enter the side of the square: 3
Area of square: 9.0
```

Example 2:

```
Enter the side of the square: 4.5
Area of square: 20.25
```

## Code Structure

- **`Scanner sc = new Scanner(System.in);`**: Creates a `Scanner` object to handle user input.
- **`float side = sc.nextFloat();`**: Reads the side length of the square as a floating-point number.
- **`float area = side * side;`**: Calculates the area of the square using the formula \( \text{side}^2 \).
- **`System.out.println("Area of square: " + area);`**: Prints the calculated area of the square.
- **`sc.close();`**: Closes the `Scanner` object to free resources after use.
