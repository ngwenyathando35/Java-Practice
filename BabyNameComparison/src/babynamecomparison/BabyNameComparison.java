/* Filename BabyNameComparison.java
 * Written by Thando Ngwenya
 * Written on 26/04/2020
 * Description : The program prompts the user for three first names and concatenates them in every possible 
    two-name combination so that new parents can easily compare them to find the most pleasing baby name  */
package babynamecomparison;
import javax.swing.JOptionPane;
public class BabyNameComparison 
{
    public static void main(String[] args) 
    {
        String name1 = JOptionPane.showInputDialog(null,"Enter the first name");
        String name2 = JOptionPane.showInputDialog(null,"Enter the second name");
        String name3 = JOptionPane.showInputDialog(null,"Enter the third name");
        JOptionPane.showMessageDialog(null, name1 + " " + name2 + "\n" + name1 + " " + 
                name3 + "\n" + name2 + " " + name1 + "\n" + name2 + " " + name3 + "\n" + 
                name3 + " " + name1 + "\n" + name3 + " " + name2);
    }
}