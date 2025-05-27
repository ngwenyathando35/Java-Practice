/*
Programmer	: Thando Ngwenya
Date		: 31/05/2018
Program		: EmployeeArray
Description	: It's a class that calls set and get methods values from the ArrayEmployee class
*/
package employeearray;
import java.util.Scanner;
public class EmployeeArray
{
    public static void main(String [] args)
    {
        ArrayEmployee[] emp = new ArrayEmployee[5];
        Scanner input = new Scanner(System.in);
        
        for (int i =0;i<emp.length;i++)
        {
            emp[i] = new ArrayEmployee();
            
            System.out.println("Enter employee number of employee"+(i+1));
            emp[i].setEmpNum(input.nextInt());
            
            System.out.println("Enter employee name of employee"+(i+1));
            emp[i].setEmpName(input.nextLine()); 
            
            System.out.println("Enter salary of employee"+(i+1));
            emp[i].setEmpSalary(input.nextDouble()); 
        }
        System.out.println("Employee details :\n employee number\t name \t salary");
        for (int i = 0;i<emp.length;i++){
            System.out.println(emp[i].getEmpNum()+"\t\t\t"+ emp[i].getEmpName()+"\t" +emp[i].getSalary() );
        }
    }
}