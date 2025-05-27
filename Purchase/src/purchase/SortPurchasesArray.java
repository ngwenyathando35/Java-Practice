/* The program works but it displays the hashcode in the array when it's suppose to display the values
 * Filename SortPurchasesArray.java
 * Written by Thando Ngwenya
 * Written on Khanyisile's Birthday in Covid Year
 * Description : This program declares an array of five Purchase objects and prompts a user for their values. 
    Then in a loop that continues until a user inputs a sentinel value, is promps the user whether the Purchase 
    objects should be sorted and displayed in invoice number order or sale amount order.
 */
package purchase;
import java.util.Scanner;
public class SortPurchasesArray 
{
    public static void main(String []args)
    {
        int invoiceNum, saleAmount, options;
        final int QUIT = 9999;
        Scanner input = new Scanner(System.in);
        Purchase data[] = new Purchase[5];
        for(int x = 0; x < data.length; ++x)
        {
            data[x] = new Purchase();
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
        }
        for(int i = 0; i != QUIT;)
        {
            System.out.println("How do you want the values to be sorted?\n"
                + "Enter 1 for Invoice number or any number for sale amount order");
            options = input.nextInt();
            if(options == 1)
                sortUsingInvoice(data);
            else if(options == 2)
                sortUsingSaleAmount(data);
            else if(options != QUIT)
                i = QUIT;
            display(data);
        }
    }
    public static void sortUsingInvoice(Purchase[] array)
    {
        int a, b;
        Purchase temp;
        int highSubscript = array.length - 1;
        for(a = 0; a < highSubscript; ++a)
            for(b = 0; b < highSubscript; ++b)
            if(array[b].getSaleAmount() > array[b + 1].getSaleAmount())
        {
            temp = array[b];
            array[b] = array[b + 1];
            array[b + 1] = temp;
        }
    }
    private static void sortUsingSaleAmount(Purchase[] data) 
    {
        int a, b;
        Purchase temp;
        int highSubscript = data.length - 1;
        for(a = 0; a < highSubscript; ++a)
            for(b = 0; b < highSubscript; ++b)
                if(data[b].getInvoiceNum()> data[b + 1].getInvoiceNum())
                {
                    temp = data[b];
                    data[b] = data[b + 1];
                    data[b + 1] = temp;
                }
    }
    private static void display(Purchase[] data) 
    {
        for(int x = 0; x < data.length; ++x)
             System.out.println(data[x] + "");
    }
}