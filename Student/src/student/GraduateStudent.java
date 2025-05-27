/*
 * Filename GraduateStudent.java
 * Written by Thando Ngwenya
 * Written on 20Sep2020
 * Description : This is a subclass of Student. It has a setTuition() method. Tuition is $6,000 per semester
 */
package student;
public class GraduateStudent extends Student
{
    public GraduateStudent(int id, String name) 
    {
        super(id, name);
    }
    @Override
    public void setTuition() 
    {
        tuition = 6000;
    }
}