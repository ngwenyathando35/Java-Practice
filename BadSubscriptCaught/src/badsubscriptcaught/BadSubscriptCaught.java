/* Filename BadSubscriptCaught.java
 * Written by Thando Ngwenya
 * Written on 07/01/2021
 * Description : This program declares an array of 10 first names. It has a try block which prompts the user for 
        an integer and display the name in the requested position. It also has a catch block that catches the
        potential ArrayIndexOutOfBoundsException thrown when the user enters a number that is out of range. The 
        catch block should also display an error message. Works as intended*/
package badsubscriptcaught;
import java.util.Scanner;
public class BadSubscriptCaught 
{
    public static void main(String[] args) 
    {
        String firstNames[] = {"Thando","Phillip","Mthimkulu","Ngwenya","Mthimunye","Cheeseboy","Indlwabe",
                               "Menslyn","Periodo","Pains",};
        Scanner input = new Scanner(System.in);
        int num;
        String name;
        System.out.println("Please enter a number between 1 and 10 inclusive");
        try
        {
            num = input.nextInt();
            name = firstNames[--num];
            System.out.println("Hi, the name you've chosen is " + name);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("We asked you to chose between a 1 and 10 and you did, your own thing."
                    + "Are you mad?\n" + e.getMessage());
        }
    }
}