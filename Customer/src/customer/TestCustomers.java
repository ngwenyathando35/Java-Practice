/* Filename TestCustomers.java
 * Written by textbook pg 514
 * Description : Demonstrating using superclass methods from the child class. Works as intended*/
package customer;
public class TestCustomers
{
    public static void main(String[] args)
    {
        Customer oneCust = new Customer(124, 123.45);
        PreferredCustomer onePCust = new PreferredCustomer(125, 3456.78, 0.15);
        oneCust.display();
        onePCust.display();
    }
}