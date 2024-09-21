package excersisever2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Students extends Person {

    Scanner sc = new Scanner(System.in);
    float gpa;
    String major;
    double tuition;
    boolean Schoolarship;

    public Students() {
        this.tuition = 10000000;
    }

    public Students(float gpa, String major, String id, String name, Date dob) {
        super(id, name, dob);
        this.gpa = gpa;
        this.major = major;
        this.tuition = 10000000;
        if (gpa >= 9) {
            this.tuition = tuition / 2;
        } else {
            this.tuition = tuition;
        }
        if (gpa >= 9) {
            this.Schoolarship = true;
        } else {
            this.Schoolarship = false;
        }
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

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public boolean isSchoolarship() {
        return Schoolarship;
    }

    public void setSchoolarship(boolean Schoolarship) {
        this.Schoolarship = Schoolarship;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleDateFormat getDf() {
        return df;
    }

    public void setDf(SimpleDateFormat df) {
        this.df = df;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void addStudent() {
        System.out.println("name : ");
        name = sc.nextLine();
        System.out.println("id : ");
        id = sc.nextLine();
        System.out.println("major : ");
        major = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("dd/MM/yyyy : ");
            dob = df.parse(sc.nextLine());
        } catch (ParseException e) {
        }
        System.out.println("gpa :");
        gpa = sc.nextFloat();
        sc.nextLine();
        checkSchoolarShip();
        caculateTuition();
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Students{" + " name = " + name + " id= " + id + " date of birth = " + sdf.format(dob) + " gpa= " + gpa + " major= " + major + " tuition= " + tuition + " Schoolarship= " + Schoolarship);
    }

    public double caculateTuition() {
        if (gpa >= 9) {
            tuition = tuition / 2;
        }
        return tuition;
    }
    public void checkSchoolarShip() {
        if(gpa>=9){
            Schoolarship = true;
//            setSchoolarship(true);
        }
    }
}

