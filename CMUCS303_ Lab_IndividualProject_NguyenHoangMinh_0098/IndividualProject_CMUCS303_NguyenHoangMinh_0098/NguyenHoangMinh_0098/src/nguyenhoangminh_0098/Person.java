package nguyenhoangminh_0098;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements IPerson {

    private String fullName;
    private String id;
    private Date dateOfBirth;
    private Date bookBorrowDate;
    private Date bookReturnDate;

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Person{" + "fullName=" + fullName + ", id=" + id + ", dateofBirth=" + sdf.format(dateOfBirth) + ", bookBorrowDate=" + bookBorrowDate + ", bookReturnDate=" + bookReturnDate + '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getBookBorrowDate() {
        return bookBorrowDate;
    }

    public void setBookBorrowDate(Date bookBorrowDate) {
        this.bookBorrowDate = bookBorrowDate;
    }

    public Date getBookReturnDate() {
        return bookReturnDate;
    }

    public void setBookReturnDate(Date bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }

    public Person(String fullName, String id, Date dateofBirth, Date bookBorrowDate, Date bookReturnDate) {
        this.fullName = fullName;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.bookBorrowDate = bookBorrowDate;
        this.bookReturnDate = bookReturnDate;
    }

    public Person() {
    }

    @Override
    public void addPerson() {
    }

    @Override
    public void updatePerson() {
    }

    @Override
    public void displayInfo() {
    }

}
