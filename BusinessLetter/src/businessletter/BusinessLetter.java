/* Filename BalanceLetter.java
 * Written on Thandazile's Birthday in 2020
 * Description : Extracts names so that a friendly business letter can be constructed. */
package businessletter;
import javax.swing.JOptionPane;
public class BusinessLetter 
{
    public static void main(String[] args) 
    {
        String name;
        String firstName = "";
        String familyName = "";
        int x;
        char c;
        //prompts the user for a customer’s first and last names.
        name = JOptionPane.showInputDialog(null,"Please enter customer's first and last name");
        //After the application prompts the user to enter a name, a loop control variable is initialized to 0. 
        x = 0;
        //While the variable remains less than the length of the entered name,  
        while(x < name.length())
        {
            //each character is compared to the space character.
            if(name.charAt(x) == ' ')
            {
                //When a space is found, two new strings are created.
                //The first is the substring of the original entry from position 0 to the location where the 
                //space was found. 
                firstName = name.substring(0, x);
                //The second is the substring of the original entry from the position after the space to the 
                // end of the string. 
                familyName = name.substring(x + 1, name.length());
                /*Once the first and last names have been created, the loop control variable is set to the 
                length of the original string so the loop will exit */
                x = name.length();
            }
            ++x;
        }
        // and proceed to the display of the friendly business letter. 
        JOptionPane.showMessageDialog(null,"Dear " + firstName +
        ",\nI am so glad we are on a first name basis" +
        "\nbecause I would like the opportunity to" +
        "\ntalk to you about an affordable insurance" +
        "\nprotection plan for the entire " + familyName +
        "\nfamily. Call A-One Family Insurance today" +
        "\nat 011 934 7079.");
    }
}