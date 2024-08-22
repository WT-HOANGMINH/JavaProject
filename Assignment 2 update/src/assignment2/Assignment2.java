
package assignment2;

import java.util.Scanner;

public class Assignment2 {
    
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = keyboard.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = keyboard.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
    
}
