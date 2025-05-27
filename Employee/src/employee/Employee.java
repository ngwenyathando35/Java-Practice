package employee;
/*
 * Filename Employee.java
 * Written by The Textbook
 * Written on The Covid Year
 * Description :  */
public class Employee
{
    //Data Fields
    private int empNum;
    private String empLastName;
    private String empFirstName;
    private double empSalary;
    
    //Class Methods
    public int getEmpNum()
    {
        return empNum;
    }
    public void setEmpNum(int emp)
    {
        empNum = emp;
    }
    public String getEmpLastName()
    {
        return empLastName;
    }
    public void setEmpLastName(String name)
    {
        empLastName = name;
    }
    public String getEmpFirstName()
    {
        return empFirstName;
    }
    public void setEmpFirstName(String name)
    {
        empFirstName = name;
    }
    public double getEmpSalary()
    {
        return empSalary;
    }
    public void setEmpSalary(double sal)
    {
        empSalary = sal;
    }
    //Constructor
    public Employee(String name, String surname, int num, double sal)
    {
        empFirstName = name;
        empLastName = surname;
        empSalary = sal;
        empNum = num;
    }
}