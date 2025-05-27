package employee;
import java.util.Scanner;
/*
 * Filename .java
 * Written by Textbook
 * Written on 10/04/2020
 * Description : Methods That Use Employee the employee class
 */
class MethodsThatUseEmployee 
{
    //public static void main(String args[]) 
    {
        Employee myEmployee;
        myEmployee = getEmployeeData();
        displayEmployee(myEmployee);
    }
    public static Employee getEmployeeData() 
    {
        int id;
        double sal;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee ID >> ");
        id = input.nextInt();
        System.out.print("Enter employee salary >> ");
        sal = input.nextDouble();
        Employee tempEmp = new Employee("Thando","Ngwenya", id, sal);
        tempEmp.setEmpNum(id);
        tempEmp.setEmpSalary(sal);
        return tempEmp;
    }
    public static void displayEmployee(Employee anEmp) 
    {
        System.out.println("\nEmployee #" + anEmp.getEmpNum()
                + " Salary is " + anEmp.getEmpSalary());
    }
}
