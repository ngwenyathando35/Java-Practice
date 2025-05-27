/* Filename PriceList.java
 * Written by Java Programming
 * Written on 03Oct2020
 * Description : This class is used by a company to hold a list of prices for items it sells. There displayPrice()
        displays the price of a single item. It accepts a parameter to use as the array subscript, but because the
        subscript could be out of bounds, the method contains a throws clause, acknowledging it could throw an 
        exception. */
package pricelist;
public class PriceList 
{
    private static final double[] price = {15.99, 27.88, 34.56, 45.89};
    public static void displayPrice(int item) throws IndexOutOfBoundsException
    {
        System.out.println("The price is $" + price[item]);
    }
}