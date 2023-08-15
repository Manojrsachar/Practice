package Operatorvalidator;
import java.util.Scanner;

public class Operatorvalidatorapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have a valid ID? (true/false): ");
        boolean hasValidID = scanner.nextBoolean();

        boolean isValid = isValidInput(age, hasValidID);
        if (isValid) {
            System.out.println("Input is valid.");
        } else {
            System.out.println("Input is not valid.");
        }

            }

    public static boolean isValidInput(int age, boolean hasValidID) {
        
        boolean validAge = age >= 18 && age <= 65; 
        boolean validID = hasValidID || age >= 65; 

        
        boolean isValid = validAge && validID; 
        return isValid;
    }
}
