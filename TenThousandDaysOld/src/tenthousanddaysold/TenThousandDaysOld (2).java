package tenthousanddaysold;
/*
 * Filename TenThousandDaysOld.java
 * Written by Thando the Enigma
 * Written on 20/01/2019
 * Details : The program computes and displays the day on which you become (or
             became) 10,000 days old.
 */
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class TenThousandDaysOld 
{
    public static void main(String[] args) 
    {
        int day, mon, year;
        LocalDate dob, theDate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day you were born >>");
        day = input.nextInt();
        System.out.println("Enter the month you were born in >>");
        mon = input.nextInt();
        System.out.println("Enter the year you were born in >>");
        year = input.nextInt();
        dob = LocalDate.of(year, mon, day);
        theDate = dob.plusDays(10000);
        System.out.println("You'll be Ten Thousand days old on " +theDate );
    }
    
}
