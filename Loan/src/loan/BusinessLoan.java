/*
 * Filename BusinessLoan.java
 * Written by Thando Ngwenya
 * Written on 29/09/2020
 * Description : This class that extends Loan. The BusinessLoan constructor sets the interest 
        rate to 1 percent over the current prime interest rate.
 */
package loan;
public class BusinessLoan extends Loan
{
    
    public BusinessLoan(long loanNum, String surname, int loanAmount, double interest, int lengthOfLoan) 
    {
        super(loanNum, surname, loanAmount, interest, lengthOfLoan);
        interestRate = 0.01;
    }
}