/*
 * Filename Thando.java
 * Written by Thando Ngwenya
 * Written on 29/04/2020
 * Description : The program determines which volunteer to assign to price a donated item. It prompts the 
    user to answer a question about whether a donation is clothing or some other type, and then the program 
    displays the name of the volunteer who handles such donations. Clothing donations are handled by Regina, 
    and other donations are handled by Marco.
 */
package assignvolunteer3;
import java.util.Scanner;
public class AssignVolunteer3
{
    public static void main(String[] args) 
    {
        int donationType;
        String volunteer, message;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?"
                + "\nEnter " + CLOTHING_CODE + " for clothing " + 
                OTHER_CODE + " for anything else...");
        donationType = input.nextInt();
        if(donationType == CLOTHING_CODE)
        {    
            volunteer = CLOTHING_PRICER;
            message = "a clothing donation";
            System.out.println("You entered " + donationType + 
                "\nThe volunteer who will price this item is " + volunteer);
        }
        else if(donationType == OTHER_CODE)
        {
            volunteer = OTHER_PRICER;
            message = "a non-clothing donation";
            System.out.println("You entered " + donationType + 
                "\nThe volunteer who will price this item is " + volunteer);
        }
        else
            System.out.println("This is an invalid donation type\n"
            + "The volunteer who will price this item is invalid");
    }
}