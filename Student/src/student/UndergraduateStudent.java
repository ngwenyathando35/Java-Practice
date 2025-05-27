/*
 * Filename UndergraduateStudent.java
 * Written by Thando Ngwenya
 * Written on 20Sep2020
 * Description : This is a subclass of Student. It has a setTuition() method. Tuition is $4,000 per semester,
 */
package student;
public class UndergraduateStudent extends Student
{
    public UndergraduateStudent(int id, String name) 
    {
        super(id, name);
    }
    @Override
    public void setTuition() 
    {
        tuition = 4000;
    }
}