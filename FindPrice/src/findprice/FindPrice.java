/* Filename FindPrice.java
 * Written by The textbook
 * Description : This program demonstrates the use of parallel arrays. The first array holds the item number and
    the second array holds the price of that specific item. It then uses an array that will get both values 
    a single for loop                                                                                         */
package findprice;
import javax.swing.*;
public class FindPrice 
{
    public static void main(String[] args) 
    {
        final int NUMBER_OF_ITEMS = 10;
        int[] validValues = {101, 108, 201, 213, 266, 304, 311, 409, 411, 412};
        double[] prices = {5.36, 1.23, 3.50, 0.69, 6.79, 3.19, 0.99, 0.89, 1.26, 8.00};
        String strItem;
        int itemOrdered;
        double itemPrice = 0.0;
        boolean validItem = false;
        strItem = JOptionPane.showInputDialog(null,"Enter the item number you want to order");
        itemOrdered = Integer.parseInt(strItem);
        for (int x = 0; x < NUMBER_OF_ITEMS; ++x) 
        {
            if (itemOrdered == validValues[x]) 
            {
                validItem = true;
                itemPrice = prices[x];
                x = NUMBER_OF_ITEMS;
            }
        }
        if (validItem) 
        {
            JOptionPane.showMessageDialog(null, "The price for item " + itemOrdered + " is $" + itemPrice);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null,"Sorry - invalid item entered");
        }
    }
}