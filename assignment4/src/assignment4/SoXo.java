package assignment4;

import java.util.Random;
import java.util.Scanner;

public class SoXo {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberResult = rand.nextInt(100);
        System.out.println("y: Random number \nn: End");
        System.out.print("Enter your choose (y/n): ");
        String check = scanner.next();
        
        while (!check.equals("n")) {
            System.out.println("Random number: " + numberResult);
            if (!check.equals("n")) {
                numberResult = rand.nextInt(100);
            }
            System.out.print("Enter your choose (y/n): ");
            check = scanner.next();
        }
    }
}
