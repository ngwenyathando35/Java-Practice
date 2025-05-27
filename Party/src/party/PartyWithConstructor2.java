/* Filename PartyWithConstructor2.java
 * Written by Textbook pg 511
 * Written on 17/04/2020
 * Modified (same day) version of the Party class to include a constructor
 * Modified again(same day) to demonstrate inheritance when the superclass requires constructor arguments
 * Description : To demonstrate inheritance. Works as intended */
package party;
public class PartyWithConstructor2
{
    private int guests ;
    public PartyWithConstructor2(int numGuests)
    {
        guests = numGuests;
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