/* Filename CountSpaces.java
 * Written by Thando Ngwenya
 * Written on 26/05/2020
 * Description : The program contains a String that holds your favorite movie quote and displays the total 
    number of spaces contained in the String.                                                           */
package countmoviespaces;
import javax.swing.JOptionPane;
public class CountMovieSpaces 
{
    public static void main(String[] args) 
    {
        int countSpace = 0;
        String line = "I will be back";
        int lineLength = line.length();
        for(int i = 0; i < lineLength; i++)
        {
            if(line.charAt(i) == ' ')
            {
                ++countSpace;
            }
        }
        JOptionPane.showMessageDialog(null,"There are " + countSpace + " spaces");
    }
}