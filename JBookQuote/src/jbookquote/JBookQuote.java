/* Introduction to Swing Components 
 * Filename    : JBookQuote.java pg 785
 * Written by  : Thando Ngwenya
 * Written on  : 17 March 2021
 * Description : This program displays a JFrame containing the opening sentence of from Thando's favorite book. Works as intended*/
package jbookquote;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class JBookQuote 
{
    //public static void main(String[] args) 
    {
        JFrame frame = new JFrame("The Bible");
        JLabel lbl = new JLabel("In the beginning");
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(lbl);
    }
}