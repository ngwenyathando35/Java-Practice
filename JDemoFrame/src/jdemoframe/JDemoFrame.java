/* Introduction to Swing Components
 * Filename    : JDemoFrame.java pg 736
 * Written by  : The Textbook ft Thando
 * Written on  : 12 March 2021
 * Description : Demonstrating creating a JFrame. Workds as intended
*/
package jdemoframe;
import javax.swing.*;
public class JDemoFrame 
{
    public static void main(String[] args) 
    {
        JFrame aFrame = new JFrame("This is a frame");
        final int WIDTH = 250;
        final int HEIGHT = 250;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }
}