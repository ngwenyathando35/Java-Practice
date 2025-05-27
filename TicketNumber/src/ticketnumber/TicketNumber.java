package ticketnumber;
import java.util.Scanner;
import javax.swing.JOptionPane;
/*
 * Filename TicketNumber.java
 * Written by Thando Ngwenya
 * Written on 09/04/2020
 * Description :  It prompts a the user to enter a six-digit ticket number but when five digits are entered
                  it determines what the sixth digit is\was. The ticket numbers are designed to so that if you 
                  drop the last digit of the number, then divide the number by 7, the remainder of the division 
                  will be identical to the last dropped digit.
                  Ticket Numbers: 123454, 147103
 */
public class TicketNumber 
{
    public static void main(String[] args) 
    {
        int ticketNum, remainder;
        byte  lastDigit;
        boolean isTicket;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a ticket number");
        ticketNum = input.nextInt();
        System.out.println("Please enter a ticket number without the last digit");
        ticketNum = input.nextInt();
        remainder = ticketNum%7;
        System.out.println("What is the last digit");
        lastDigit = input.nextByte();
        isTicket = (remainder == lastDigit);
        JOptionPane.showMessageDialog(null, isTicket);
    }
}