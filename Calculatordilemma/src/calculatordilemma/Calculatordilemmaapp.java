package calculatordilemma;
import java.util.Scanner;

	public class Calculatordilemmaapp {
    public static void main(String[] args) {
    	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the first number: ");
		        double num1 = scanner.nextDouble();

		        System.out.print("Enter the second number: ");
		        double num2 = scanner.nextDouble();

		        System.out.print("Enter the operation (+, -, *, /): ");
		        char operation = scanner.next().charAt(0);

		        double result = performOperation(num1, num2, operation);
		        System.out.println("Result: " + result);}
       
		    

		    public static double performOperation(double num1, double num2, char operation) {
		        double result = 0.0;

		        switch (operation) {
		            case '+':
		                result = num1 + num2;
		                break;
		            case '-':
		                result = num1 - num2;
		                break;
		            case '*':
		                result = num1 * num2;
		                break;
		            case '/':
		                if (num2 != 0) {
		                    result = num1 / num2;
		                } else {
		                    System.out.println("Error: Cannot divide by zero.");
		                }
		                break;
		                
		            default:
		                System.out.println("Error: Invalid operation.");
		                break;
		        }

		        return result;
		    }
	}
		


	


