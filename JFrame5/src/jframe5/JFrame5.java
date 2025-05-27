/* Introduction to Swing Components
 * Filename    : JFrame5.java pg 743
 * Written by  : The Textbook
 * Written on  : 12 March 2021
 * Description : Demonstrating Using a Layout Manger: This application has two JLabels created and added to a JFrame in the final two statements. 
        Works as intended*/                                                                      
package jframe5;
import javax.swing.*;
public class JFrame5
{
    public static void main(String[] args)
    {
        final int FRAME_WIDTH = 250;
        final int FRAME_HEIGHT = 100;
        JFrame aFrame = new JFrame("Fifth frame");
        aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel greeting = new JLabel("Hello");
        JLabel greeting2 = new JLabel("Who are you?");
        aFrame.add(greeting);
        aFrame.add(greeting2);
        
     /* Although two JLabels are added to the frame, only the last one added is visible. The second JLabel has been placed on top of the first one, 
        totally obscuring it. If you continued to add more JLabels to the program, only the last one added to the JFrame would be visible        */
    }
}