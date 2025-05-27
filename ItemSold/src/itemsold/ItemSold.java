/*
 * Filename ItemSold.java
 * Written by Thando Ngwenya
 * Written on 18Aug2020
 * Description : This class is for Francis Pet Supply. It has fields that include an invoice number, description,
                 and price. It also has get and set methods for each field.
*/
package itemsold;
public class ItemSold 
{
    private int invoiceNumber;
    private String description;
    private double price;
    public void setInvoiceNumber(int invoiceNum)
    {
        invoiceNumber = invoiceNum;
    }
    public int getInvoiceNumber()
    {
        return invoiceNumber;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getDescription()
    {
        return description;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public double getPrice()
    {
        return price;
    }
    public void display(ItemSold item)
    {
        String de = item.getDescription();
        int in = item.getInvoiceNumber();
        double pr = item.getPrice();
        System.out.println("Description    >> " + de
                        +"\nInvoice Number >> " + in +
                         "\nPrice          >> ");
    }
}