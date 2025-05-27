/* The program works but it has a problem of not consuming whatever it is on the keyboard buffer
 * Filename CreateLoan.java
 * Written by Thando Ngwenya
 * Written on 29/09/2020
 * Description : This is an application that tracks all new construction loans. It calculates the total amount 
        owed at the due date (original loan amount + loan fee). It creates an array of five Loans. It prompts 
        the user for the current prime interest rate and then, in a loop, it prompts the user for a loan type 
        and all relevant information for that loan. Store the created Loan objects in the array. When data entry
        is complete, it displays all the loans.
 */
package loan;
import java.util.Scanner;
public class CreateLoan 
{
    public static void main(String[] args) 
    {
        Loan[] loans = new Loan[5];
        double primeInterest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the prime interest");
        primeInterest = sc.nextDouble();
        promptLoanData(loans);
        display(loans);
    }
    private static Loan[] promptLoanData(Loan[] loans) 
    {
        Long loanNum;
        String surname, loanType;
        int loanAmount;
        double interest;
        int lengthOfLoan;
        Scanner sc = new Scanner(System.in);
        for(int x = 0; x < loans.length; x++)
        {
            int count = 0;
            System.out.println("What type of account do you want to apply for");
            loanType = sc.nextLine();
            System.out.println("Please enter the loan number");
            loanNum = sc.nextLong();
            System.out.println("Please enter the your last name");
            surname = sc.nextLine();
            sc.nextLine();
            System.out.println("Please enter the loan amount");
            loanAmount = sc.nextInt();
            System.out.println("Please enter the interest rate you want");
            interest = sc.nextDouble();
            System.out.println("Please enter the term of the loan");
            lengthOfLoan = sc.nextInt();
            if(loanType.equalsIgnoreCase("business"))
            {
                count++;
                if(count < 4)
                    loans[x] = createBusinessLoan(loanNum, surname, loanAmount, interest, lengthOfLoan);
            }
            else
            {
                count++;
                if(count < 4)
                    loans[x] = createIndividualLoan(loanNum, surname, loanAmount, interest, lengthOfLoan);
            }
        }
        return loans;
    }
    private static BusinessLoan createBusinessLoan(Long ln, String n, int la ,double ir, int term)
    {
        BusinessLoan bl = new BusinessLoan(ln, n, la, ir, term);
        return bl;
    }
    private static PersonalLoan createIndividualLoan(Long ln, String n, int la ,double ir, int term) 
    {
        PersonalLoan pl = new PersonalLoan(ln, n, la, ir, term);
        return pl;
    }
    private static void display(Loan[] loans) 
    {
        for(int i = 0; i< loans.length; i++)
            loans[0].toString();
    }
}