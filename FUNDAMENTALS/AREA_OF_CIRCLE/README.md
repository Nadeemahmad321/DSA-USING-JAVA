# Area of Circle

This Java program calculates the area of a circle based on the radius provided by the user. It uses the formula `Area = π * radius²`, where π (pi) is approximated as 3.14159.

## Overview

The program prompts the user to input the radius of a circle, computes the area using the provided radius, and then outputs the result in a clear format. This program is a basic demonstration of mathematical operations and user input handling in Java.

## Features

- Takes the radius of a circle as input from the user.
- Uses the mathematical formula to compute the area of the circle.
- Outputs the calculated area in the format: `Area of the circle is: [area]`.

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

When you run the program, you will be prompted to enter the radius of the circle. After entering the radius, the program will calculate and display the area.

Example:

```
Enter the radius of the circle: 3
Area of the circle is: 28.27431
```

In this case, the program uses the formula:
\[
\text{Area} = \pi \times r^2 = 3.14159 \times 3^2 = 28.27431
\]

## Code Structure

- **`Scanner sc = new Scanner(System.in);`**: Creates a `Scanner` object to take input from the user.
- **`float radius = sc.nextFloat();`**: Reads the radius of the circle entered by the user.
- **`double pi = 3.14159;`**: Defines the constant value of pi for the calculation.
- **`double area = pi * radius * radius;`**: Calculates the area of the circle using the formula.
- **`System.out.println("Area of the circle is: " + area);`**: Outputs the calculated area.
- **`sc.close();`**: Closes the `Scanner` object to prevent resource leaks.
