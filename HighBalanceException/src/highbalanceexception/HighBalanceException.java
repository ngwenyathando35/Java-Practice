/*
 * Filename HighBalanceException.java
 * Written by The Textbook
 * Written on 0/04/2020
 * Description : Demonstrating Exception Handling by creating your own Exception. This program has a constructor
        contains a single statement that passes a description of an error to the parent Exception constructor.
        This String would be retrieved if the getMessage() method is called with a HighBalanceException object.
 */
package highbalanceexception;
public class HighBalanceException extends Exception
{
    public HighBalanceException()
    {
        super("Customer balance is high");
    }
}