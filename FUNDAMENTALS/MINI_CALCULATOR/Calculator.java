package FUNDAMENTALS.MINI_CALCULATOR;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isCalculate = true;
        
        while(isCalculate){
            // Enter the first number
            System.out.print("Enter the first number: ");
            int num_1 = sc.nextInt();
            
            // Entering arithmetic operator for operation
            System.out.print("Enter the operator you want (+, -, *, /, %): ");
            char operator = sc.next().charAt(0);
            
            // Enter the second number
            System.out.print("Enter the second number: ");
            int num_2 = sc.nextInt();
            
            switch (operator) {
                case '+':
                    int add = num_1 + num_2;
                    System.out.println("Addition of two numbers is: " + add);
                    break;
                    
                case '-':
                    int sub = num_1 - num_2;
                    System.out.println("Subtraction of two numbers is: " + sub);
                    break;
                    
                case '*':
                    int mul = num_1 * num_2;
                    System.out.println("Multiplication of two numbers is: " + mul);
                    break;
                    
                case '/':
                    if (num_2 != 0) {
                        int div = num_1 / num_2;
                        System.out.println("Division of two numbers is: " + div);
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;
                    
                case '%':
                    int mod = num_1 % num_2;
                    System.out.println("Modulus of two numbers is: " + mod);
                    break;
                    
                default:
                    System.out.println("Invalid operator! Please enter one of +, -, *, /, %.");
            }
            
            System.out.print("Enter 'y' for more calculations and 'n' for termination: ");
            char letter = sc.next().charAt(0);
            
            if(letter == 'y'){
                isCalculate = true;
            } else {
                isCalculate = false;
            }
        }
        
        sc.close();
    }
}
