package assignment4;

import java.util.Random;
import java.util.Scanner;

public class Slide37_Lec5 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int checkCorrect = 0;
        int pointTotal = 0;
        int randProblem = rand.nextInt(2, 6);
        int randNumberForProblem;
        int resultTotal = 0;
        int answer;
        
        do {
            for (int i = 1; i <= randProblem ; i++) {
                if (i == randProblem) {
                    randNumberForProblem = rand.nextInt(1, 11);
                    System.out.print(randNumberForProblem + " = ");
                }
                else {
                    randNumberForProblem = rand.nextInt(1, 11);
                    System.out.print(randNumberForProblem + " + ");
                }
                resultTotal += randNumberForProblem;
            }
            answer = scanner.nextInt();
            if (answer == resultTotal) {
                pointTotal += 1;
            }
            else {
                System.out.println("Wrong! The answer was " + resultTotal);
                checkCorrect += 1;
            }
            resultTotal = 0;
            randProblem = rand.nextInt(2, 6);
        } while (checkCorrect != 3);
        System.out.println("You earned " + pointTotal + " total points.");
    }
}
