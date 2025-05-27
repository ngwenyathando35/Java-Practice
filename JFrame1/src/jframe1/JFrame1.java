/* Introduction to Swing Components
 * Filename    : JFrame1.java pg 727
 * Written by  : The Textbook
 * Written on  : 12 March 2021
 * Description : Demonstrating Using the JFrame Class: This program declares a JFrame named aFrame, sets its size to 250 pixels horizontally by 100 pixels
        vertically, and sets its title to display a String. Pixels are the picture elements, or tiny dots of light, that make up the image on your 
        computer monitor.*/
package jframe1;
import javax.swing.JFrame;
public class JFrame1 
{
    public static void main(String[] args) 
    {
        JFrame aFrame = new JFrame();
        aFrame.setSize(250, 250);
        aFrame.setVisible(true);
    }
}