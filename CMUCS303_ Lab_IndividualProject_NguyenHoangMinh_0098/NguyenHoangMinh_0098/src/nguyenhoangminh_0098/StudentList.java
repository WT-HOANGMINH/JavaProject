
package nguyenhoangminh_0098;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> students;

    public StudentList() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String id) {
        students.removeIf(student -> student.getId().equals(id));
    }

    public Student findStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public Student findTopGpaStudent() {
        return students.stream().max((s1, s2) -> Double.compare(s1.getGpa(), s2.getGpa())).orElse(null);
    }

    public List<Student> getAllStudents() {
        return students;
    }
}

