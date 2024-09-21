
package ver3;

import java.util.Date;


abstract class Person implements IPerson{
    protected String id;
    protected String fullName;
    protected Date dateOfBirth;

    @Override
    public abstract void displayInfo();

    @Override
    public abstract void updatePerson();

    @Override
    public abstract void addPerson();

    public Person() {
    }

    public Person(String id, String fullName, Date dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", fullName=" + fullName + ", dateOfBirth=" + dateOfBirth + '}';
    }
   
    
}
