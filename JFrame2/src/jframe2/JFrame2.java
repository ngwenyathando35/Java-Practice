/* Introduction to Swing Components
 * Filename    : JFrame2.java pg 735
 * Written by  : The Textbook
 * Written on  : 12 March 2021
 * Description : Demonstrating Customising a JFrames Appearance: This program set a JFrame’s look and feel using the setDefaultLookAndFeelDecorated()
        method. Works as intended   */
package jframe2;
import javax.swing.JFrame;
public class JFrame2 
{
    public static void main(String[] args) 
    {
        JFrame aFrame  = new JFrame("Frame Second Frame");
        aFrame.setSize(205, 100);
        aFrame.setVisible(true);
        aFrame.setDefaultLookAndFeelDecorated(true);
    }
}