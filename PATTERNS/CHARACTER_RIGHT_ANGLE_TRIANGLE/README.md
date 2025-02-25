# Character Right-Angle Triangle Pattern

This Java program generates a **Right-Angle Triangle Pattern** using consecutive letters from the alphabet. The program takes user input for the number of rows, then prints the pattern in the form of a right-angled triangle with each row containing an increasing number of alphabetic characters.

## How the Program Works

1. **User Input**:
   - The program prompts the user to enter the number of rows they want in the triangle.
2. **Pattern Generation**:
   - The program starts with the letter 'A' and continues printing consecutive letters of the alphabet in each row.
   - Each row starts with the next alphabetic character, and the number of characters in each row increases by one.
3. **Output**:
   - After each row is printed, the program moves to the next line.

### Example of the Pattern

For example, if the user inputs `5` rows, the pattern generated will be:

```
Enter the number of rows: 5
A
BC
DEF
GHIJ
KLMNO
```

### Explanation of Output:

- **Row 1**: The first row contains only the letter 'A'.
- **Row 2**: The second row contains two letters: 'B' and 'C'.
- **Row 3**: The third row contains three letters: 'D', 'E', and 'F'.
- **Row 4**: The fourth row contains four letters: 'G', 'H', 'I', and 'J'.
- **Row 5**: The fifth row contains five letters: 'K', 'L', 'M', 'N', and 'O'.

## Code Breakdown

### Main Components:

1. **Scanner for User Input**:
   - The program uses a `Scanner` object to take the number of rows from the user.
2. **Outer Loop (Rows)**:
   - The outer loop (`for (int i = 0; i < row; i++)`) controls how many rows will be printed. The loop runs from `0` to `row-1`.
3. **Inner Loop (Characters in Each Row)**:
   - The inner loop (`for (int j = 0; j <= i; j++)`) controls how many characters to print on each row. It starts at 1 character on the first row and increases by 1 character per row.
4. **Character Printing**:
   - Inside the inner loop, the program prints the current letter (starting from 'A'). After printing, it increments the letter (e.g., 'A' → 'B' → 'C' and so on).
5. **Line Break**:
   - After each row is printed, `System.out.println()` is used to move to the next line.

### Code:

```java
package PATTERNS.CHARACTER_RIGHT_ANGLE_TRIANGLE;

import java.util.Scanner;

public class Character {
    public static void main(String[] args){
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        // Initialize the starting letter to 'A'
        char letter = 'A';

        // Outer loop for each row (from 0 to row-1)
        for(int i = 0; i < row; i++){
            // Inner loop for printing the characters in each row
            for(int j = 0; j <= i; j++){
                // Print the current letter and increment it to the next letter
                System.out.print(letter);
                letter++;  // Move to the next letter in the alphabet
            }

            // Move to the next line after printing the characters for the current row
            System.out.println();
        }

        // Close the scanner object
        sc.close();
    }
}
```

## How to Run the Program

1. **Prerequisites**:

   - You need to have Java installed on your system. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
   - You should have an IDE or a text editor to write Java code, such as IntelliJ IDEA, Eclipse, or VSCode.

2. **Running the Program**:
   - Open your terminal or command prompt.
   - Navigate to the directory where your `Character.java` file is located.
   - Compile the Java file by running:
     ```bash
     javac Character.java
     ```
   - Run the compiled class file:
     ```bash
     java Character
     ```
   - Enter the number of rows when prompted, and the program will print the desired character triangle.

## Conclusion

This program demonstrates a simple yet effective way to create a right-angle triangle pattern using characters from the alphabet. It's a great exercise for understanding loops and how to manipulate characters in Java.

```

### Key Points:
- **Input Prompt**: The program asks for the number of rows from the user.
- **Pattern Logic**: Uses nested loops to generate the pattern of characters.
- **Explanation**: Step-by-step details of how the program works.
```
