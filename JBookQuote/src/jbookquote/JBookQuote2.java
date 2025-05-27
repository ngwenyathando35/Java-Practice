/* Introduction to Swing Components 
 * Filename    : JBookQuote2.java pg 785
 * Written by  : Thando Ngwenya
 * Written on  : 17 March 2021
 * Description : This program has a button that when the user clicks the button, it displays the title of the book that contains the quote. 
        Works as intended*/
package jbookquote;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JBookQuote2 extends JFrame implements ActionListener
{
    JFrame frame = new JFrame("Line from book");
    JLabel lbl = new JLabel("");
    JButton btn = new JButton("Press me");
    public JBookQuote2()
    {
        super("Line From Book");
        setSize(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(btn);
        add(lbl);
        btn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        lbl.setText("In the beginning");
    }
    public static void main(String[] args) 
    {
        Component frame = new JBookQuote2();
        frame.setVisible(true);
    }
}