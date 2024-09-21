/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ver3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Processor {

    public static void main(String[] args) {
        PersonList personlist = new PersonList();
        Scanner sc = new Scanner(System.in);
        
        
        int choice = 0;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Add new student\n"
                    + "2. Add new teacher\n"
                    + "3. Update person by id\n"
                    + "4. Delete person by id\n"
                    + "5. Display all students and teachers\n"
                    + "6. Find the student with the highest GPA\n"
                    + "7. Find teachers by department");

            System.out.println("8. Exit");
            System.out.println("=======================================");
            System.out.println("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Student student = new Student();
                    personlist.addStudent(student);
                    break;
                case 2:
                    Teacher teacher = new Teacher();
                    personlist.addTeacher(teacher);
                    break;
                case 3: 
                    System.out.println("Enter ID: ");
                    String id = sc.nextLine();
                    personlist.updatePerson(id);
                    break;
                case 4:
                    System.out.println("Enter ID: ");
                    id = sc.nextLine();
                    personlist.deletePersonById(id);
                    break;
                case 5:
                    personlist.displayEveryone();
                    break;
                case 6:
                    personlist.findTopStudent();
                    break;
                case 7:
                    String department = sc.nextLine();
                    personlist.findTeacherByDepartment(department);
                    break;
                    default:
                        System.out.println("Wrong !!!");
                        break;
            }

        } while (choice != 8);

    }
}
