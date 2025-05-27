/* Filename PastPresentFuture.java
 * Written by Thando Ngwenya
 * Written on 30/04/2020
 * Description : The application prompts a user for a month, day, and year and then display's a message that 
    specifies whether the entered date is (1) not this year, (2) in an earlier month this year, (3) in a later 
    month this year, or (4) this month.                                                                       */
package pastpresentfuture;
import java.util.Scanner;
import java.time.*;
public class PastPresentFuture 
{
    public static void main(String[] args) 
    {
        int day, month, year;
        LocalDate currentDate = LocalDate.now();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year");
        year = input.nextInt();
        System.out.println("Enter month");
        month = input.nextInt();
        System.out.println("Enter day");
        day = input.nextInt();
        if(year != currentDate.getYear())
        {
            System.out.println("The entered date is not this year");
        }
        else
        {
            if(month < currentDate.getMonthValue())
                System.out.println("The date is in an earlier month this year ");
            else if(month > currentDate.getMonthValue())
            System.out.println("The date is in a later month this year ");
            else
                System.out.println("The date is this month");
        }
    }
}