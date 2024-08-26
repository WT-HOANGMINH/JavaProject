package assignment4;

import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a boolean: ");
        boolean b = scanner.nextBoolean();
        System.out.println(b);
    }
}