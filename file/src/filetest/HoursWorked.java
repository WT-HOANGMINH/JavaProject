package filetest;

import java.io.*;
import java.util.*;

public class HoursWorked {

    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner input = new Scanner(new File("D:\\test1.txt"));
        int id = 0, days = 0;
        String name = null;
        double totalHours = 0;
        
        while (input.hasNext()) {
            id = input.nextInt();
            name = input.next();
            totalHours = 0.0;
            days = 0;
            while (input.hasNextDouble()) {
                totalHours += input.nextDouble();
                days++;
            }
            System.out.println(name + " (ID#" + id + ") worked " + totalHours + " hours (" + (totalHours / days) + " hours/day)");
        }
    }
}
