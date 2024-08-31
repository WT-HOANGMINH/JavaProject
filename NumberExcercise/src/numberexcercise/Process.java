package numberexcercise;

import java.util.*;
import static numberexcercise.NumberExcercise.Max2;
import static numberexcercise.NumberExcercise.deleteOddNumber;
import static numberexcercise.NumberExcercise.importData;
import static numberexcercise.NumberExcercise.printData;

public class Process {

    static void menu() {
        System.out.println("[1]. Print the number in array");
        System.out.println("[2]. Find the second biggest number in array");
        System.out.println("[3]. Delete odd numbers");
    }

    static void suggest() {
        System.out.print("[?] Back to menu y/n : ");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size for array: ");
        int n = scanner.nextInt();
        int inmenu = 0;
        String outmenu;
        ArrayList<Integer> number = importData(n);

        do {
            menu();
            System.out.println("Enter your choice: ");
            do {
                inmenu = scanner.nextInt();
            } while (inmenu <= 0 || inmenu > 3); // Validate menu input

            switch (inmenu) {
                case 1:
                    int[] numberArray = number.stream().mapToInt(i -> i).toArray();
                    printData(numberArray);
                    suggest();
                    outmenu = scanner.next();
                    break;
                case 2:
                    numberArray = number.stream().mapToInt(i -> i).toArray();
                    int secondMax = Max2(numberArray);
                    System.out.println("The second biggest number is: " + secondMax);
                    suggest();
                    outmenu = scanner.next();
                    break;
                case 3:
                    numberArray = number.stream().mapToInt(i -> i).toArray();
                    deleteOddNumber(numberArray);
                    suggest();
                    outmenu = scanner.next();
                    break;
                default:
                    outmenu = "n";
            }
        } while (outmenu.equalsIgnoreCase("y")); // Loop while user wants to continue
    }
}
