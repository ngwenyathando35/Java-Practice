/* Filename TestBankAccount.java
 * Written by The textbook pg 558
 * Written on 07Sep2020
 * Description : Using the toString method to for error checking. This program uses a toString method that is 
        declared in the BankAccount class to see the check the hashcode of fields so that the programmer can see 
        that the is a problem with the reference of the objects(There actually is).Works as intended */
package compareaccounts;
public class TestBankAccount 
{
   public static void main(String[] args)
    {
        BankAccount myAccount = new BankAccount(123, 4567.89);
        System.out.println(myAccount.toString());
    }
}