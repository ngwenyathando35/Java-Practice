/* Filename RetirementGoal.java
 * Written by Thando Ngwenya
 * Written on 17/06/2020
 * Description : This application prompts a user for a number of years the user has until retirement and the 
    amount of money the user can save annually. If the user enters 0 or a negative number for either value, 
    it reprompts the user until valid entries are made. It assumes that an interest of 15% is earned on the 
    money. It then displays the amount of money the user will have at retirement.
 */
package retirementgoal;
import java.util.Scanner;
public class RetirementGoal 
{
    public static void main(String[] args) 
    {
        double years, amount, retirementAmount;
        final double INTEREST = 0.05;
        Scanner input = new Scanner(System.in);
        
        do
        {
            System.out.println("How many years do you have before retirement");
            years = input.nextInt();
            System.out.println("How much can you save annually? ");
            amount = input.nextInt();
        }
        while((amount <= 0)||(years <= 0));
        retirementAmount = amount * years;
        retirementAmount *= INTEREST;
        System.out.println("At retirement, you will save R" + retirementAmount);
    }
}