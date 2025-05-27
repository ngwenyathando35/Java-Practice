package minutesconversion;
import java.util.Scanner;
/*
 * Filename MinutesConversion.java
 * Written by Thando Ngwenya
 * Written on 09/04/2020
 * Description : Converts minutes to hours and days 
 */
public class MinutesConversion 
{
    public static void main(String[] args) 
    {
        int minutes;
        double hours, days;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter minutes >> ");
        minutes = input.nextInt();
        hours = minutes / 60;
        days = hours / 24;
        System.out.println("Hours >> " + hours + " and " + days + " days(s)");
    }
}