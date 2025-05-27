/*
 * Filename .java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : 
(3) the regular pay for 40 hours, 
(4) the overtime pay, 
(5) the total of regular and overtime pay, and 
(6) the total itemized deductions. If the deductions exceed the gross pay, display an error message; otherwise, calculate and display 
(7) the net pay after all the deductions have been subtracted from the gross.
 */
package pay;
import java.util.Scanner;
public class TestPay 
{
    public static void main(String[] args) 
    {
        int skillLevel, hoursWorked;
        double payRate, regularPay, overTimePay;
        Pay employee = new Pay();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your skill level");
        employee.setSkillLevel(skillLevel = input.nextInt());
        System.out.println("How many hours did you work");
        employee.setHoursWorked(hoursWorked = input.nextInt());
        payRate = employee.getPayRate();
        regularPay = employee.calculateRegularPay(payRate, hoursWorked);
        overTimePay = employee.calculateOverTimePay(regularPay);
        System.out.println("*******************************\n" + 
                "Hours worked >> " + hoursWorked + 
                "\nHourly pay rate >> R" + employee.getPayRate() +
                "\nRegular pay rate >> R" + regularPay +
                "\nOvertime pay rate >> R" + overTimePay);
    }           
}