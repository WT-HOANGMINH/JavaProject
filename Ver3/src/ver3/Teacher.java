/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ver3;

import java.text.SimpleDateFormat;
import java.util.Date;
import static ver3.Student.sc;

/**
 *
 * @author Admin
 */
public class Teacher extends Person implements IPerson{
    private String department;
    private String teachingSubject;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
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

    public Teacher(String department, String teachingSubject ) {
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public Teacher(String department, String teachingSubject , String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public Teacher() {
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
        System.out.println("Enter department: ");
        this.department = sc.nextLine();
        
        System.out.println("Enter teachingSubject: ");
        this.teachingSubject = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Student{" + "department=" + department + ", teachingSubject=" + teachingSubject + "id=" + id +"fullName=" + fullName + "dateOfBirth=" + dateOfBirth + '}';
    }
    
}
