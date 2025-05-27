/* Filename TestCertOfDeposit.java
 * Written by Thando Ngwenya
 * Written on 27/04/2020
 * Description : This is an interactive program that prompts the user for data for two CertOfDeposit objects. 
    It prompts the user for certificate number, name, balance, and issue date for each CertOfDeposit, and then 
    instantiate the objects. It then displays all the values, including the maturity dates */
package certofdeposit;
import java.util.Scanner;
import java.time.LocalDate;
public class TestCertOfDeposit 
{
    public static void main(String[] args) 
    {
        long certificateNum;
        String name;
        double balance;
        int day, mon, year;
        LocalDate issueDate;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your certificate number");
        certificateNum = input.nextLong();
        input.nextLine();
        System.out.println("Please enter your name");
        name = input.nextLine();
        System.out.println("Please enter your balance");
        balance = input.nextDouble();
        System.out.println("Enter the day of your issue date");
        day = input.nextInt();
        System.out.println("Enter the month of your issue date");
        mon = input.nextInt();
        System.out.println("Enter the day of your issue date");
        year = input.nextInt();
        issueDate = LocalDate.of(year, mon, day);
        CertOfDeposit data1 = new CertOfDeposit(certificateNum, name, balance, issueDate);
        data1.setCertificateNum(certificateNum);
        data1.setAccountHolderName(name);
        data1.setBalance(balance);
        data1.setIssueDate(issueDate);
        System.out.println("Here is your data" +
                "\nCertificate number : " + data1.getCertificateNum() + 
                "\nName               : " + data1.getAccountHolder() + 
                "\nBalance            : R" + data1.getBalance() +
                "\nIssue Date         : " + data1.getIssueDate() +
                "\nMaturity Date      : " + data1.getMaturityDate());
    }
}