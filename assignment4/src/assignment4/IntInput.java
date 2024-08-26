package assignment4;

import java.util.Scanner;

public class IntInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Enter an int number: " );
        int number = scanner.nextInt();
        System.out.println(number);
    }
    
}