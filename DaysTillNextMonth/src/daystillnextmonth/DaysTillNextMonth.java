/*
 * Filename DaysTillNextMonth.java
 * Written by Thando Ngwenya
 * Written on 24/04/2020
 * Description : The LocalDate class includes an instance method named lengthOfMonth() that
    returns the number of days in the month. It uses methods in the LocalDate class to calculate how many 
    days are left until the first day of next month. It then displays the result, including the name of the 
    next month.
 */
package daystillnextmonth;
import java.time.*;
public class DaysTillNextMonth 
{
    public static void main(String[] args) 
    {
        LocalDate date1 = LocalDate.of(2018,02,06);
        int monthLength = date1.lengthOfMonth();
        int dayOfMonth = date1.getDayOfMonth();
        int daysTillNextMonth = (monthLength - dayOfMonth) + 1;
        LocalDate date2 = date1.plusMonths(1);
        Month nameMonth  = date2.getMonth();
        System.out.println("The date provided is >> " + date1 + 
                "\nDays till next month is >> " + daysTillNextMonth + 
                "\nThat month is >> " + nameMonth);
    }
}