package excersisepractice;

import java.util.*;

public class StudentList {

    private ArrayList<Student> studentList;

    public StudentList() {
        studentList = new ArrayList();
    }

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public void displayAllStudent() {
        for (Student s : studentList) {
            s.displayInfo();
        }
    }

    public void deleteStudentById(String id) {
        Student rm = null;
        for (Student s : studentList) {
            if (s.id.equals(id)) {
                rm = s;
            }
        }
        if (rm != null) {
            studentList.remove(rm);
            System.out.println("remove successfully");
        } else {
            System.out.println("remove unsuccessfully beacause id no value ! ");
        }
    }
    public void findStudentByid(String id ){
           for (Student s : studentList) {
            if (s.id.equals(id)) {
                System.out.println("student you want to find : ");
                s.displayInfo();
            }
        }
    }
    public Student  findTopStudent(){
        float max = 0 ;
        Student maxGpa = null;
        for (Student s : studentList){
            if(max<s.gpa){
            max = s.gpa;}
        }
        for (Student s : studentList){
            if(s.gpa == max){
              maxGpa = s;  
            }
        }
        return maxGpa;
    }
}
