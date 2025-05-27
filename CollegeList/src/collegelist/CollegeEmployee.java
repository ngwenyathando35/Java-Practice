/* Filename CollegeEmployee.java
 * Written by Thando Ngwenya pg Chapter 10 exercises
 * Written on 29/08/2020
 * Description : This is a CollegeEmployee child class that descends from Person. It includes a Social Security 
        number, an annual salary, and a department name, as well as methods that override the Person methods to 
        accept and display all CollegeEmployee data.
 */
package collegelist;
import javax.swing.JOptionPane;
public class CollegeEmployee extends Person
{
    private int socialSecurityNum, salary;
    private String departmentName;
    public void setSocialSecurityNumber()
    {
        socialSecurityNum = Integer.parseInt(JOptionPane.showInputDialog("College Employee", 
                "Please enter your social securty number"));
    }
    public void setSalary()
    {
        salary = Integer.parseInt(JOptionPane.showInputDialog("College Employee", 
                "Please enter your annual salarynumber"));
    }
    public void setDepartmentName()
    {
        departmentName = JOptionPane.showInputDialog("College Employee", "Please enter the department name");
    }
    public void displayCollegeEmployee()
    {
        display();
        System.out.println("College Employee Details\n");
        System.out.println("Social Security Number : " + socialSecurityNum + 
                "\nAnnual Salary : " + salary + 
                "\nDepartment name : " + departmentName);
    }
}