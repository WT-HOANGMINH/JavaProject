
package assignment3;

import java.util.Scanner;


public class Assignment3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        if (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println("You have entered a string: " + input);
        } else {
            System.out.println("This is not a string.");
        }
        scanner.nextLine(); 

        System.out.println("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("You have entered an integer: " + number);
        } else {
            System.out.println("This is not an integer.");
            scanner.next();  
        }
        scanner.nextLine();  

        System.out.println("Full name: ");
        String name = scanner.nextLine();

        System.out.println("Age: ");
        int age = scanner.nextInt();
        int year = 2024 - age;
        
        scanner.nextLine(); 

        String sex;
        do {
            System.out.println("Sex (nam/nu): ");
            sex = scanner.nextLine();
        } while (!sex.equalsIgnoreCase("nam") && !sex.equalsIgnoreCase("nu"));

        System.out.println("Major: ");
        String subject = scanner.nextLine();

        System.out.println("GPA: ");
        float gpa = scanner.nextFloat();
        scanner.nextLine();  

        System.out.println("Country: ");
        String country = scanner.nextLine();

        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Year of Birth: " + year);
        System.out.println("Sex: " + sex);
        System.out.println("Major: " + subject);
        System.out.println("GPA: " + gpa);
        System.out.println("Country: " + country);

        scanner.close();
    }
    
}
