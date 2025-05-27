/*
 * Filename TryToParseDouble.java
 * Written by Thando Ngwenya
 * Written on 01/01/2021
 * Description : The Double.parseDouble() method requires a String argument, but it fails if the String cannot be 
        converted to a floating-point number. This program accepts a double input from a user and catches a 
        NumberFormatException if one is thrown. The catch block forces the number to 0 and displays an 
        appropriate error message. It then displays the number following the catch block. Works as intended */
package trytoparsedouble;
import javax.swing.JOptionPane;
public class TryToParseDouble 
{
    public static void main(String[] args) 
    {
        double num = 999999999;
        String number;
        number = JOptionPane.showInputDialog(null,"Please enter a number");
        try
        {
            num = Double.parseDouble(number);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"You entered an unconvertable number"
                    + "\nTherefore, it will be set to zero");
            num = 0;
        }
        finally
        {
            JOptionPane.showMessageDialog(null,"The number is " + num);
        }
    }
}