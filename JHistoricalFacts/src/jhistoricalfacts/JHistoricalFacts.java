/* Introduction to Swing Components : The program crashes after the pressing the button
 * Filename    : JHistoricalFacts.java pg 785
 * Written by  : Thando Ngwenya
 * Written on  : 17 March 2021
 * Description : This program has a JFrame and at least five labels that contain interesting historical facts. Every time the user clicks a JButton, it 
        removes one of the labels and adds a different one.
*/
package jhistoricalfacts;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JHistoricalFacts extends JFrame implements ActionListener
{
    JLabel lbl1 = new JLabel("Mandela spent 27 years in jail");
    JLabel lbl2 = new JLabel("Humans evolved from being apes");
    JLabel lbl3 = new JLabel("Neil Armstrong was the first man who went to outer space");
    JLabel lbl4 = new JLabel("Thando is gonna be the best software developer in Southern Africa");
    JLabel lbl5 = new JLabel("Dinosaurs once existed on planet earth");
    JButton btn = new JButton("Press Me");
    Object labels[] = {lbl1, lbl2, lbl3, lbl4, lbl5};
    int count = 0;

    public JHistoricalFacts()
    {
        super("Historical Facts");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(btn);
        add(lbl1);
        btn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(count == 0)
        {
            lbl1.remove(this);
            lbl2.add(this);
        }
        else if(count == 1)
        {
            lbl2.remove(this);
            lbl3.add(this);
        }
        else if(count == 2)
        {
            lbl3.remove(this);
            lbl4.add(this);
        }
        else if(count == 3)
        {
            lbl4.remove(this);
            lbl5.add(this);
        }
        else
            lbl5.setText("Thank you for using this program");
    }
    public static void main(String[] args) 
    {
        JHistoricalFacts frame = new JHistoricalFacts();
        frame.setVisible(true);
    }
}
