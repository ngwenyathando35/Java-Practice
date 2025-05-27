/* Filename NumberInput.java
 * Written by Java Programming 2018 page 373
 * Description : This program prompts the user for a number, reads characters from the keyboard, stores the 
    characters in a String, and then converts the String to an integer that can be used in arithmetic statements*/
package numberinput;
import javax.swing.JOptionPane;
public class NumberInput 
{
    public static void main(String[] args) 
    {
        String inputString;
        int inputNumber;
        int result;
        final int FACTOR = 10;
        inputString = JOptionPane.showInputDialog(null,"Enter a number");
        inputNumber = Integer.parseInt(inputString);
        result = inputNumber * FACTOR;
        JOptionPane.showMessageDialog(null, inputNumber + " * " + FACTOR + " = " + result);
        
    }
}