
package javaapplication9;

import java.util.Scanner;

public class JavaApplication9 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Full name : ");
        String name = scanner.nextLine();
        
        System.out.println(" Age : ");
        int age = scanner.nextInt();
        int year = 2024-age ;
        String sex ;
        do{
        System.out.println(" Sex : ");
        sex = scanner.next();
        }while(!sex.equals("nam") && !sex.equals("nu"));
        
        scanner.nextLine();
        System.out.println("Major : ");
        String subject = scanner.nextLine();
        
        System.out.println("GPA : ");
        float gpa = scanner.nextFloat();
        scanner.nextLine();
        
        System.out.println("country : ");
        String country = scanner.nextLine();
        
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Year of Birth: " + year);
        System.out.println("Sex: " + sex);
        //scanner.next();
        System.out.println("Major: " + subject);
        //scanner.next();
        System.out.println("GPA: " + gpa);
        System.out.println("Country: " + country);
        
    }
    
}
