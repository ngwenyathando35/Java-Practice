/* Filename FindDiscount.java
 * Written by The Textbook on page 419
 * Description : Demonstrating how a range match works. A parrallel array is used to search a range of values in
    the array.
 */
package finddiscount;
import javax.swing.*;
public class FindDiscount
{
    public static void main(String[] args)
    {
        final int NUM_RANGES = 5;
        int[] discountRangeLimits = { 1, 13, 50, 100, 200};
        double[] discountRates = {0.00, 0.10, 0.14, 0.18, 0.20};
        double customerDiscount;
        String strNumOrdered;
        int numOrdered, sub = NUM_RANGES - 1;
        strNumOrdered = JOptionPane.showInputDialog(null,"How many items are ordered?");
        numOrdered = Integer.parseInt(strNumOrdered);
        while(sub >= 0 && numOrdered < discountRangeLimits[sub])
            --sub;
        customerDiscount = discountRates[sub];
        JOptionPane.showMessageDialog(null, "Discount rate for " + numOrdered + " items is "
                + customerDiscount);
    }
}