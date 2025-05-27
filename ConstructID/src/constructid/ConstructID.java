/* Filename ConstructID.java
 * Written by Thando Ngwenya
 * Description : This application prompts a user for a full name and street address and constructs an ID from the
    user’s initials and numeric part of the address. For example, the user Thando Ngwenya who lives at 2833B 
    Pela street would have an ID of TN2833, */
package constructid;
import java.util.Scanner;
public class ConstructID
{
    public static void main(String args[])
    {
        String name, address;
        char init1, init2; 
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        name = input.nextLine();
        init1 = name.charAt(0);
        int index = name.indexOf(' ');
        init2 = name.charAt(index + 1);
        System.out.println("Please enter your street address");
        address = input.nextLine();
        String digits = address.replaceAll("[^0-9]", "");
        System.out.println("Your ID is " + init1 + init2 + digits);
    }
}