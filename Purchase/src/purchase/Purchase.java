/* Filename Purchase.java
 * Written by Thando Ngwenya
 * Written on 17/06/2020
 * Description : Each Purchase contains an invoice number, amount of sale, and amount of sales tax. It includes
    set for the invoice number and sale amount. Within the set() method for the sale amount, it 
    also calculates the sales tax as 5% of the sale amount and then it also includes a display method that 
    displays a purchase’s details.
 * Added features on Khanyisile's Birthday: Get methods. The program works as intended   */
package purchase;
public class Purchase 
{
    private int invoiceNum; 
    private double saleAmount, amountSalesTax;
    public void setInvoiceNum(int invoice)
    {
        invoiceNum = invoice;
    }
    public int getInvoiceNum()
    {
        return invoiceNum;
    }
    public void setSaleAmount(double amountSale)
    {
        saleAmount = amountSale;
        amountSalesTax = saleAmount * 0.05;
    }
    public double getSaleAmount()
    {
        return saleAmount;
    }
    public void display()       
    {
        System.out.println("Invoice number >> " + invoiceNum + 
                "\nSale Amount >> " + saleAmount +
                "\nSale Amount Tax >> " + amountSalesTax);
    }
}