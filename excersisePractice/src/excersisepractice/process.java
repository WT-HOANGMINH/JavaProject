
package excersisepractice;

import java.text.SimpleDateFormat;
import java.util.*;

public class process {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StudentList s = new StudentList();
    String idtemp = null;
    Student a = new Student();
    Student b = new Student();
    Student c = new Student();
    
    // khoi tao 
    
    a.addStudent();   b.addStudent(); c.addStudent(); s.addStudent(a);  s.addStudent(b); s.addStudent(c); // add 
    s.displayAllStudent(); // in toan bo hsinh
    System.out.println("highest score student : ");
    s.findTopStudent().displayInfo();// hoc sinh diem cao nhat
    System.out.println("enter id to delete : ");
    idtemp = sc.nextLine(); 
    s.deleteStudentById(idtemp); //  xoa id 
    s.displayAllStudent(); // in toan bo hsinh sau khi xoa
    System.out.println("enter id to find : ");
    idtemp = sc.nextLine(); 
    s.findStudentByid(idtemp); //  tim id
    }
}
