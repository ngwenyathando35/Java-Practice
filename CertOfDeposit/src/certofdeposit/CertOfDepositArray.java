/* Filename CertOfDepositArray.java
 * Written by Thando Ngwenya
 * Written on 11/07/2020
 * Description : This is the modified version of TestCertOfDeposit. This interactive program that prompts the 
    user for data an array of five CertOfDeposit objects. It prompts the user for certificate number, name, 
    balance, and issue date for each CertOfDeposit, and then instantiate the objects. It then displays all the 
    values, including the maturity dates. It does what it is intended to do.               */
package certofdeposit;
import java.util.Scanner;
import java.time.LocalDate;
public class CertOfDepositArray 
{
    public static void main(String[] args) 
    {
        long certificateNum;
        String name, date;
        double balance;
        LocalDate issueDate;
        CertOfDeposit data[] = new CertOfDeposit[5];
        Scanner input = new Scanner(System.in);
        for(int x = 0; x < data.length; ++x)
        {
            System.out.println("Please enter your certificate number");
            certificateNum = input.nextLong();
            input.nextLine();
            System.out.println("Please enter your name");
            name = input.nextLine();
            System.out.println("Please enter your balance");
            balance = input.nextDouble();
            System.out.println("Please enter your issue date in the format yyyy/mm/dd");
            input.nextLine();
            date = input.nextLine();
            issueDate = extractDate(date);
            data[x] = new CertOfDeposit(certificateNum, name, balance, issueDate);
            data[x].setCertificateNum(certificateNum);
            data[x].setAccountHolderName(name);
            data[x].setBalance(balance);
            data[x].setIssueDate(issueDate);
            System.out.println("Here is your data" +
                "\nCertificate number : " + data[x].getCertificateNum() + 
                "\nName               : " + data[x].getAccountHolder() + 
                "\nBalance            : R" + data[x].getBalance() +
                "\nIssue Date         : " + data[x].getIssueDate() +
                "\nMaturity Date      : " + data[x].getMaturityDate());
        }
    }
    public static LocalDate extractDate(String date)
    {
        LocalDate issueDate;
        int year, month, day;
        year = Integer.parseInt(date.substring(0, 4));
        month = Integer.parseInt(date.substring(5, 7));
        day = Integer.parseInt(date.substring(8));
        issueDate = LocalDate.of(year, month, day);
        return issueDate;
    }
}