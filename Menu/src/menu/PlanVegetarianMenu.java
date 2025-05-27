/* Filename PlanVegetarianMenu.java
 * Written by Thando Ngwenya
 * Written on 19Oct2020
 * Description : This application lets a customer choose from the available dinner entrée options. It then 
        mirrors the user's response using a message box and terminates after that. Works as intended
 */
package menu;
import javax.swing.JOptionPane;
public class PlanVegetarianMenu 
{
    public static void main(String[] args) 
    {
        VegetarianMenu briefMenu = new VegetarianMenu();
        PickMenu entree = null;
        String guestChoice = new String();
        try
        {
            PickMenu selection = new PickMenu(briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        }
        catch(Exception error)
        {
            guestChoice = "an invalid vegetarina selection";
        }
        JOptionPane.showMessageDialog(null,"You chose " + guestChoice);
    }
}