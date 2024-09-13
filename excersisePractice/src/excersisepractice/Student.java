
package excersisepractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Student extends Person{
    public float gpa ;
    private String major ;
    public Student() {       
    }
    public Student(float gpa, String major, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public void addStudent() {

        Scanner sc = new Scanner(System.in);
        System.out.println("name :");
        fullName = sc.nextLine();
        System.out.println("major : ");
        major = sc.nextLine();
        System.out.println("id : ");
        id = sc.nextLine();
        System.out.println("gpa : ");
        gpa = sc.nextFloat(); sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        try {
            System.out.println("enter date dd/mm/yyyy ");
            dateOfBirth = df.parse(sc.nextLine());
        } catch (ParseException e) {
        }
    }
    
    @Override
      public void displayInfo() {
          System.out.println(" Student : " +fullName+ " " + " gpa = " + gpa + " major = "+ major + " id = "+ id +" "+"date of birth : "+df.format(dateOfBirth) );
    } 
}
