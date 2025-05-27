/* Filename DinnerPartyWithConstructor.java
 * Written by the textbook pg 505
 * Written on 17/08/2020 
   Modified on the same day to override certain parent class methods
   Modified on the same day to override a constructor using the keyword "super"
 * Description : This class “is a” type of Party at which dinner is served, so DinnerParty is a child class of 
                 Party. */
package party;
public class DinnerPartyWithConstructor extends PartyWithConstructor
{
    private int dinnerChoice;
    public int getDinnerChoice()
    {
        return dinnerChoice;
    }
    public void setDinnerChoice(int choice)
    {
        dinnerChoice = choice;
    }
    @Override
    public void displayInvitation()
    {
        System.out.println("Please come at my party");
    }
}