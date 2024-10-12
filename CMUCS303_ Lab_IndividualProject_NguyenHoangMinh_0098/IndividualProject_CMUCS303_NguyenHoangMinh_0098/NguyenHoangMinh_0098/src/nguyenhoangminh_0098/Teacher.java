package nguyenhoangminh_0098;

import java.util.Date;

public class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate, String department, String teachingSubject) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

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

    @Override
    public String toString() {
        return super.toString() + "Teacher{" + "department=" + department + ", teachingSubject=" + teachingSubject + '}';
    }

    @Override
    public void addPerson() {
    }

    public void updatePerson(String id) {
    }

    @Override
    public void displayInfo() {
        System.out.println(toString());
    }

    public boolean isBookOverdue() {
        Date currentDate = new Date();
        return currentDate.after(getBookReturnDate());
    }
}
