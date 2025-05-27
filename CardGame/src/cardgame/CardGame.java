/*
 * Filename CardGame.java
 * Written by Thando Ngwenya
 * Written on 30/09/2020
 * Description : This is an abstract class. The class contains a “deck” of 52 playing cards that uses a Card 
        class that holds a suit and value for each Card object. It also contains an integer field that holds the
        number of cards dealt to a player in a particular game. The class contains a constructor that 
        initializes the deck of cards with appropriate values (e.g., “King of Hearts”), and a
shuffle() method that randomly arranges the positions of the Cards in the array.
The class also contains two abstract methods: displayDescription(), which
displays a brief description of the game in each of the child classes, and deal(),
which deals the appropriate number of Card objects to one player of a game.
 */
package cardgame;
public abstract class CardGame 
{
    public static void main(String[] args) 
    {
        Card[] deck = new Card[52];
        int numCardsDealt;
    }
}