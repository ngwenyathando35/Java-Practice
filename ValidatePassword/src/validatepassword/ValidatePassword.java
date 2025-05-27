/* Filename ValidatePassword.java
 * Written by Thando Ngwenya
 * Written on 26/05/2020
 * Description : This application prompts the user for a password that contains at least two uppercase letters, 
    at least two lowercase letters, and at least two digits. It continuously reprompt the user until a valid 
    password is entered. After each entry, it displays a message indicating whether the user was successful or 
    the reason the user was not successful. 
 */
package validatepassword;
import javax.swing.JOptionPane;
public class ValidatePassword 
{
    public static void main(String[] args) 
    {
        boolean isTwoUppercase, isTwoDigits, isTwoLowercase, allConditionsTrue = true;
        String password;
        password = JOptionPane.showInputDialog(null,"Please enter a password");
        while(allConditionsTrue)
        {
            isTwoUppercase = isTwoUppercase(password);
            isTwoDigits = isTwoDigits(password);
            isTwoLowercase = isTwoLowercase(password);
            if((isTwoUppercase == false) && (isTwoLowercase == false) && (isTwoDigits == false)) 
            {
                password = JOptionPane.showInputDialog(null,"Please enter a password\n"
                + "It must have at least two uppercase letters, at least two lowercase letters, "
                + "and at least two digits");
            }    
            else
                allConditionsTrue = false;
        }
        JOptionPane.showMessageDialog(null,"Password created Successfully");
    }
    private static boolean isTwoUppercase(String password) 
    {
        int countUpperCase = 0;
        for(int i = 0; i <= password.length(); i++)
        {
            if(Character.isUpperCase(password.charAt(i)) == true)
                ++countUpperCase;
        }
        if(countUpperCase == 2)
            return false;
        else
            return true;
    }
    private static boolean isTwoDigits(String password) 
    {
        int countUpperCase = 0;
        for(int i = 0; i <= password.length(); i++)
        {
            if(Character.isDigit(password.charAt(i)) == true)
                ++countUpperCase;
        }
        if(countUpperCase == 2)
            return false;
        else
            return true;
    }
    private static boolean isTwoLowercase(String password) 
    {
        int count = 0;
        for(int i = 0; i <= password.length(); i++)
        {
            if(Character.isLowerCase(password.charAt(i)) == true)
                ++count;
        }
        if(count == 2)
            return false;
        else
            return true;
    }
}