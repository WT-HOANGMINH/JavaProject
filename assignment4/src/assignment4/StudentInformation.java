package assignment3;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input
        System.out.print("Enter full name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter year of birth: ");
        int yearOfBirth = scanner.nextInt();
        
        System.out.print("Enter sex: ");
        String sex = scanner.next();
        String rest1 = scanner.nextLine();
        
        System.out.print("Enter major: ");
        String major = scanner.nextLine();
        
        System.out.print("Enter GPA: ");
        float GPA = scanner.nextFloat();
        String rest2 = scanner.nextLine();
        
        System.out.print("Enter country: ");
        String country = scanner.nextLine();
        
        //Output
        System.out.println("| Your Profile |");
        System.out.println("Full name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Year of birth: " + yearOfBirth);
        System.out.println("Sex: " + sex);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + GPA);
        System.out.println("Country: "+ country);
    }
}
