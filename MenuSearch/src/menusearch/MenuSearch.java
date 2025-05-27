/* The application does not work as intended. It does not display the menu after a valid String is entered
 * Filename MenuSearch.java
 * Written by Thando Ngwenya and the Java Textbook pg 464
 * Written on 25/07/2020
 * Description : This application demonstrates several Arrays class methods. The application will allow the user 
    to enter a menu of entrées that are available for the day at a restaurant. Then, the application will present 
    the menu to the user, allow a request, and indicate whether the requested item is on the menu. */
package menusearch;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class MenuSearch 
{
    public static void main(String[] args) 
    {
        String[] menuChoices  = new String[10];
        String currentEntry = "", menuString = "";
        String QUIT = "999";
        int x = 0;
        int numEntered = 0;
        int highestSub = 1 - menuChoices.length;
        /*  The Arrays.fill() method is used to fill the menu array with z characters, The method is used so that 
            when a search is performed later, actual values will be stored in any unused menu positions.    */
        Arrays.fill(menuChoices, "zzzzzzz");
        /*  Lowercase zs were purposely chosen as the array fill characters because they have a higher value than 
            any other letter. Therefore, when the user’s entries are sorted, the zzzzzzz entries will be at the
            bottom of the list.         */
        
        /*  an input dialog box is called so that the user can enter a menu item. the user is allowed to quit
            the program before entering 10 items by typing “zzz”. After the user enters the first menu item, the 
            application enters a loop that continues to add the entered item to the menu list, the subscript is
            increased, and the user is prompted for a new menu item. The loop continues while the user has not 
            entered “zzz” and the subscript has not exceeded the allowable limit. */
        currentEntry = JOptionPane.showInputDialog(null,"Enter menu item or 999 to quit");
        while(!menuChoices[x].equals("zzz") && x < highestSub)
        {
            menuString = menuString + menuChoices[x] + "\n";
            ++x;
            if(x < highestSub)
                menuChoices[x] = JOptionPane.showInputDialog(null,
                        "Enter an item for today's menu, or zzz to quit");
        }
        
        //When the loop ends, the number of menu items entered is saved
        numEntered = x;
        
        //When the menu is complete, it is displayed to the user , and the user is allowed to make a request
        currentEntry = JOptionPane.showInputDialog(null,"Today's menu is:\n" + menuString + 
                "Please make a selection:");
        
        /*  The array is from index position 0 to numEntered so that it is in ascending order prior to using the 
            binarySearch() method. If this step is skipped, the result of the binarySearch() method will be
            unpredictable. The entire array could be sorted first but it is more efficient to sort only the 
            elements that hold actual menu items                                */
        Arrays.sort(menuChoices, 0, numEntered);
        
        /*  the Arrays.binarySearch() method to is used to search for the requested entry in the previously 
            sorted array. If the method returns a nonnegative value that is less than the numEntered value, 
            the message “Excellent choice” is displayed otherwise, an error message is displayed     */
        x = Arrays.binarySearch(menuChoices, currentEntry);
        if(x >= 0 && x < numEntered)
            JOptionPane.showMessageDialog(null, "Excellent choice");
        else
            JOptionPane.showMessageDialog(null,"Sorry - that item is not on tonight's menu");
    }
}