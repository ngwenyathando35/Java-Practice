/* Filename PickTwoCards.java
 * Written by Thando Ngwenya
 * Written on 09/04/2020
 * Description : This application randomly selects two playing cards and displays their values
 */
package picktwocards;
import java.util.Scanner;
public class PickTwoCards
{
    public static void main(String[] args) 
    {
        int myValue;
        char suit = 's', b;
        String a;
        Scanner input = new Scanner(System.in);
        final int CARDS_IN_SUIT = 13;
        System.out.println("Please enter a card suit");
        a = input.nextLine();
        b = a.charAt(0);
        System.out.println("Please enter a card number");
        myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
        System.out.println(suit + myValue);
    }
}