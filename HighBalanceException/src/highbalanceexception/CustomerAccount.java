/*
 * Filename CustomerAccount.java
 * Written by The Textbook pg 631
 * Written on 07Octo2020
 * Description : This is a class that uses the HighBalanceException class. The constructor header indicates that
        it might throw a HighBalanceException if the balance used as an argument to the constructor exceeds a 
        set limit, a new, unnamed instance of the HighBalanceException class is thrown
 */
package highbalanceexception;
public class CustomerAccount
{
    private int acctNum;
    private double balance;
    public static double HIGH_CREDIT_LIMIT = 20000.00;
    public CustomerAccount(int num, double bal) throws HighBalanceException
    {
        acctNum = num;
        balance = bal;
        if(balance > HIGH_CREDIT_LIMIT)
            throw(new HighBalanceException());
    }
}