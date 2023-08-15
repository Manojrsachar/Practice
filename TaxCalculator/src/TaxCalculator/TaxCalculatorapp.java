package TaxCalculator;
import java.util.Scanner;

public class TaxCalculatorapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        System.out.print("Enter tax rate (in decimal form): ");
        double taxRate = scanner.nextDouble();

        double totalCost = calculateTotalWithTax(purchaseAmount, taxRate);
        System.out.println("Total cost including tax: " + totalCost);

      
    }

    public static double calculateTotalWithTax(double purchaseAmount, double taxRate) {
        double taxAmount = purchaseAmount * taxRate;
        double totalCost = purchaseAmount + taxAmount;
        return totalCost;
    }
}
