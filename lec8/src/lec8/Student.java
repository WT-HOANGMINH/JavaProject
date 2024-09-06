
package lec8;

public class Student
{
    int id ; 
    String name ;
    int age;
    public Student( int id , String name )
    {
        
        this.id= id;
        this.name = name;
    }
     public Student( int id , String name , int age )
    {
        
        this.id= id;
        this.name = name;
        this.age = age; // without this the value is null :)
    }
    public void display()
    {
        System.out.println(this.name+" "+this.id+" "+this.age);
    }
}

 
