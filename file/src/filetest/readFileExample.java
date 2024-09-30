package filetest;

import java.util.Scanner;
import java.io.*;

public class readFileExample {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("D:\\test1.txt"));
        String firstWord = sc.next();
        System.out.println("first word : " + firstWord);
        String firstLine = sc.nextLine();
        System.out.println("first line : " + firstLine);

    }
}
