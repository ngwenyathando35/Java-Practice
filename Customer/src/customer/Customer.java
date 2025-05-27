/* Filename Customer.java
 * Written by Java Programming pg 514
 * Description : Demonstrating accessing superclass methods from the child class. A Customer has an idNumber and 
                 balanceOwed fields. In addition to these fields. Works as intended */
package customer;
public class Customer
{
    private final int idNumber;
    private final double balanceOwed;
    public Customer(int id, double bal)
    {
        idNumber = id;
        balanceOwed = bal;
    }
    public void display()
    {
        System.out.println("Customer #" + idNumber + " Balance $" + balanceOwed);
    }
}