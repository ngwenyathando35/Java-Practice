/* Using Multiple Catch Blocks
 * Filename ExceptionDemo.java
 * Written by Thando Ngwenya and the Java Programing Textbook pg 608
 * Written on 03/10/2020
 * Description : In this application, the user enters two values to be divided. An exception is caught if either
        of the entered values is not an integer. 3 integers are declared; two to be input by the user and a 
        third to hold the result after dividing the first two. The numerator and denominator variables must be 
        assigned starting values because their values will be entered within a try block. The compiler might 
        throw an exception before it is through. An input String is also declared to hold the return value of 
        the showInputDialog method. A try block prompts the user for two values, converts each entered String to
        an integer, and divides the values, producing result. A catch block catches an ArithmeticException 
        object if division by 0 is attempted. If that block executes, it displays an error message, and forces 
        result to 0. Another catch block catches a NumberFormatException object if neither user entry can be 
        converted to an integer. If this block executes, It displays an error message, sets the numerator and 
        denominator to a default value of 999, and forces result to 1. Whether the try block succeeds or not, 
        it will display the result (which might have been set to 0). */
package exceptiondemo;
import javax.swing.*;
public class ExceptionDemo2
{
    public static void main(String[] args) 
    {
        int numerator = 0, denominator = 0, result;
        String inputString;
        try
        {
            inputString = JOptionPane.showInputDialog(null, "Enter a number to be divided");
            numerator = Integer.parseInt(inputString);
            inputString = JOptionPane.showInputDialog(null, "Enter a number to divide into the first number");
            denominator = Integer.parseInt(inputString);
            result = numerator / denominator;
        }
        catch(ArithmeticException exception)
        {
            JOptionPane.showMessageDialog(null, exception.getMessage() + " is not possible");
            result = 0;
        }
        catch(NumberFormatException exception)
        {
            JOptionPane.showMessageDialog(null, "This application accepts digits only!");
            numerator = 999;
            denominator = 999;
            result = 1;
        }
            JOptionPane.showMessageDialog(null, numerator + " / " + denominator + "\nResult is " + result);
    }
}