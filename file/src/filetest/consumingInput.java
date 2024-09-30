package filetest;

import java.io.*;
import java.util.Scanner;

public class consumingInput {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("D:\\test1.txt"));

        // Check if the next token is a double before consuming it
        while (sc.hasNext()) {
            if (sc.hasNextDouble()) {
                double d = sc.nextDouble();
                System.out.print("double : " + d);
                System.out.println("");
            } else {
                System.out.println("The input file does not contain a valid double value.");
            }
        }
    }
}
