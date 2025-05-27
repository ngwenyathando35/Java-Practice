/* Specify Exceptions that a Method Can Throw
 * Filename PriceListApplication1.java
 * Written by The Textbook pg 621 
 * Written on 03Oct2020
 * Description : Demonstrating Exception Handling. This program is desingned to handle an IndexOutOfBounds 
        exception by choosing a specific way to handle it should it occur.In this program, the programmer has 
        chosen to handle the exception in the catch block by displaying a price of $0. 
 */
package pricelist;
import java.util.*;
public class PriceListApplication1
{
 //   public static void main(String[] args)
    {
        int item;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter item number >> ");
        item = input.nextInt();
        try
        {
            PriceList.displayPrice(item);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Price is $0");
        }
    }
}