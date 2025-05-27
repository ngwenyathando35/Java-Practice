package student;
/*
 * Filename Student.java
 * Written by Thando Ngwenya
 * Written on 20/12/2020
 * Description : This is an abstract Student class for Parker University. The class contains fields for student
        ID number, last name, and annual tuition. It also has a constructor that requires parameters for the ID 
        number and name. Include get and set methods for each field; the setTuition() method is abstract.
 */
public abstract class Student 
{
    private int id; 
    private String surname;
    double tuition;
    public Student(int id, String name)
    {
        this.id = id;
        surname = name;
    }
    public void setId(int i)
    {
        id = i;
    }
    public int getId()
    {
        return id;
    }
    public void setSurname(String name)
    {
        surname = name;
    }
    public String getSurname()
    {
        return surname;
    }
    public abstract void setTuition();
    public double getTuition()
    {
        return tuition;
    }
}