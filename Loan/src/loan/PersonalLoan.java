/*
 * Filename PersonalLoan.java
 * Written by Thando Ngwenya
 * Written on 29/09/2020
 * Description : This constructor of this class sets the interest rate to 2 percent over the current prime 
        interest rate.
 */
package loan;
public class PersonalLoan extends Loan
{
    public PersonalLoan(long loanNum, String surname, int loanAmount, double interest, int lengthOfLoan) 
    {
        super(loanNum, surname, loanAmount, interest, lengthOfLoan);
        interestRate = 0.02;
    }
}