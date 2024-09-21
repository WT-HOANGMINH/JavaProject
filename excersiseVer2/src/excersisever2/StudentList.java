package excersisever2;

import java.util.ArrayList;

public class StudentList {

    private ArrayList<Students> studentlist;
    
    public StudentList() {
    studentlist = new ArrayList<>();
    }

    void addStudent(Students s) {
        studentlist.add(s);
    }

    void deleteStudentById(String id) {
        for (Students s : studentlist) {
            if (s.id.equals(id)) {
                studentlist.remove(s);
            }
        }
    }

    void findStudentById(String id) {
        for (Students s : studentlist) {
            if (s.id.equals(id)) {
                System.out.println("Student you need to find : ");
                s.displayInfo();
            }
        }
    }
    
        void displayAllStudents(){
        for(Students s : studentlist){
            s.displayInfo();
        }
    }
        public Students findTopStudents(){
            Students top = new Students() ;
            for(Students s : studentlist){
                if(top.gpa<=s.gpa){
                    top = s ;
                }
            }
            return top ;
        }
        public ArrayList<Students> findSchoolarShipStudents(){
            ArrayList<Students>scl = new ArrayList();
            for(Students s : studentlist){
                if(s.Schoolarship == true ){
                    scl.add(s);
                }
            }
            return scl;
        }
        public double caculateTuitionOfAllStudents(){
            double all=0;
            for(Students s : studentlist){
                all += s.tuition;
            }
            return all;
        }
}
