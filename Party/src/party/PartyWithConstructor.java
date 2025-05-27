/* Filename PartyWithConstructor.java
 * Written by Textbook pg 510
 * Written on 17/04/2020
 * Modified (same day) version of the Party class to include a constructor
 * Description : To demonstrate inheritance. Works as intended */
package party;
public class PartyWithConstructor
{
    private int guests ;
    public PartyWithConstructor()
    {
        System.out.println("Creating a Party");
    }
    public int getGuests()
    {
        return guests;
    }
    public void setGuests(int numGuests)
    {
        guests = numGuests;
    }
    public void displayInvitation()
    {
        System.out.println("Please come to my party");
    }
}