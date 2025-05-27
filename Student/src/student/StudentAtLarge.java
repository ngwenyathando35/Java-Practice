/*
 * Filename StudentAtLarge.java
 * Written by Thando Ngwenya
 * Written on 20Sep2020
 * Description : This is a subclass of Student. It has a setTuition() method. Tuition for a StudentAtLarge is 
        $2,000 per semester 
 */
package student;
public class StudentAtLarge extends Student
{
    public StudentAtLarge(int id, String name) 
    {
        super(id, name);
    }
    @Override
    public void setTuition() 
    {
        tuition = 2000;
    }
}