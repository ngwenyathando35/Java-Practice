/* Filename CertOfDeposit.java
 * Written by Thando Ngwenya
 * Written on 27/04/2020
 * Description : The class contains data fields that hold a certificate number, account holder’s last name, 
    balance, issue date, and maturity date, using LocalDate objects for each date. It provides get and set 
    methods for each field. It also provides a constructor that requires parameters used to set the first four 
    fields, and sets the maturity  */
package certofdeposit;
import java.time.*;
public class CertOfDeposit 
{
    private long certificateNum;
    private String accountHolderName;
    private double balance;
    private LocalDate issueDate, maturityDate;
    public void setCertificateNum(long certificateNumber)
    {
        this.certificateNum = certificateNumber;
    }
    public long getCertificateNum()
    {
        return certificateNum;
    }
    public void setAccountHolderName(String name)
    {
        accountHolderName = name;
    }
    public String getAccountHolder()
    {
        return accountHolderName;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setIssueDate(LocalDate issueDate)
    {
        this.issueDate = issueDate;
    }
    public LocalDate getIssueDate()
    {
        return issueDate;
    }
    public void setMaturityDate(LocalDate maturityDate)
    {
        this.maturityDate = issueDate;
    }
    public LocalDate getMaturityDate()
    {
        return maturityDate;
    }
    public CertOfDeposit(long certificateNum, String accountHolderName, double balance, LocalDate issueDate)
    {
        //The maturity date is exactly one year after the issue date
        maturityDate = issueDate.plusYears(1);
    }
}