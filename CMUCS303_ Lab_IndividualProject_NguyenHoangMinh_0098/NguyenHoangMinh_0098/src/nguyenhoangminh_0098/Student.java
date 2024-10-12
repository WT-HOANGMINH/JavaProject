
package nguyenhoangminh_0098;


public class Student {
    private String name;
    private double gpa;
    private String id;
    private String dob;
    private String major;
    public Student(){}

    public Student(String name, double gpa, String id, String dob, String major) {
        this.name = name;
        this.gpa = gpa;
        this.id = id;
        this.dob = dob;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getId() {
        return id;
    }

    public String getDob() {
        return dob;
    }

    public String getMajor() {
        return major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", GPA: " + gpa + ", DOB: " + dob + ", Major: " + major;
    }
}
