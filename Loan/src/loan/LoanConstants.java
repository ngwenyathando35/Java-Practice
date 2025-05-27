/*
 * Filename LoanConstants.java
 * Written by Thando Ngwenya
 * Written on 29/09/2020
 * Description : This is an interface that holds constant values. It has values for short-term, medium-term and 
        long-term loans. It also contains constants for the company name and the maximum loan amount.
 */
package loan;
public interface LoanConstants 
{
    long MAX_LOAN_AMOUNT = 1_715_000;
    int SHORT_TERM = 1;
    int MEDIUM_TERM = 3;
    int LONG_TERM = 5;
    String NAME = "Thando's Construction Loan Company";
}
