package assignment4;

import java.util.Scanner;

public class FloatAndDoubleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a float: ");
        float f = scanner.nextFloat();
        System.out.println(f);
        
        System.out.print("Enter a double number: ");
        double d = scanner.nextDouble();
        System.out.println(d);
    }
}