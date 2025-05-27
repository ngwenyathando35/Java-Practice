/* Introduction to Swing Components : Learning About Event-Driven Programming
 * Filename    : JFrameWithComponents.java pg 754
 * Written by  : The Textbook ft Thando
 * Written on  : 17 March 2021
 * Description : Demonstrating Adding Components to a JFrame -  	
*/
package jframewithcomponents;
import javax.swing.*;
import java.awt.*;
public class JFrameWithComponents extends JFrame
{
    JLabel lbl = new JLabel(" Hi, I am a label");
    JButton btn = new JButton("Press me");
    JTextField txt = new JTextField("Enter text here");
    JFrameWithComponents()
    {
        super("Frame With Components");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(lbl);
        add(txt);
        add(btn);
    }
    
}
