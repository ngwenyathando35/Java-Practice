package question.pkg4;
import java.util.*;
// @author Sabelwe

public class Employee 
{
    private final String name;
    private double salary;
    private final Date hireday;
    
    public Employee(String n, double s,int year, int month, int day)
    {
        name=n;
        salary=s;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        hireday=calendar.getTime();
    }
    public String getName()
    {
        return name;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public Date getHireDay()
    {
        return hireday;
    }
    
    public void raiseSalary(double byPercent)
    {
        double raise=salary*byPercent/100;
        salary+=raise;
    }
    
}
