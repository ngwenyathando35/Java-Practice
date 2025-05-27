/* Creating a Class that Automatically Throws Exceptions
 * Filename Menu.java
 * Written by Thando Ngwenya ft the Textbook
 * Written on 17/10/2020
 * Description : This is a class that contains two methods that throw exceptions but they're not caught. It 
        lists dinner choices and allows a user to make a selection and the displays the user's option to the 
        user. Works as intended.
 */
package menu;
import javax.swing.*;
public class Menu 
{
 // It has a String array for three entrée choices
    protected String[] entreeChoice = {"Rosemary Chicken", "Beef Wellington", "Maine Lobster"};
 // A String variable to build the menu that will be displayed
    private String menu = "";
 // An integer to hold the numeric equivalent of the selection
    private int choice;
 /* It has a displayMenu() method, which lists each entrée option with a corresponding number the customer can 
    type to make a selection. */  
    public String displayMenu()
    {
       for(int x = 0; x < entreeChoice.length; ++x)
        {
         /* Even though the allowable entreeChoice array subscripts are 0, 1, and 2, most users would expect to
            type 1, 2, or 3. So, x + 1  is coded rather than x as the number in the prompt. */
            menu = menu + "\n" + (x + 1) + " for " + entreeChoice[x];
        }
        String input = JOptionPane.showInputDialog(null, "Type your selection, then press Enter." + menu);
     // After the user enters a selection, it is converted to an integer.
        choice = Integer.parseInt(input);
     /* It then returns the String that corresponds to the user’s menu selection—the one with the subscript that
        is 1 less than the entered value. */  
        return(entreeChoice[choice - 1]);
    }
}