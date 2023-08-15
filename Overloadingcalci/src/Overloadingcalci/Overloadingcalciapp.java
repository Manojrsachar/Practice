package Overloadingcalci;
import java.util.Scanner;

public class Overloadingcalciapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = calculate(num1, num2, operator);
        System.out.println("Result: " + result);

        
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return calculateAddition(num1, num2);
            case '-':
                return calculateSubtraction(num1, num2);
            case '*':
                return calculateMultiplication(num1, num2);
            case '/':
                return calculateDivision(num1, num2);
            default:
                System.out.println("Invalid operator.");
                return Double.NaN; 
        }
    }

    public static double calculateAddition(double num1, double num2) {
        return num1 + num2;
    }

    public static double calculateSubtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double calculateMultiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double calculateDivision(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; 
        }
    }
}
