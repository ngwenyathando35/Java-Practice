/* Filename BankBalance.java
 * Written by Thando Ngwenya
 * Written on 16/05/2020
 * Description : This is suppose to be a bank balance app nyan of some sort
 */
package bankbalance2;
import java.util.Scanner;
public class BankBalance2 
{
    public static void main(String[] args) 
    {
        double balance;
        int response; int year = 1;
        final double INT_RATE = 0.03;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter initial bank balance > ");
        balance = keyboard.nextDouble();
        keyboard.nextLine();
        do
        {
            balance = balance + balance * INT_RATE;
            System.out.println("After year " + year + " at " + INT_RATE +
                    " interest rate, balance is $" + balance);
            year = year + 1;
            System.out.println("\nDo you want to see the balance " + "at the end of another year?");
            System.out.println("Enter 1 for yes\n or any other number for no >> ");
            response = keyboard.nextInt();
        }  
        while(response == 1);
    }
}