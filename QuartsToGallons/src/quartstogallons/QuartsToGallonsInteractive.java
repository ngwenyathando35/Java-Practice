/*
 * Filename QuartsToGallons.java
 * Written by Thando Ngwenya
 * Written on 08/04/2020
 * Description : It converts quarts to gallons 
 */
package quartstogallons;
import java.util.Scanner;
public class QuartsToGallonsInteractive
{
    public static void main(String[] args) 
    {
        final byte QUART_IN_GALLON = 4;
        int quartsNeeded = 18;
        Scanner input = new Scanner(System.in);        
        System.out.println("Please enter the number of quarts that are needed");
        int quarts = input.nextInt();
        System.out.println("Please enter the number of gallons that are needed");
        int gallons = input.nextInt();
        System.out.println("A job that needs " + quartsNeeded + "requires " + gallons + " plus " + quarts);
    }
}