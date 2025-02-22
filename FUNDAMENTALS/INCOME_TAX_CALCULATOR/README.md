# Income Tax Calculator

This Java program calculates the income tax based on the user's annual income. It applies different tax rates depending on the income brackets:

- **No tax** for income below ₹5,00,000
- **20% tax** for income between ₹5,00,000 and ₹10,00,000
- **30% tax** for income above ₹10,00,000

## Description

The program prompts the user to input their annual income and calculates the applicable tax amount based on the following conditions:

- If the income is less than ₹5,00,000, no tax is due.
- If the income is between ₹5,00,000 and ₹10,00,000, a 20% tax rate is applied.
- If the income is greater than ₹10,00,000, a 30% tax rate is applied.

The result is printed on the screen with the calculated tax amount.

## Features

- Takes user input for annual income.
- Determines the tax bracket based on income.
- Calculates and displays the tax amount that needs to be paid.
- Handles incomes from ₹0 to any value greater than ₹10,00,000.

## Requirements

- Java Development Kit (JDK) version 8 or higher.
- A terminal or command prompt to compile and run the Java program.

## Usage

### Step 1: Compile the Program

Navigate to the directory where the `TaxCalculator.java` file is located, and compile it using the following command:

```bash
javac TaxCalculator.java
```

### Step 2: Run the Program

After compiling, run the program using:

```bash
java FUNDAMENTALS.INCOME_TAX_CALCULATOR.TaxCalculator
```

### Step 3: Input Your Income

The program will prompt you to enter your annual income. For example:

```bash
Enter your income: 600000
```

### Step 4: View the Output

The program will display the applicable tax:

```bash
You need to pay 20% tax amount: 120000
```

## Example

### Example 1: Income Below ₹5,00,000

```bash
Enter your income: 400000
You do not pay any tax amount.
```

### Example 2: Income Between ₹5,00,000 and ₹10,00,000

```bash
Enter your income: 600000
You need to pay 20% tax amount: 120000
```

### Example 3: Income Above ₹10,00,000

```bash
Enter your income: 1500000
You need to pay 30% tax amount: 450000
```

## Code Explanation

1. **User Input:** The program prompts the user to input their income using the `Scanner` class.
2. **Tax Calculation:**
   - If income is below ₹5,00,000, no tax is calculated.
   - If income is between ₹5,00,000 and ₹10,00,000, 20% tax is calculated.
   - If income is above ₹10,00,000, 30% tax is calculated.
3. **Output:** Based on the calculated tax, the program prints the appropriate message showing the tax amount.
