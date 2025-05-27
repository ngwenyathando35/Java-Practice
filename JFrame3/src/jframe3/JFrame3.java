/* Introduction to Swing Components
 * Filename    : JFrame3.java pg 739
 * Written by  : The Textbook
 * Written on  : 12 March 2021
 * Description : Demonstrating Using the JLabel Class: This application creates a JFrame  and its size, visibility, and close operation are set. Then a 
        JLabel is created and added to the JFrame. Works as intended.*/
package jframe3;
import javax.swing.*;
public class JFrame3 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("The Third JFrame");
        frame.setSize(250,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JLabel lbl = new JLabel("Hi, I'm a label");
        frame.add(lbl);
    }
}