
package studentmedhod_prac;

import java.util.Date;
import studentmethod_prac.Student;

public class processor {
    public static void main(String[] args) {
         Student student = new Student("", "", "", 0.0f, new Date());
        student.enterInformationStudent();
        System.out.println(student.toString());
    }
}
