/*
Programmer	: Thando Ngwenya
Date		: 31/05/2018
Program		: EmployeeArray
Description	: It's a class that calls set and get methods values from the ArrayEmployee class
*/
package employeearray;
public class ArrayEmployee 
{
    private int empNum;
    private String empName;
    private double empSalary;
    
    public void setEmpNum(int num){
        empNum = num;
    }
    public int getEmpNum(){
        return empNum;
    }
    
    public void getEmpName(String name){
        empName = name;
    }
    public String getEmpName(){
        return empName;
    }
     
    public void setEmpSalary(double salary){
        empSalary = salary;
    }
    public double getEmpSalary(){
        return empSalary;
    }
}
