/* Filename DemoEmployee.java
 * Written by Thando Ngwenya
 * Written on 02/07/2020
 * Description : Demonstrating the sorting of array objects using the bubbleSort algorithm */
package employee;
public class DemoEmployee 
{
    public static void main(String[] args) 
    {
        Employee[] emp  = new Employee[3];
        instantiateEmps(emp);
        System.out.println("Display the array before its sorted");
        displayEmp(emp);
        bubbleSortSal(emp);
        System.out.println("\n*************************************************************************\n"
                + "Sort array according to salary");
        displayEmp(emp);
        System.out.println("\n*************************************************************************\n"
                + "Sort array according to number");
        bubbleSortNum(emp);
        displayEmp(emp);
    }
    public static Employee[] bubbleSortSal(Employee[] array)
    {
        Employee temp;
        int highSubscript = array.length - 1;
        for(int a = 0; a < highSubscript; ++a)
            for(int b = 0; b < highSubscript; ++b)
                if(array[b].getEmpSalary()> array[b + 1].getEmpSalary())
                {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
        return array;
    }
    public static Employee[] bubbleSortNum(Employee[] array)
    {
        Employee temp;
        int highSubscript = array.length - 1;
        for(int a = 0; a < highSubscript; ++a)
            for(int b = 0; b < highSubscript; ++b)
                if(array[b].getEmpNum() > array[b + 1].getEmpNum())
                {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
        return array;
    }
    public static void displayEmp(Employee[] emp)
    {
        for(int x = 0; x < emp.length; ++x)
        System.out.print("Employee " + emp[x] + " details\n"
                + "Name    : " + emp[x].getEmpFirstName() + 
                "\nSurname : " + emp[x].getEmpLastName() +
                "\nNumber  : " + emp[x].getEmpNum() + 
                "\nSalary  : " + emp[x].getEmpSalary() + 
                "\n------------------------------------\n");
    }
    private static void instantiateEmps(Employee[] emp) 
    {
        emp[0] = new Employee("aaa", "xxx", 200, 100);
        emp[1] = new Employee("bbb", "yyy", 700, 103);
        emp[2] = new Employee("ccc", "zzz", 100, 102);
    }
}