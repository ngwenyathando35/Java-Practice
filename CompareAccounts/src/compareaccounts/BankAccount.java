/* Filename BankAccount.java
 * Written by Java programming pg 558
 * Written on 07Sep2020
 * Description : Demonstrating how to override the toString() method and the equals method. And also how to 
        overload the equals() method to work to the usr preference. Works as intended */
package compareaccounts;
public class BankAccount
{
    private final int acctNum;
    private final double balance;
    public BankAccount(int num, double bal)
    {
        acctNum = num;
        balance = num;
    }
    @Override
    public String toString()
    {
        String info = "BankAccount acctNum = " + acctNum + " Balance = $" + balance;
        return info;
    }
    //Overloading the equals method so that it can compare the variables contents and not the hashcodes
    public boolean equals(BankAccount secondAcct)
    {
        boolean result = false;
        if(acctNum == secondAcct.acctNum && balance == secondAcct.balance)
            result = true;
        return result;
    }
    @Override //Overriding the equals method to compare variables that are not hashcodes. There are guidelines 
    // that are used to override the equals() method which are:
    public boolean equals(Object obj)
    {
        boolean result;
        //Determining if the equals() argument is the same object as the calling object by using a comparison 
        // such as obj == this, and return true if it is.
        if(obj == this)
            result = true;
        else
            //Returning false if the Object argument is null.
            if(obj == null)
                result = false;
            else
                //Returning false if the calling and argument objects are not the same class.
                if(obj.getClass() != this.getClass())
                    result = false;
        //Casting the Object argument to the same type as the calling object only if they are the same class
        BankAccount secondAcct = (BankAccount)obj;
        if(acctNum == secondAcct.acctNum && balance == secondAcct.balance)
            result = true;
        else
            result = false;
        return result;
        //The above guidelines are importtant to follow if one intends to override the equals method.
    }
}