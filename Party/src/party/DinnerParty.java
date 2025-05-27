/* Filename DinnerParty.java
 * Written by the textbook pg 500
 * Written on 17/08/2020
 * Description : This class “is a” type of Party at which dinner is served, so DinnerParty is a child class of 
                 Party. Works as intended*/
package party;
public class DinnerParty extends Party
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
}