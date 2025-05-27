/* Introduction to Swing Components
 * Filename    : JFrame4.java pg 739
 * Written by  : The Textbook
 * Written on  : 12 March 2021
 * Description : Demonstrating Changing a JLabel’s Font: The program an import statement for the package that contains the Font class. The program 
        contains a Font object named headlineFont that is applied to the greeting. The greeting appears in a 36-point, bold, Arial font. Works as 
        intended*/
package jframe4;
import java.awt.Font;
import javax.swing.*;
public class JFrame4 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("The Fourth Frame");
        frame.setSize(250,250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lblGreeting = new JLabel("Hello ntwana");
        Font headlineFont = new Font("Arial", Font.BOLD,12);
        lblGreeting.setFont(headlineFont);
        frame.add(lblGreeting);
     /* After a Font object is created, a new object with a different type and size is created using the deriveFont() method with appropriate arguments.
        For example, the following two statements create a headlineFont object and a textBodyFont object that is based on the first object:
        
        Font headlineFont = new Font("Arial", Font.BOLD, 36);
        Font textBodyFont = headlineFont.deriveFont(Font.PLAIN, 14);
     */
    }
}