/* Filename UseParty.java
 * Written by Thando Ngwenya
 * Written on 17/08/2020
 * Description : (Demonstrationg Inheritance)This application creates a Party object, prompts the user for the 
                 number of guests at the party sets the data field, and displays the results. Works as intended*/
package party;
import java.util.Scanner;
public class UseDinnerParty2
{
    //public static void main(String[] args) 
    {
        int guests, choice;
        Party aParty = new Party();
        DinnerParty2 aDinnerParty = new DinnerParty2();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of guests for the party >> ");
        guests = keyboard.nextInt();
        aParty.setGuests(guests);//This method is inherited from the Party class
        System.out.println("The party has " + aParty.getGuests() + " guests");
        aParty.displayInvitation();//This method is inherited from the Party class
        System.out.print("Enter number of guests for the dinner party >> ");
        guests = keyboard.nextInt(); 
        aDinnerParty.setGuests(guests);//This method is inherited from the Party class
        System.out.print("Enter the menu option –– 1 for chicken or 2 for beef >> ");
        choice = keyboard.nextInt();
        aDinnerParty.setDinnerChoice(choice);
        System.out.println("The dinner party has " + aDinnerParty.getGuests() + " guests");
        System.out.println("Menu option " + aDinnerParty.getDinnerChoice () + " will be served");
        aDinnerParty.displayInvitation();//This method is inherited from the Party class
    }
}