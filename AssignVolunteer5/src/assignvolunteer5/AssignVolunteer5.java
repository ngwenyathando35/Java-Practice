/* Filename AssignVolunteer5.java
 * Written by The Textbook page 312
 * Description : The program determines which volunteer to assign to price a donated item. It prompts the 
    user to answer a question about a donation type, and then uses a switch statement to assign the appropriate 
    volunteer which then displays the name of the volunteer who handles such donations */
package assignvolunteer5;
import java.util.Scanner;
public class AssignVolunteer5
{
    public static void main(String[] args) 
    {
        int donationType;
        String volunteer, message;
        final int CLOTHING_CODE = 1;
        final int FURNITURE_CODE = 2;
        final int ELECTRONICS_CODE = 3;
        final int OTHER_CODE = 4;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        final String FURNITURE_PRICER = "Walter";
        final String ELECTRONICS_PRICER = "Lydia";
        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?"
                + "\nEnter " + CLOTHING_CODE + " for clothing\n      " +
                FURNITURE_CODE + " for furniture \n      " +
                ELECTRONICS_CODE + " for electronics\n      " + 
                OTHER_CODE + " for anything else...");
        donationType = input.nextInt();
        while(donationType < CLOTHING_CODE || donationType > OTHER_CODE)
        {
            System.out.println("You entered " + donationType + " which is not a valid donation type");
            System.out.print("Please enter a value between " + CLOTHING_CODE + " and " + OTHER_CODE + "... ");
            System.out.print("Enter an integer... ");
            donationType = input.nextInt();
        }
        switch(donationType)
        {
            case(CLOTHING_CODE):
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation";
                break;
            case(FURNITURE_CODE):
                volunteer = FURNITURE_PRICER;
                message = "a furniture donation";
                break;
            case(ELECTRONICS_CODE):
                volunteer = ELECTRONICS_PRICER;
                message = "an electronics donation";
                break;
            case(OTHER_CODE):
                volunteer = OTHER_PRICER;
                message = "another donation type";
                break;
            default:
                volunteer = "invalid";
                message = "an invalid donation type";
        }
        System.out.println("You entered " + donationType + 
                "\nThe volunteer who will price this item is " + volunteer);
    }
}