/*
 * Filename Card.java
 * Written by Thando Ngwenya
 * Written on 30Sep2020
 * Description : The class contains a “deck” of 52 playing cards that uses a Card class that holds a suit and 
        value for each Card object. 
 */
package cardgame;
public class Card 
{
    private String suit;
    private int value;
    public Card()
    {
        suit = setSuit();
        value = 5;
    }
    public void setSuit()
    {
        String s;
        setDiamonds(s);
        setHearts();
        setSpades();
        setClubs();
        return s;
    }
    private String setDiamonds(String s) 
    {
        int count = 4;
        int a = (int)(Math.random() * 100) % 4 + 1;
        if(a == 1)
        return s;
    }
}