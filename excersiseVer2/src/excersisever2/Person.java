
package excersisever2;

import java.text.SimpleDateFormat;
import java.util.Date;


abstract class Person implements IPperson{
    String id ;
    String name ;
    SimpleDateFormat df = new SimpleDateFormat();
    Date dob= new Date();
    
    public Person(){}

    public Person(String id, String name, Date dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
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
    
    @Override
    public abstract void displayInfo();
}
