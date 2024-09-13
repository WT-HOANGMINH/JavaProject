
package excersisepractice;

import java.text.SimpleDateFormat;
import java.util.Date;


abstract class Person implements IPperson{
    String id ;
    String fullName ;
    SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
    Date dateOfBirth = null ;
    public Person() {
    }
    public Person(String id, String fullName, Date dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        try {
        this.dateOfBirth = dateOfBirth;
        } catch (Exception e) {
        }
    }
    @Override
    public abstract void displayInfo();
}
