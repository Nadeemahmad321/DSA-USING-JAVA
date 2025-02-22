# FUNDAMENTALS.BILL_WITH_GST

## Overview

This Java program calculates the total cost of a set of items including GST (Goods and Services Tax). The items in the program are a pencil, pen, and eraser. The user is prompted to input the cost for each item, and the program calculates the total cost with an 18% GST added.

## Features

- Takes user input for the cost of a pencil, pen, and eraser.
- Calculates the total cost of the items before GST.
- Computes the GST at a rate of 18%.
- Outputs the total cost including GST.

## Requirements

- Java version 8 or above.
- A terminal or command-line interface to run the program.

## How to Use

1. Clone or download the repository containing the `Bill.java` file.
2. Compile the Java program using the following command:
   ```bash
   javac Bill.java
   ```
3. Run the program:
   ```bash
   java Bill
   ```
4. When prompted, input the cost for each item:
   - Enter the cost of the pencil.
   - Enter the cost of the pen.
   - Enter the cost of the eraser.
5. The program will calculate and display the total cost with GST.

## Example Output

```
Enter the cost of pencil: 5.0
Enter the cost of pen: 10.0
Enter the cost of eraser: 2.0
Total cost (with 18% GST): 21.24
```

## Code Explanation

1. **Scanner Object**: A `Scanner` object is used to take user inputs for the costs of the pencil, pen, and eraser.
2. **Cost Calculation**:

   - The costs of the pencil, pen, and eraser are summed to get the `totalCostWithoutGst`.
   - The GST is calculated as 18% of `totalCostWithoutGst`.
   - The total cost with GST is the sum of `totalCostWithoutGst` and the GST.

3. **Output**: The total cost including GST is printed out for the user.

4. **Closing Resources**: The `Scanner` object is closed at the end to release resources.
