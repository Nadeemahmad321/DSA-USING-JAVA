# Decimal to Binary Converter

This Java program converts a decimal number (base 10) into its binary equivalent (base 2). It uses a method to repeatedly divide the decimal number by 2, capturing the remainders to form the binary representation.

## Program Description

The program prompts the user to input a decimal number. It then converts the entered decimal number into binary using the following steps:

1. **Input the decimal number**: The program asks the user to input a decimal number.
2. **Conversion process**: It converts the decimal number to binary by repeatedly dividing the number by 2, storing the remainders.
3. **Output**: The program then prints the binary equivalent of the input decimal number.

## How the Code Works

### Method: `decimalToBinary(int dNumber)`

- **Parameters**:
  - `dNumber` (int): The decimal number to be converted.
- **Return Value**:
  - Returns an integer representing the binary equivalent of the decimal number.

The method works by using the modulo operation to find the binary digits (remainders when divided by 2), and these digits are added to the result in the correct binary place value by multiplying with powers of 10.

### Main Logic:

1. The program uses a `Scanner` to get user input.
2. It calls the `decimalToBinary` method, passing the input number, and stores the result.
3. The program prints the result in the format `The binary equivalent is: <binaryNumber>`.
4. Finally, the `Scanner` is closed to avoid resource leaks.

## Example Run

### Input:

```
Enter the decimal number: 10
```

### Output:

```
The binary equivalent is: 1010
```

## How to Run the Program

### Prerequisites:

- Make sure you have Java installed on your system. You can check if Java is installed by running the following command:
  ```
  java -version
  ```

### Steps to Run:

1. Copy the code into a file named `DecimalToBinary.java`.
2. Compile the Java file using the following command:
   ```
   javac DecimalToBinary.java
   ```
3. Run the compiled program:
   ```
   java DecimalToBinary
   ```

The program will then prompt you for a decimal number and output the corresponding binary equivalent.
