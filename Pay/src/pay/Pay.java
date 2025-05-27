/*
 * Filename Pay.java
 * Written by Thando Ngwenya
 * Written on 30/04/2020
 * Description : Write an interactive Java payroll application that calculates the net pay for a factory worker 
    The program prompts the user for skill level and hours worked, as well as appropriate insurance and 
    retirement options for the employee’s skill level category. The application displays: 
(1) the hours worked, 
(2) the hourly pay rate, 
(3) the regular pay for 40 hours, 
(4) the overtime pay, 
(5) the total of regular and overtime pay, and 
(6) the total itemized deductions. If the deductions exceed the gross pay, display an error message; otherwise, calculate and display 
(7) the net pay after all the deductions have been subtracted from the gross. 
 */
package pay;
public class Pay 
{
    private double netPay, payRate, regularPay,overTimePay,totRegAndOverPay;
    final double HOURLY_PAY_RATE_1 = 17; 
    final double HOURLY_PAY_RATE_2 = 20;
    final double HOURLY_PAY_RATE_3 = 22;
    private int skillLevel, hoursWorked, insuranceOptions;
    public void setSkillLevel(int skillLevel)
    {
        switch (skillLevel) 
        {
            case 1:
                setPayRate(1);
                break;
            case 2:
                setPayRate(2);
                break;
            case 3:
                setPayRate(3);
                break;
            default:
                break;
        }
        this.skillLevel = skillLevel;
    }
    public int getSkillLevel()
    {
        return skillLevel;
    }
    public void setHoursWorked(int hoursWorked)
    {
        if(hoursWorked > 40)
            
        this.hoursWorked = hoursWorked;
    }
    public int getHoursWorked()
    {
        return hoursWorked;
    }
    public void setPayRate(int skillLevel)
    {
        switch(skillLevel)
        {
            case 1:
                payRate = HOURLY_PAY_RATE_1;
                break;
            case 2:
                payRate = HOURLY_PAY_RATE_2;
                break;
            case 3:
                payRate = HOURLY_PAY_RATE_3;
        }
    }
    public double getPayRate()
    {
        return payRate;
    }
    public double calculateRegularPay(double payRate, int hoursWorked) 
    {
        regularPay = payRate * hoursWorked;
        return regularPay;
    }
    public double calculateOverTimePay(double regularPay)
    {
        overTimePay = regularPay + (regularPay + 1.5);
        return overTimePay;
    }
}
