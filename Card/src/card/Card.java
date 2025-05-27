/* Filename Card.java
 * Written by Thando Ngwenya
 * Written on 08/05/2020
 * Description : It's a class that has two data fields that hold a suit and a number for a deck of cards. It has
        a setValue() method does not allow a Card’s value to be less than 1 or higher than 13. If the argument 
        to setValue() is out of range, it assigns 1 to the Card’s value.*/
package card;
public class Card 
{
    private String suit;
    private int cardNumber;
    private final int NUM_DECKS = 4;
    public void setSuit()
    {
        int a = (int)(Math.random() * 100) % NUM_DECKS + 1;
        String s;
        switch (a) 
        {
            case 1:
                s = "Hearts";
                break;
            case 2:
                s = "Diamonds";
                break;
            case 3:
                s = "Spades";
                break;
            case 4:
                s = "Clubs";
                break;
            default:
                System.out.println("Some shit went wrong when setting a suit");
                s = "Quatzmonds";
                break;
        }
        suit = s;
    }
    public String getSuit()
    {
        return suit;
    }
    public void setValue(int cardNum)
    {
        if(cardNum < 1 || cardNum > 13)
            cardNumber = 1;
        cardNumber = cardNum;
    }
    public int getCardNumber()
    {
        return cardNumber;
    }
}