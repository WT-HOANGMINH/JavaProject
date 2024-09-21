/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ver3;

import java.util.ArrayList;
import java.util.Iterator

/**
 *
 * @author Admin
 */
public class PersonList {

    public static ArrayList<Person> personlist = new ArrayList<Person>();

    

    public PersonList() {
    }

    public static ArrayList<Person> getPersonlist() {
        return personlist;
    }

    public static void setPersonlist(ArrayList<Person> personlist) {
        PersonList.personlist = personlist;
    }

    

    

    public void addStudent(Student student) {
        student.addPerson();
        personlist.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teacher.addPerson();
        personlist.add(teacher);
    }

    public void displayEveryone() {
        for (Person person : personlist) {
            System.out.println(person);
        }
    }

    public void deletePersonById(String id) {
        Iterator<Person> iter = personlist.iterator();
        while (iter.hasNext()) {
            Person p = iter.next();
            if (id.equals(p.getId()));
            iter.remove();
        }
    }

    public void updatePerson(String id) {
             for (Person person : personlist) {
            if(id.equals(person.getId())){
                if(person instanceof Student){
                   Student student = (Student) person;
                   student.updatePerson();
                            
                }else if(person instanceof Teacher){
                    Teacher teacher = (Teacher) person;
                    teacher.updatePerson();
                    
                }
            }
        }
    }

    public Person findPersonById(String id) {
        Iterator<Person> iter = personlist.iterator();
        while (iter.hasNext()) {
            Person p = iter.next();
            if (id.equals(p.getId()));
            System.out.println(p);

        }
        return null;

    }

    public Student findTopStudent() {
        for (Person person : personlist) {
            if(person instanceof Student){
                Student student = (Student) person;
                Student topstudent = (Student) personlist.get(0);
                for (Person person1 : personlist) {
                    if(student.getGpa() > topstudent.getGpa()){
                        topstudent = student;
                    }
                }
                for (Person person1 : personlist) {
                    if(topstudent.getGpa() == student.getGpa() && !topstudent.getId().equals(student.getId())){
                        System.out.println(topstudent);
                }
            }
              return topstudent;  
        }

    }
        return null;
    }
    public Person findTeacherByDepartment(String department) {
        Iterator<Person> iter = personlist.iterator();
        while (iter.hasNext()) {
            Teacher teacher = (Teacher) iter.next();
            if (department.equals(teacher.getDepartment())) {
                teacher.displayInfo();
            }
        }
        return null;
        
    }

}
