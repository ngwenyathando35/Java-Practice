/* Exception Handling.
 * Filename Menu.java
 * Written by Thando Ngwenya ft the Textbook
 * Written on 17/10/2020
 * Description : Demonstrating using an Exception class created by me(the programmer). This is a class that 
        contains two methods that throw exceptions but they're not caught. It lists dinner choices and allows a 
        user to make a selection and then displays the user's option to the user. Works as intended.
 */
package menu;
import javax.swing.*;
public class Menu2
{
 // It has a String array for three entrée choices
    protected String[] entreeChoice = {"Rosemary Chicken", "Beef Wellington", "Maine Lobster"};
 // A String variable to build the menu that will be displayed
    private String menu = "";
 // An integer to hold the numeric equivalent of the selection
    private int choice;
 // an array of characters that can hold the first letter of each of the entrées in the menu.
    protected char initial[] = new char[entreeChoice.length];
 /* It has a displayMenu() method, which lists each entrée option with a corresponding number the customer can 
    type to make a selection. The method also has a "throws" clause because it will throw a MenuExeption */  
    public String displayMenu() throws MenuException
    {
       for(int x = 0; x < entreeChoice.length; ++x)
        {
         /* Even though the allowable entreeChoice array subscripts are 0, 1, and 2, most users would expect to
            type 1, 2, or 3. So, x + 1  is coded rather than x as the number in the prompt. */
            menu = menu + "\n" + (x + 1) + " for " + entreeChoice[x];
         /* The first character of each entreeChoice is taken and stored it its corresponding element of the 
            'initial' array. At the end of the for loop, the 'initial' array holds the first character of each 
            available entree*/
            initial[x] = entreeChoice[x].charAt(0);
        }
        String input = JOptionPane.showInputDialog(null, "Type your selection, then press Enter." + menu);
     /* The following loop that compares the first letter of the user’s choice to each of the initials of valid
        menu options. If a match is found, it throws a new instance of the MenuException class that uses the
        corresponding entrée as its String argument. In other words, when this thrown MenuException is caught by
        another method, the assumed entrée is the String returned by the getMessage() method. By placing this 
        test before the call to parseInt(), it causes entries of R, B, or M to throw a MenuException before they 
        can cause a NumberFormatException.*/
        for(int y = 0; y < entreeChoice.length; ++y)
            if(input.charAt(0) == initial[y]) throw (new MenuException(entreeChoice[y]));
     // After the user enters a selection, it is converted to an integer.
        choice = Integer.parseInt(input);
     /* It then returns the String that corresponds to the user’s menu selection—the one with the subscript that
        is 1 less than the entered value. */  
        return(entreeChoice[choice - 1]);
    }
}