/* Filename DemoSalesperson2.java
 * Written by Thando Ngwenya
 * Written on 07/07/2020
 * Description : This is the modified class of the DemoSalesperson application so each Salesperson has a 
    successive ID number from 111 through 120 and a sales value that ranges from R434,000 to R1215200 increasing 
    by R869,000 for each successive Salesperson. The program works as intended  */
package salesperson;
public class DemoSalesperson2
{
    //public static void main(String[] args) 
    {
        Salesperson[] salesPerson = new Salesperson[10];
        
        double annualSalesAmount = 434000;
        for(int x = 0, idNumber = 111; x < salesPerson.length; ++x)
        {
            salesPerson[x] = new Salesperson(idNumber, annualSalesAmount);
            System.out.print("Salesperson " + x + "\nID number >> " + salesPerson[x].getIdNUmber()
                    + "\nAmount    >> R" + salesPerson[x].getAnnualSalesAmount() + "\n\n");
            idNumber++;
            annualSalesAmount += 869000;
        }
    }
}