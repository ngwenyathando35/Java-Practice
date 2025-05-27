
package question.pkg4;

// @author Sabelwe
 
public class Manager extends Employee {
    private double bonus;
    
    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
    }
    @Override
    public double getSalary()
    {
       double baseSalary=super.getSalary();
       return baseSalary+bonus;
    }
    public void setBonus(double b)
    {
        bonus=b;
    }
    
}
