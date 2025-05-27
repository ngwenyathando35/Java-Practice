/* Filename CarlysEventPrice.java
 * Written by Thando Ngwenya
 * Written on 09/04/2020
 * Description :  The program prompts the user for the number of guests attending an event and then computes
                  the total price, determines if its a large event, and then echos the data to the user
                  It does this by using methods for different functions                                   */
package carlyseventprice;
import java.util.Scanner;
public class CarlysEventPricewithMethods 
{
/* Commented out to let another main method execute
    public static void main(String[] args) */
    {
        String eventNumber = promptEventNumber();
        int numGuests = promptNumGuests();
        Event event1 = new Event(eventNumber, numGuests);
        displayMotto();
        isLarge(numGuests, event1);
    }
    private static String promptEventNumber() 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the event number");
        String eventNum = input.nextLine();
        return eventNum;
    }
    private static int promptNumGuests() 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of guests");
        return input.nextInt();
    }
    public static void displayMotto() 
    {
        System.out.println("*************************************************\n"
                + "*Carly's makes the food that makes it to a party*\n"
                + "*************************************************\n");
    }
    private static void isLarge(int numGuests, Event Event1) 
    {
        boolean isLarge;
        // Classifies the event as large if there more than fifty guests
        isLarge = (numGuests > 50);
        System.out.println("Number of guests >> " + numGuests + 
                "\nPrice per guest >> R" + Event.HIGHER_PRICE + 
                "\nTotal Price >> R" + Event1.getPrice() + 
                "\nIs this a large event? >> " + isLarge);
    }
}