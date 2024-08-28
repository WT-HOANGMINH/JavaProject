package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Weather2 {
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
        
        System.out.println("Temperatures: " + Arrays.toString(temps));
        Arrays.sort(temps);
        System.out.println("Two coldest days: " + temps[0] + ", " + temps[1]);
        System.out.println("Two hottest days: " + temps[temps.length - 1] + ", " + temps[temps.length - 2]);
    }
}
