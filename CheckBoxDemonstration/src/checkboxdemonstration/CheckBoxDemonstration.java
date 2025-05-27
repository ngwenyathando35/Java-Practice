/* Introduction to Swing Components : Learning About Event-Driven Programming
 * Filename    : CheckBoxDemonstration.java pg 768
 * Written by  : The Textbook
 * Written on  : 17 March 2021
 * Description : Demonstrating The JCheckbox Class - This program uses four JCheckBox objects
*/
package checkboxdemonstration;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CheckBoxDemonstration extends JFrame implements ItemListener
{
    FlowLayout flow = new FlowLayout();
    JLabel label = new JLabel("What would you like to drink?");
    JLabel lbl1 = new JLabel("");
    JLabel lbl2 = new JLabel("");
    JLabel lbl3 = new JLabel("");
    JLabel lbl4 = new JLabel("");
    JCheckBox coffee = new JCheckBox("Coffee", false);
    JCheckBox cola = new JCheckBox("Cola", false);
    JCheckBox milk = new JCheckBox("Milk", false);
    JCheckBox water = new JCheckBox("Water", false);
    public CheckBoxDemonstration()
    {
        super("CheckBox Demonstration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        label.setFont(new Font("Arial", Font.ITALIC, 22));
        coffee.addItemListener(this);
        cola.addItemListener(this);
        milk.addItemListener(this);
        water.addItemListener(this);
        add(label);
        add(coffee);
        add(cola);
        add(milk);
        add(water);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
    }
    @Override
    public void itemStateChanged(ItemEvent check)
    {
        Object source  = check.getItem();
        if(source == coffee)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                lbl1.setText("You will have Coffee");
            else
                lbl1.setText("");
        }
        else if(source == water)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                lbl2.setText("You will have Water");
            else
                lbl2.setText("");
        }
        else if(source == cola)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                lbl3.setText("You will have Cola");
            else
                lbl3.setText("");
        }
        else
            {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                lbl4.setText("You will have Milk");
            else
                lbl4.setText("");
        }
    }
    public static void main(String[] arguments)
    {
        final int FRAME_WIDTH = 350;
        final int FRAME_HEIGHT = 120;
        CheckBoxDemonstration frame = new CheckBoxDemonstration();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setVisible(true);
    }
}