/* Specify Exceptions that a Method Can Throw
 * Filename PriceListApplication2.java
 * Written by The Textbook pg 621
 * Written on 03Oct2020
 * Description : Demonstrating Exception Handling. This program is designed to handle an IndexOutOfBounds 
        exception by choosing a specific way to handle the error should it occur. In this program, the programmer has chosen
        to handle the exception by using the highest price in the array.
 */
package pricelist;
import java.util.*;
public class PriceListApplication2
{
    public static void main(String[] args)
    {
        int item;
        Scanner input = new Scanner(System.in);
        final int MAXITEM = 3;
        System.out.print("Enter item number >> ");
        item = input.nextInt();
        try
        {
            PriceList.displayPrice(item);
        }
        catch(IndexOutOfBoundsException e)
        {
            PriceList.displayPrice(MAXITEM);
        }
    }
}