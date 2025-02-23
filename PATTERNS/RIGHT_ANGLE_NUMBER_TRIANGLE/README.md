# Right-Angle Number Triangle Pattern

This Java program generates a right-angled triangle pattern using numbers (`1, 2, 3, ...`) based on the number of rows provided by the user. The program asks the user to input the number of rows, then prints the corresponding pattern of numbers.

## Features

- Prompts the user to enter the number of rows for the pattern.
- Prints a right-angled triangle pattern of numbers.
- Uses nested loops to generate the pattern.
- Closes the `Scanner` object to prevent resource leaks.

## Example Output

For an input of `5` rows, the output will be:

```
Enter the number of rows for the pattern: 5
1
12
123
1234
12345
```

For an input of `3` rows, the output will be:

```
Enter the number of rows for the pattern: 3
1
12
123
```

## How to Run

1. **Clone this repository** to your local machine.
2. **Navigate to the project directory** where the `Number.java` file is located.
3. **Compile the Java program** using the following command:
   ```bash
   javac Number.java
   ```
4. **Run the program** with the following command:
   ```bash
   java Number
   ```
5. The program will prompt you to enter the number of rows for the pattern. After entering the desired number, the number triangle pattern will be displayed on the console.

## Code Explanation

### 1. **Scanner for User Input**

- The program starts by creating a `Scanner` object to take input from the user.
- The user is prompted to input the number of rows they want in the pattern.

  ```java
  System.out.print("Enter the number of rows for the pattern: ");
  int row = sc.nextInt();  // Read the number of rows from the user
  ```

### 2. **Outer Loop (Rows)**

- The outer loop controls the number of rows in the pattern.
- The loop runs from `1` to `row`, meaning it will execute `row` times, where each iteration corresponds to a new row.

  ```java
  for (int i = 1; i <= row; i++) {
  ```

### 3. **Inner Loop (Numbers)**

- The inner loop controls the number of numbers to be printed in each row.
- For each row, the numbers printed range from `1` to the current row number `i`.

  ```java
  for (int j = 1; j <= i; j++) {
      System.out.print(j);  // Print numbers from 1 to i
  }
  ```

### 4. **Newline After Each Row**

- After printing the numbers for a particular row, the program prints a new line to move to the next row in the pattern.

  ```java
  System.out.println();
  ```

### 5. **Closing the Scanner**

- Once the user input has been received and processed, the `Scanner` object is closed to release resources.

  ```java
  sc.close();
  ```

## Prerequisites

- Java Development Kit (JDK) installed on your machine.
- Basic knowledge of Java programming, including loops and user input.
