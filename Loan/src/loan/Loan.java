/*
 * Filename Loan.java
 * Written by Thando Ngwenya
 * Written on 29/09/2020
 * Description : Thando's Construction Loan Company makes loans of up to R1_715_000 for construction projects. 
        There are two categories of Loans—those to businesses and those to individual applicants. This an 
        abstract class that implements the LoanConstants interface. A Loan includes a loan number, customer last 
        name, amount of loan, interest rate, and term. The constructor requires data for each of the fields 
        except interest rate. It does not allow loan amounts over R1_715_000. It forces the loan term that is 
        not one of the three defined in the LoanConstants class to a short-term, 1-year loan. It has a 
        toString() method that displays all the loan data.
 */
package loan;
import java.util.Scanner;
public abstract class Loan implements LoanConstants
{
    private final Long loanNumber;
    private final String lastName;
    private final int amount;
    private final int term;
    protected double interestRate;
    public Loan(long loanNum, String surname, int loanAmount, double interest, int lengthOfLoan)
    {
        loanNumber = loanNum;
        lastName = surname;
        amount = loanAmount;
        verifyLoanAmount(amount);
        interestRate = interest;
        this.term = lengthOfLoan;
        verifyTerm(term);
    }
    private int verifyLoanAmount(int amount) 
    {
        if(amount>MAX_LOAN_AMOUNT)
        {
            System.out.println("The maximum amount for a loan is R" + MAX_LOAN_AMOUNT + ".\n"
                    + "Please enter an amount that is less than or equal to the max amount");
            Scanner sc = new Scanner(System.in);
            amount = sc.nextInt();
        }
        return amount;
    }
    private void verifyTerm(int term) 
    {
        if(term > LONG_TERM)
        {
            System.out.println("Since you entered a term that greater than the specified terms,"
            + " the term of your loan will be set to one year");
            term = SHORT_TERM;
        }
    }
    @Override
    public String toString()
    {
        return "Last Name : " + lastName + "\n"
             + "Loan term  : " + term + "\n"
             + "Loan Number : " + loanNumber + "\n"
             + "Loan amount  : " + amount + "\n"
             + "Interest Rate : " + interestRate;
    }
}