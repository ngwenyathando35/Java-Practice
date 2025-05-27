/* Introduction to Swing Components :
 * Filename    : JFrameDisableButton.java pg 785
 * Written by  : Thando Ngwenya
 * Written on  : 17 March 2021
 * Modified on : The same day it was created. 
 * Description : This program instantiates a JFrame that contains a JButton. It disables the JButton when the user has clicked at least eight times. At 
        that point, it displays a JLabel that indicates “That’s enough!”. Works as intended     */
package jframedisablebutton2;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JLabel;
public class JFrameDisableButton2 extends JFrame implements ActionListener
{
    JButton btnEnable = new JButton("Enable");
    JLabel lbl = new JLabel("");
    final int MAX = 8;
    int count = 0;
    public JFrameDisableButton2() 
    {
        super();
        setVisible(true);
        setSize(100,100);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnEnable.addActionListener(this);
        add(btnEnable);
        add(lbl);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        count++;
        if(count == MAX)
        {
            lbl.setText("That's Enough!!!!");
            btnEnable.setEnabled(false);
        }
    }
    public static void main(String[] args) 
    {
        JFrameDisableButton2 frame = new JFrameDisableButton2();
        frame.setVisible(true);
    }
}