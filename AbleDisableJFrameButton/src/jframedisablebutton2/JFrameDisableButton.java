/* Introduction to Swing Components :
 * Filename    : JFrameDisableButton.java pg 785
 * Written by  : Thando Ngwenya
 * Written on  : 17 March 2021
 * Description : This program instantiates a JFrame that contains a JButton. It disables the JButton after the user clicks it.
*/
package jframedisablebutton2;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
public class JFrameDisableButton extends JFrame implements ActionListener
{
    JButton btnEnable = new JButton("Enable");
    public JFrameDisableButton() 
    {
        super();
        setVisible(true);
        setSize(100,100);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnEnable.addActionListener(this);
        add(btnEnable);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        btnEnable.setEnabled(false);
    }
    //public static void main(String[] args) 
    {
        JFrameDisableButton frame = new JFrameDisableButton();
        frame.setVisible(true);
    }
}
