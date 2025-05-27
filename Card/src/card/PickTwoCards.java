/*
 * Filename PickTwoCards.java
 * Written by Thando Ngwenya
 * Written on 30/09/2020
 * Description : This is an app that randomly selects two playing cards and displays their values. It assigns a 
        suit to each of the cards, but generates a random number for each card’s value. 
*/
package card;
public class PickTwoCards 
{
    //public static void main(String[] args)
    {
        final int CARDS_IN_SUIT = 13;
        Card card1 = new Card();
        Card card2 = new Card();
        int myValue;
        card1.setSuit();
        card2.setSuit();
        card1.setValue(((int)(Math.random() * 100) % CARDS_IN_SUIT + 1));
        card2.setValue(((int)(Math.random() * 100) % CARDS_IN_SUIT + 1));
        System.out.println("Card 1 : " + card1.getCardNumber() + " of " + card1.getSuit());
        System.out.println("Card 2 : " + card2.getCardNumber() + " of " + card2.getSuit());
    }
}