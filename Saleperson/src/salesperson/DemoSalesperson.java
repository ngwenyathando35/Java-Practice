/* Filename DemoSalesPerson.java
 * Written by Thando Ngwenya
 * Written on 07/07/2020
 * Description : This application named DemoSalesperson that declares an array of 10 Salesperson objects. It sets
    each ID number to 9999 and each sales value to zero and the it displays them. The program works as intended*/
package salesperson;
public class DemoSalesperson
{
    //public static void main(String[] args) 
    {
        Salesperson[] salesPerson = new Salesperson[10];
        int idNumber = 9999;
        double annualSalesAmount = 0.0;
        for(int x = 0; x < salesPerson.length; ++x)
        {
            salesPerson[x] = new Salesperson(idNumber, annualSalesAmount);
            System.out.print("Salesperson " + x + "\nID number >> " + salesPerson[x].getIdNUmber()
                    + "\nAmount    >> R" + salesPerson[x].getAnnualSalesAmount() + "\n\n");
        }
    }
}