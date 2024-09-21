/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ver3;

import com.sun.net.httpserver.SimpleFileServer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student extends Person implements IPerson{
    public static Scanner sc = new Scanner(System.in);
    private float gpa;
    private String major;

    public Student(float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public Student(float gpa, String major, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public Student() {
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void displayInfo() {
        System.out.println(toString());
    }

    @Override
    public void updatePerson() {
       addPerson();
      
       
    }

    @Override
    public void addPerson() {
        System.out.println("Enter student: ");
        this.fullName = sc.nextLine();
        System.out.println("Enter ID: ");
        this.id = sc.nextLine();
        System.out.println("Enter Date: ");
        String date1 = sc.nextLine();
        SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy");
        try{
            this.dateOfBirth = date2.parse(date1);
        }catch(Exception e){
            System.out.println("Wrong format !");
        }
        System.out.println("Enter GPA: ");
        this.gpa = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter major: ");
        this.major = sc.nextLine();
        
    }

    @Override
    public String toString() {
        return "Student{" + "gpa=" + gpa + ", major=" + major + "id=" + id +"fullName=" + fullName + "dateOfBirth=" + dateOfBirth + '}';
    }
    
}
