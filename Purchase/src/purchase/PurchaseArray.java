/* Writtten by Thando Ngwenya
 * Written on 11/07/2020
 * Description : It instantiates the Purchase class objects. Each Purchase contains an invoice number, amount of 
    sale, amount of sales tax, and several methods. This program that declares an array of five Purchase objects 
    and prompts a user for their values. As each Purchase object is created, it continuously prompts user until 
    they enter an invoice number between 1000 and 8000 inclusive and a non-negative sale amount. It also prompts
    the user for values for each object and then displays all the values. It does what it is intended to do*/
package purchase;
import java.util.Scanner;
public class PurchaseArray
{
    //public static void main(String []args)
    {
        int invoiceNum, saleAmount;
        Purchase data[] = new Purchase[5];
        for(int x = 0; x < data.length; ++x)
        {
            data[x] = new Purchase();
            Scanner input = new Scanner(System.in);
            do
            {
                System.out.println("Please enter an invoice number that is greater than 1000 but less "
                        + "than 8000");
                invoiceNum = input.nextInt();
            }
            while(invoiceNum < 1000 || invoiceNum > 8000);
            do
            {
                System.out.println("Please enter the sale amount. It must not be negative");
                saleAmount = input.nextInt();
            }
            while(saleAmount < 0);
            data[x].setInvoiceNum(invoiceNum);
            data[x].setSaleAmount(saleAmount);
            data[x].display();
        }
    }
}