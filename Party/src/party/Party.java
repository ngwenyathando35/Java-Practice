/* Filename Party.java
 * Written by Textbook pg 498
 * Written on 17/04/2020
 * Description : To demonstrate inheritance. Works as intended */
package party;
public class Party 
{
    private int guests ;
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