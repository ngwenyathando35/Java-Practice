/* Filename FindRent.java
 * Written by The Textbook pg 454
 * Description : Demonstrates multi-dimensional arrays. This program works as intended */
package findrent;
import javax.swing.JOptionPane;
public class FindRent 
{
    public static void main(String[] args) 
    {
        int[][] rents = { {400 , 450 , 510},
                          {500 , 560 , 630},
                          {625 , 676 , 740},
                          {1000, 1250, 1600} };
        String entry;
        int floor, bedrooms;
        entry = JOptionPane.showInputDialog(null,"Enter a floor number ");
        floor = Integer.parseInt(entry);
        entry = JOptionPane.showInputDialog(null,"Enter number of bedrooms ");
        bedrooms = Integer.parseInt(entry);
        JOptionPane.showMessageDialog(null,"The rent for a " + bedrooms + " bedroom apartment on floor " 
                + floor + " is $" + rents[floor][bedrooms]);
    }
}