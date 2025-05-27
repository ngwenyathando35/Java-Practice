/* Filename BankBalanceByRateAndYear.java
 * Written by The TExtbook
 * Description : application that contains an outer loop that varies interest rates
    between specified limits. At the start of the outer loop, the working balance is reset to its
    initial value so that calculations are correct for each revised interest rate value. The shaded
    inner loop varies the number of years and displays each calculated balance
 */
package bankbalancebyrateandyear;

import java.util.Scanner;
public class BankBalanceByRateAndYear 
{
    public static void main(String[] args) 
    {
        double initialBalance, interest, balance;
        int year;
        final double LOW = 0.02;
        final double HIGH = 0.05;
        final double INCREMENT = 0.01;
        final int MAX_YEAR = 4;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter initial bank balance > ");
        initialBalance = keyboard.nextDouble();
        keyboard.nextLine();
        for(interest = LOW; interest <= HIGH; interest += INCREMENT)
        {
            balance = initialBalance;
            System.out.println("\nWith an initial balance of $" +
            balance + " at an interest rate of " + interest);
            for(year = 1; year <= MAX_YEAR; ++ year)
            {
                balance = balance + balance * interest;
                System.out.println("After year " + year + " balance is $" + balance);
            }
        }
    }
}