# Check Pass or Fail Program

This Java program allows users to check whether they pass or fail based on the marks they enter. The program evaluates whether the marks are greater than or equal to 33 (pass mark) and then prints "Pass" or "Fail." The program keeps running in a loop and prompts the user to enter more marks unless they decide to stop by typing 'n'.

## Description

This program continuously prompts the user to enter their marks. If the marks are greater than or equal to 33, the program will print "Pass." If the marks are less than 33, it will print "Fail." After each check, the user is given an option to enter another set of marks or terminate the program.

The program loops until the user decides to stop by typing 'n'.

## Features

- Takes user input for marks.
- Evaluates whether the marks are sufficient to pass (>= 33).
- Prints "Pass" or "Fail" based on the marks.
- Prompts the user for more inputs or to terminate the program.

## Requirements

- Java Development Kit (JDK) version 8 or higher.
- A terminal or command prompt to compile and run the Java program.

## Usage

### Step 1: Compile the Program

Navigate to the directory where the `Check.java` file is located, and compile it using the following command:

```bash
javac Check.java
```

### Step 2: Run the Program

After compiling, run the program using:

```bash
java FUNDAMENTALS.CHECK_PASS_OR_FAIL.Check
```

### Step 3: Input Your Marks

The program will prompt you to enter the marks for evaluation. For example:

```bash
Enter the marks you want to check: 45
```

### Step 4: View the Output

The program will display whether you have passed or failed:

```bash
Pass
```

Afterward, it will ask if you want to check more marks:

```bash
Type 'y' to check more marks and 'n' to terminate: y
```

### Step 5: Exit or Continue

If you type `'y'`, the program will prompt you to enter more marks. If you type `'n'`, the program will terminate.

## Example

### Example 1: User Enters Marks Above Pass Mark

```bash
Enter the marks you want to check: 50
Pass
Type 'y' to check more marks and 'n' to terminate: y
```

### Example 2: User Enters Marks Below Pass Mark

```bash
Enter the marks you want to check: 25
Fail
Type 'y' to check more marks and 'n' to terminate: n
```

## Code Explanation

1. **User Input:** The program prompts the user to input marks using the `Scanner` class.
2. **Pass/Fail Evaluation:**
   - If the entered marks are greater than or equal to 33, the program prints "Pass."
   - If the marks are less than 33, it prints "Fail."
3. **Loop and Termination:**
   - After each evaluation, the program asks the user if they want to check more marks.
   - If the user types `'y'`, it continues the loop. If the user types `'n'`, the loop exits, and the program terminates.
4. **Resource Management:** The program closes the `Scanner` object after use to release resources.
