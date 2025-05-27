/* Filename PreferredCustomer.java
 * Written by Textbook pg 514
 * Description : Demonstrating Accessing superclass methods from the child 
   In the PreferredCustomer display() method, we want to display all three fields - idNumber, balanceOwed, and 
    discountRate. Because two-thirds of the code to accomplish the display has already been written for the 
    Customer class, it is convenient to have the PreferredCustomer display() method use its parent’s version of 
    the display() method before displaying its own discount rate. Works as intended*/
package customer;
public class PreferredCustomer extends Customer
{
    double discountRate;
    public PreferredCustomer(int id, double bal, double rate)
    {
        super(id, bal);
        discountRate = rate;
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Discount rate is " + discountRate);
    }
}