/* Filename PastPresentFuture.java
 * Written by Thando Ngwenya
 * Written on 30/04/2020
 * Description : The application prompts a user for a month, day, and year and then display's a message that 
    specifies whether the entered date is (1) not this year, (2) in an earlier month this year, (3) in a later 
    month this year, or (4) this month.                                                                       */
package pastpresentfuture2;
import java.util.Scanner;
import java.time.*;
public class PastPresentFuture2
{
    public static void main(String[] args) 
    {
        int day, month, year;
        boolean isAfter, isBefore, isEqual;
        LocalDate currentDate = LocalDate.now();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year");
        year = input.nextInt();
        System.out.println("Enter month");
        month = input.nextInt();
        System.out.println("Enter day");
        day = input.nextInt();
        LocalDate userDate = LocalDate.of(year, month, day);
        isAfter = userDate.isAfter(currentDate);
        isBefore = userDate.isBefore(currentDate);
        isEqual = userDate.isEqual(currentDate);
        if(isAfter)
            System.out.println("The date is in the future");
        else if(isBefore)
            System.out.println("The date is in the past");
        else if(isEqual)
            System.out.println("The date is the present");
        else
            System.out.println("Invalid Date");
    }
}