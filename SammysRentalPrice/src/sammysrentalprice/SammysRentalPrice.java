package sammysrentalprice;
import java.util.Scanner;
/*
 * Filename SammysRentalPrice.java
 * Written by Thando Ngwenya
 * Written on 09/04/2020
 * Description :  
 */
public class SammysRentalPrice 
{
    //Commented out because there is another main method in this package public static void main(String[] args) 
    {
        int minutesRented, hours, minutes,HOUR_RATE = 40, MINUTE_RATE = 1, cost;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of minutes you rented the item");
        minutesRented = input.nextInt();
        hours = minutesRented / 60;
        minutes = minutesRented % 60;
        cost = (hours * HOUR_RATE) + (minutes * MINUTE_RATE);
        System.out.println("  ssssssssssssssssssssssssssssssssssss\n"
                + "  s Sammy's makes it fun in the sun s\n"
                + "  ssssssssssssssssssssssssssssssssssss" + 
                "\nHours >> " + hours + "\nMinutes >> " + minutes +
                "\nTotal Price >> R" + cost);
    }
}