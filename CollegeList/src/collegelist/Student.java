/*
 * Filename Student.java
 * Written by Thando Ngwenya
 * Written on 29/08/2020
 * Description : This is a Student derived class that descends from Person. It contains a major field of study and
        a grade point average as well as methods that override the Person methods to accept and display these
        additional facts.
 */
package collegelist;
import javax.swing.JOptionPane;
public class Student extends Person
{
    private String fieldOfStudy;
    private double gradePointAverage;
    public void setgradeAverage()
    {
        gradePointAverage = Double.parseDouble(JOptionPane.showInputDialog("Student","Enter your GPA"));
    }
    public void setFieldOfStudy()
    {
        fieldOfStudy = JOptionPane.showInputDialog("Student","Enter your field of study");
    }
    public void displayStudent()
    {
        display();
        System.out.println("Field of study : " + fieldOfStudy);
        System.out.println("Grade Point Average : " + gradePointAverage);
    }
}