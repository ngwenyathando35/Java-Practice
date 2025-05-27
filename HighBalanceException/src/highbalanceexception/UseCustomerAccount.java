/*
 * Filename UseCustomerAccount.java
 * Written by Thando Ngwenya
 * Written on 07Oct2020
 * Description : This application instantiates a CustomerAccount. The user is prompted for an account number and
        balance. After the values are entered, an attempt is made to construct a CustomerAccount in a try block.
        If the attempt is successful—that is, if the CustomerAccount constructor does not throw an Exception—
        the CustomerAccount information is displayed in a dialog box. However, if the CustomerAccount 
        constructor does throw a HighBalanceException, the catch block receives it and displays a message. A 
        different application could take any number of different actions; for example, it could display the 
        return value of the getMessage() method, construct a CustomerAccount object with a lower balance, or 
        construct a different type of object—perhaps a child of CustomerAccount called PreferredCustomerAccount
        that allows a higher balance. 
 */
package highbalanceexception;
import javax.swing.*;
public class UseCustomerAccount
{
    public static void main(String[] args)
    {
        int num;
        double balance;
        String input;
        input = JOptionPane.showInputDialog(null,"Enter account number");
        num = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null, "Enter balance due");
        balance = Double.parseDouble(input);
        try
        {
            CustomerAccount ca = new CustomerAccount(num, balance);
            JOptionPane.showMessageDialog(null, "Customer #" + num + " has a balance of $" + balance);
        }
        catch(HighBalanceException hbe)
        {
            JOptionPane.showMessageDialog(null, "Customer #" + num + " has a balance of $" + balance +
                    " which is higher than the credit limit");
        }
    }
}