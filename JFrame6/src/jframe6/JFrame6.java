/* Introduction to Swing Components
 * Filename    : JFrame6.java pg 744
 * Written by  : The Textbook
 * Written on  : 12 March 2021
 * Description : Demonstrating Using a Layout Manager: This program shows the JFrame’s layout manager has been set so that multiple components are 
        visible. Because a FlowLayout is used, the two JLabels appear side by side. If there were more JLabels or other components, they would continue
        to be placed side by side across the JFrame until there was no more room. Then, the additional components would be placed in a new row beneath 
        the first row of components. Works as intended*/
package jframe6;
import java.awt.FlowLayout;
import javax.swing.*;
public class JFrame6
{
    public static void main(String[] args)
    {
        final int FRAME_WIDTH = 250;
        final int FRAME_HEIGHT = 100;
        JFrame aFrame = new JFrame("Sixth frame");
        aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel greeting = new JLabel("Hello");
        JLabel greeting2 = new JLabel("Who are you?");
        aFrame.setLayout(new FlowLayout());
        aFrame.add(greeting);
        aFrame.add(greeting2);
    }
}