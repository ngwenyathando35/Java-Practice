/* Filename WhenProfitable.java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : This application computes a business’s potential profits each year for 20 years using the 
    following assumptions: (1) Gross profit in the first year is projected to be $20,000. (2) Expenses in the 
    first year are expected to be $35,000.(3) Net profit or loss is gross profit minus expenses. (4) Gross 
    profits are expected to increase 10 percent each year. (5) Expenses are expected to increase 4 percent 
    each year. It then display's the year, the gross profit, the expenses, and the net profit for each year. 
    It also display's the year in which a net profit is first reported .>> I failed to do the last line
 */
package whenprofitable;
public class WhenProfitable 
{
    public static void main(String[] args) 
    {
        double netProfit, grossProfit = 20000, expenses = 35000;
        int year;
        final double GROSS_YEARLY_INTEREST = 0.10;
        final double EXPENSE_YEARLY_INTEREST = 0.04;
        for( year = 1; year <= 20; year++)
        {
            netProfit = grossProfit - expenses;
            grossProfit = grossProfit + grossProfit * GROSS_YEARLY_INTEREST;
            expenses = expenses + expenses * EXPENSE_YEARLY_INTEREST;
            System.out.println(
                "\nYear         : " + year + 
                "\nGross Profit : R" + grossProfit +
                "\nExpenses     : R" + expenses +
                "\nNet Profit   : R" + netProfit);
        }
    }
}