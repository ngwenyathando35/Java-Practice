/*
 * Filename TenThousandDaysOld.java
 * Written by Thando Ngwenya
 * Written on 20/04/2020
 * Description : Calculates the day the user becomes or became ten thousand days old 
 */
package tenthousanddaysold;
import java.util.Scanner;
import java.time.*;
public class TenThousandDaysOld 
{
    public static void main(String[] args) 
    {
        
        int month, year, day;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Day");
        day = input.nextInt();
        System.out.println("Enter Month");
        month = input.nextInt();
        System.out.println("Enter Year");
        year = input.nextInt();
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate theDate = birthDate.plusDays(10000);
        System.out.println("You'll be Ten Thousand days old on " +theDate );
    }
    
}
