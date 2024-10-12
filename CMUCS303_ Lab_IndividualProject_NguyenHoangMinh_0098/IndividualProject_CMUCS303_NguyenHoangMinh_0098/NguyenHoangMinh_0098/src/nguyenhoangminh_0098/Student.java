
package nguyenhoangminh_0098;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {
    private float gpa;
    private String major;
    Scanner sc = new Scanner(System.in);

    public Student(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate, float gpa, String major) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.gpa = gpa;
        this.major = major;
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

    public void addPerson() {
        System.out.println("name: "); String name = sc.nextLine(); setFullName(name);
        System.out.println("id: "); String id = sc.nextLine(); setId(id);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("date of birth"); Date date = sdf.parse(sc.nextLine());setDateOfBirth(date);
            System.out.println("date book borrow");  date = sdf.parse(sc.nextLine());setBookBorrowDate(date);
            System.out.println("date book return "); date = sdf.parse(sc.nextLine());setBookReturnDate(date);
        } catch (Exception e) {
        }
        System.out.println("gpa : "); float gpa = sc.nextFloat(); sc.nextFloat(); setGpa(gpa);
    }
    public void updatePerson(String id) {
        
    }

    @Override
    public void displayInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" + "gpa=" + gpa + ", major=" + major + '}';
    }

    public boolean isBookOverdue() {
        Date currentDate = new Date();
        return currentDate.after(getBookReturnDate());
    }
}
