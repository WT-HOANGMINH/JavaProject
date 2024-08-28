package assignment5;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many days' temparature?: ");
        int days = scanner.nextInt();
        
        int[] temps = new int[days];
        int sum = 0;
        
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temps[i] = scanner.nextInt();
            sum += temps[i];
        }
        double average = (double)sum / days;
        
        int count = 0;
        for (int i = 0; i < days; i++) {
            if (temps[i] > average) {
                count++;
            }
        }
        
        System.out.print("Average temps = " + average + "\n");
        System.out.println(count + " days above average");
    }
}
