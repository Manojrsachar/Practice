package Bitwiseswapper;
import java.util.Scanner;

public class Bitwiseswapperapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        swapUsingBitwise(num1, num2);   
       }

    public static void swapUsingBitwise(int a, int b) {
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping: First = "+a+", Second ="+b);
       
    }}
