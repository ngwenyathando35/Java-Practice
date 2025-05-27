/* Writtten by Thando Ngwenya
 * Written on 20/05/2020
 * Description : It instantiates the purchase class and assigns values to it. Works as intended*/
package purchase;
import java.util.Scanner;
public class CreatePurchase{
    //public static void main(String []args)
    {
        int invoiceNum, saleAmount;
        Purchase data = new Purchase();
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("Please enter an invoice number that is greater than 1000 but less than 8000");
            invoiceNum = input.nextInt();
        }
        while(invoiceNum < 1000 || invoiceNum > 8000);
        do
        {
            System.out.println("Please enter the sale amount. It must not be negative");
            saleAmount = input.nextInt();
        }
        while(saleAmount < 0);
        data.setInvoiceNum(invoiceNum);
        data.setSaleAmount(saleAmount);
        data.display();
    }
}