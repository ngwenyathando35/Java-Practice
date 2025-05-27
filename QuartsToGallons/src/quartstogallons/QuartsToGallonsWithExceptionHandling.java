/* This program is not done. I'll come back to it
 * Filename QuartsToGallons.java
 * Written by Thando Ngwenya
 * Written on 08/04/2020
 * Modified on 07/1/2021 to include the handling of non numeric input
 * Description : It converts quarts to gallons and continuously reprompts the user while any nonnumeric value is
        entered. */
package quartstogallons;
import java.util.*;
public class QuartsToGallonsWithExceptionHandling
{
    public static void main(String[] args) 
    {
        final byte QUART_IN_GALLON = 4;
        int quartsNeeded = 18;
        int quarts, gallons = 0, num = 0;
        boolean isNumber;
        Scanner input = new Scanner(System.in);        
        System.out.println("Please enter the number of quarts that are needed");
        quarts = input.nextInt();
        isNum(quarts);
        System.out.println("Please enter the number of gallons that are needed");
        gallons = input.nextInt();
        isNum(gallons);
        System.out.println("A job that needs " + quartsNeeded + "requires " + gallons + " plus " + quarts);
    }
    private static int isNum(int num) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("You've entered the incorrect data");
        System.out.println("Please enter an integer");
        num = input.nextInt();
        return num;
    }
}