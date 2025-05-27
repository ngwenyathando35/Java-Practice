/* 
 * Filename    : ThandosCashBookPrgram
 * Written by  : Thando Ngwenya
 * Written on  : 22 February 2021
 * Description : This program is used to record transactions and creates user defined accounts to record those transactions*/         
package thandoscashbookprogram;

import java.util.Scanner;
import sun.util.calendar.LocalGregorianCalendar;

public class ThandosCashBookProgram 
{
    public static void main(String[] args) 
    {
        double cashIN, cashOut;
        double totalCashIn, totalCashOUt;
        double amount;
        String name, remark;
        double[] transactions;
        LocalGregorianCalendar.Date date;
        Scanner input = new Scanner(System.in);
        System.out.println("Hi, Welcome to Thando's Cash Book Program\n"
                + "What would you like to do :\n"
                + "1. Open an account\n"
                + "2. Close the program");
            
    }
}
