/* ExceptionHandling.
 * Filename PlanMenu2.java
 * Written by Thando Ngwenya featuring the Textbook pg 648
 * Written on 18/20/2020
 * Description :  Demonstrating an application that can catch Exceptions. This application lets a customer 
        choose from the available dinner entrée options. It then mirrors the user's response using a message box
        and terminates after that. Works as intended*/
package menu;
import javax.swing.JOptionPane;
public class PlanMenu2
{
    public static void main(String[] args) 
    {
     // Three Menu items are being declared
        Menu2 briefMenu = new Menu2();
        PickMenu2 entree = null;
        String guestChoice = new String();
     /* The following is try block that constructs a PickMenu item. If the construction is successful, the next 
        statement assigns a selection to the entree object. Because entree is a PickMenu object, it has access 
        to the getGuestChoice() method in the PickMenu class, and you can assign the method’s returned value to 
        the guestChoice String.*/
        try
        {
            PickMenu2 selection = new PickMenu2(briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        }
        /*When the try block fails, guestChoice will not have a valid value, so the program will recover from 
        the exception by assigning a value to guestChoice within the following catch block:*/
        catch(MenuException error)
        {
            guestChoice = error.getMessage();
        }
        catch(Exception error)
        {
            guestChoice = "an invalid selection";
        }
        JOptionPane.showMessageDialog(null,"You chose " + guestChoice);
    }
}