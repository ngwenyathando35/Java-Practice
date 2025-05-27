package sammysrentalprice;
import java.util.Scanner;
/* Filename SammysEventPriceWithMethods.java
 * Written by Thando Ngwenya
 * Written on 29/04/2020
 * Description : This application prompts the user for the number of minutes a piece of sports equipment was 
    rented, displays the company motto with a border, and displays the price for the rental               */
public class SammysEventPriceWithMethods 
{
    //Commented out because there is another main method in this packagepublic static void main(String[] args)
    {
        int minutesRented = promptMinutesRented();
        displayMotto();
        calcPrice(minutesRented);
    }
    public static int promptMinutesRented()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of minutes you rented the item");
        return input.nextInt();
    }
    public static void displayMotto() 
    {
        System.out.println("  ssssssssssssssssssssssssssssssssssss\n"
            + "  s Sammy's makes it fun in the sun s\n"
            + "  ssssssssssssssssssssssssssssssssssss");
    }
    public static void calcPrice(int minutesRented) 
    {
        int hours, minutes, HOUR_RATE = 40, MINUTE_RATE = 1, cost;
        hours = minutesRented / 60;
        minutes = minutesRented % 60;
        cost = (hours * HOUR_RATE) + (minutes * MINUTE_RATE);
        System.out.println("Hours >> " + hours + "\nMinutes >> " + minutes +"\nTotal Price >> R" + cost);
    }
}