/* Filename Thando'sCurrencyConverter.java
 * Written by Thando Ngwenya
 * Written on 18/06/2020
 * Description : The program converts dollars to rands..........................for now.*/
package thando.scurrencyconverter;
import javax.swing.JOptionPane;
public class ThandoSCurrencyCoverter 
{
    public static void main(String[] args) 
    {
        double usdAmount = 0, zarAmount, exchangeRate, value;
        final double QUIT = 99999999;
        int numValues = 0, count = 0;
        numValues = Integer.parseInt(JOptionPane.showInputDialog(null,"How many values do want to convert "
                + "or close this window to quit"));
        exchangeRate = Double.parseDouble(JOptionPane.showInputDialog(null,"What is the USD/ZAR exchange rate"
                + "or close this window to quit"));
        usdAmount = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter dollar  "
                + "amount or close this window to quit"));
        double[] values = new double[numValues];
        while(usdAmount != QUIT)
        {
            values[count] = usdAmount;
            ++count;
            if(count == numValues)
                usdAmount = QUIT;
            else
            {
                usdAmount = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter dollar amount or close "
                        + "this window to quit"));
            }
        }
        for(int x = 0; x < values.length; x++)
        {
            zarAmount = values[x] * exchangeRate;
            JOptionPane.showMessageDialog(null,values[x] + " in rands is " + zarAmount);
        }
        JOptionPane.showMessageDialog(null,"Thank you for using this program");
    }
}