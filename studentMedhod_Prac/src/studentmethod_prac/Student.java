package studentmethod_prac;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student {
    Scanner sc = new Scanner(System.in);
    String id, fullName, major;
    float gpa;
    Date dateOfBirth;

    public Student(String fullName, String id, String major, float gpa, Date dateOfBirth) {
        this.gpa = gpa;
        this.fullName = fullName;
        this.id = id;
        this.major = major;
        this.dateOfBirth = dateOfBirth;
    }

    public Student() {
    }
    public void enterInformationStudent() {
        System.out.println("Enter information:");
        System.out.print("Name: ");
        fullName = sc.nextLine();
        System.out.print("Id: ");
        id = sc.nextLine();
        System.out.print("Major: ");
        major = sc.nextLine();
        System.out.print("GPA: ");
        gpa = sc.nextFloat();
        sc.nextLine(); 
        System.out.print("Date of birth (dd/MM/yyyy): ");
        String dob = sc.nextLine();

    }
    public String toString(){
        SimpleDateFormat test = new SimpleDateFormat("dd/MM/yyyy");
        return "Student " +"id ='" + id + '\'' + ", fullName='" + fullName + '\'' + ", major='" + major + '\'' + ", Gpa=" + gpa + ", dateOfBirth=" + test.format(dateOfBirth) ;
        
    }
}

