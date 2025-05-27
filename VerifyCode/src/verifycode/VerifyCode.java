/*
 * Filename VerifyCode.java
 * Written by Java Programming 
 * Description : The program verifies a product code entered by the user. The array codes holds six values in 
    ascending order. The user enters a code that is extracted from the first String position using the String 
    class charAt() method. Next, the array of valid characters and the user-entered character are passed to the 
    Arrays.binarySearch() method. If the character is found in the array, its position is returned. If the 
    character is not found in the array, a negative integer is returned and the program displays an error
    message. The program works as intended                                      */
package verifycode;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class VerifyCode
{
    public static void main(String[] args)
    {
        char[] codes = {'B', 'E', 'K', 'M', 'P', 'T'};
        String entry;
        char usersCode;
        int position;
        entry = JOptionPane.showInputDialog(null,"Enter a product code");
        usersCode = entry.charAt(0);
        position = Arrays.binarySearch(codes, usersCode);
        if(position >= 0)
            JOptionPane.showMessageDialog(null,"Position of " + usersCode + " is " + position);
        else
            JOptionPane.showMessageDialog(null, usersCode + " is an invalid code");
    }
}