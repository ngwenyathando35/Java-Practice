/* Introduction to Swing Components : Learning About Event-Driven Programming
 * Filename    : JFrameWithComponents.java pg 762
 * Written by  : The Textbook ft Thando
 * Written on  : 17 March 2021
 * Description : Demonstrating Adding Functionality to a JButton and a JTextField  	
*/
package jaction2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;// For Event Handling
public class JAction2 extends JFrame implements ActionListener
{
    JLabel lbl = new JLabel(" Hi, I am a label");
    JButton btn = new JButton("Press me");
    JTextField txt = new JTextField("Enter text here");
    JAction2()
    {
        super("JAction2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(lbl);
        add(txt);
        add(btn);
        btn.addActionListener(this);
        txt.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object source = e.getSource();
        if(source == btn)
            lbl.setText("You clicked the button");
        else
            lbl.setText("You pressed Enter");
    }
    public static void main(String[] args)
    {
        JAction2 aFrame = new JAction2();
        final int WIDTH = 250;
        final int HEIGHT = 100;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }
}
