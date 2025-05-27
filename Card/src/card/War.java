/* Filename War.java
 * Written by Thando Ngwenya
 * Written on 30/09/2020
 * Description : The application randomly selects two playing cards and displays their values. It deals two 
        Cards—one for the computer and one for the player—and determines the higher card, and then it displays
        a message indicating whether the cards are equal, the computer won, or the player won. (Playing cards 
        are considered equal when they have the same value, no matter what their suit is).Works as intended */
package card;
public class War 
{
    //public static void main(String[] args)
    {
        final int CARDS_IN_SUIT = 13;
        Card card1 = new Card();
        Card card2 = new Card();
        int c1Val, c2Val;
        char c1Suit, c2Suit;
        card1.setSuit();
        card2.setSuit();
        card1.setValue(((int)(Math.random() * 100) % CARDS_IN_SUIT + 1));
        card2.setValue(((int)(Math.random() * 100) % CARDS_IN_SUIT + 1));
        c1Val = card1.getCardNumber();
        c2Val = card2.getCardNumber();
        c1Suit = card1.getSuit();
        c2Suit = card2.getSuit();
        checkMatch(card1, card2);
        System.out.println("Computer Card : " + c1Val + " of " + c1Suit);
        System.out.println("Player Card : " + c2Val + " of " + c2Suit);
        whoWon(card1, card2);
    }
    private static Card checkMatch(Card card1, Card card2) 
    {
        if(card1.getCardNumber() == card2.getCardNumber() && card1.getSuit() == card2.getSuit())
        {
            do
                card2.setSuit();
            while(card1.getSuit() == card2.getSuit());
        }
        return card2;
    }
    private static void whoWon(Card card1, Card card2) 
    {
        if(card1.getCardNumber() == card2.getCardNumber())
            System.out.println("The cards are equal");
        else if(card1.getCardNumber() > card2.getCardNumber())
            System.out.println("The computer won");
        else if(card2.getCardNumber() > card1.getCardNumber())
            System.out.println("You won");
        else
            System.out.println("Some shit went wrong when deciding the winner");
    }
}