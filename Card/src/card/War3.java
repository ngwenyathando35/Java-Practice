/* It goes into an infinite loop
 * Filename War3.java
 * Written by Thando Ngwenya
 * Written on 30/09/2020
 * Description : This is a card game is the modified version of War2. It randomly selects two Card objects (one 
        for the player and one for the computer) and declares a winner or a tie based on the card values. It 
        plays 26 rounds of War, dealing a full deck with no repeated cards. It has an array of all 52 playing 
        cards. It selects a random number for the deck position of the player’s first card, and assigns the card
        at that array position to the player.*/
package card;
import java.util.ArrayList;
public class War3
{
    public static void main(String[] args)
    {
        ArrayList<Card> deck = new ArrayList<>();
        assignCards(deck);
        int position;
        Card compCard = new Card();
        Card playCard = new Card();
        int c1Val, c2Val;
        String c1Suit, c2Suit;
        compCard = pickCard(deck);
        playCard = pickCard(deck);
        c1Val = compCard.getCardNumber();
        c2Val = playCard.getCardNumber();
        c1Suit = compCard.getSuit();
        c2Suit = playCard.getSuit();
        System.out.println("My card is " + c1Val + " of " + c1Suit);
        System.out.println("Your card is " + c2Val + " of " + c2Suit);
        whoWon(compCard, playCard);
    }
    private static Card checkMatch(Card card1, Card card2) 
    {
        if(card1.getCardNumber() == card2.getCardNumber() && card1.getSuit().equals(card2.getSuit()))
        {
            do
                card2.setSuit();
            while(card1.getSuit().equals(card2.getSuit()));
        }
        return card2;
    }
    private static void whoWon(Card card1, Card card2) 
    {
        if(card1.getCardNumber() == card2.getCardNumber())
            System.out.println("It's a tie");
        else if(card1.getCardNumber() > card2.getCardNumber())
            System.out.println("I won");
        else if(card2.getCardNumber() > card1.getCardNumber())
            System.out.println("You won");
        else
            System.out.println("Some shit went wrong when deciding the winner");
    }
    private static Card pickCard(ArrayList<Card> deck) 
    {
        Card card = new Card();
        int position, numCardsInDeck = 52;
        position = (int)(Math.random() * 100) % numCardsInDeck + 1;
        deck.get(position);
        return card;
    }
    private static ArrayList<Card> assignCards(ArrayList<Card> deck) 
    {
        final int CARDS_IN_SUIT = 13;
        int numDeckOfCards = 52;
        Card card = new Card();
        Card card1 = new Card();
        Card card2 = new Card();
        for(int i = 0; i < numDeckOfCards; i++)
        {
            card.setSuit();
            card.setValue((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
            deck.add(i, card);
        }
        card1 = deck.get(numDeckOfCards - 1);
        card2 = deck.get(numDeckOfCards - 2);
        for(int i = 0; i < numDeckOfCards - 1; i++)
        {
            checkMatch(card1, card2);
        }
        return deck;
    }
}