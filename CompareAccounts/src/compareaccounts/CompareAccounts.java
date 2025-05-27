/* Filename CompareAccounts.java
 * Written by the textbook pg 560
 * Written on 08Sep2020
 * Description : Demonstrating using the equals() method and overiding and overloading it. Works as intended */
package compareaccounts;
public class CompareAccounts
{
public static void main(String[] args)
{
    BankAccount acct1 = new BankAccount(1234, 500.00);
    BankAccount acct2 = new BankAccount(1234, 500.00);
    //The equals method returns true if the objects in question have the references. Each and every object has a 
    // different hashcode unless the programmer explicitly assigns the same code to two different objects
    if(acct1.equals(acct2))
        System.out.println("Accounts are equal");
    else
        System.out.println("Accounts are not equal");
    }
}