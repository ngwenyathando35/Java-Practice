/* Creating a class that Passes an Exception Object
 * Filename PickMenu.java pg 641
 * Written by Thando Ngwenya
 * Written on 17/10/2020
 * Description : This class lets a customer choose from the available dinner entrée options. To enable the 
        PickMenu class to operate with different kinds of Menus in future, a Menu will be passed to PickMenu’s 
        constructor.  */
package menu;
import javax.swing.*;
public class PickMenu2
{
 // It declares a Menu and a String named guestChoice that holds the name of the entrée the customer selects.
    private Menu2 briefMenu;
    private String guestChoice = new String();
 /* The PickMenu constructor, which receives an argument representing a Menu. The constructor assigns the Menu 
    that is the argument to the local Menu, and then calls the setGuestChoice() method, which prompts the user 
    to select from the available menu. The PickMenu() constructor might throw an exception because it calls 
    setGuestChoice(), which calls displayMenu(), a method that uses keyboard input and might throw an exception.
    */
    public PickMenu2(Menu2 theMenu) throws MenuException, Exception
    {
        briefMenu = theMenu;
        setGuestChoice();
    }
 /* The following setGuestChoice() method displays the menu and reads keyboard data entry (so the method throws
    an exception). It also displays instructions and then retrieves the user’s selection.*/ 
    private void setGuestChoice() throws Exception
    {
        JOptionPane.showMessageDialog(null,"Choose from the following menu:");
        guestChoice = briefMenu.displayMenu();
    }
 // The following getGuestChoice() method that returns a guest’s String selection from the PickMenu class. 
    public String getGuestChoice()
    {
        return(guestChoice);
    }
}