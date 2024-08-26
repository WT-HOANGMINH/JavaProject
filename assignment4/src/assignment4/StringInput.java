package assignment4;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a multi-word sentence: ");
        String sentence = scanner.nextLine();
        System.out.println(sentence);
        
        System.out.print("Enter a one word string: ");
        String s = scanner.next();
        System.out.println(s);
    }
}
