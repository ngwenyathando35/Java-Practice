/* Introduction to Swing Components : Learning About Event-Driven Programming
 * Filename    : CheckBoxDemonstration.java pg 776
 * Written by  : The Textbook ft Thando
 * Written on  : 17 March 2021
 * Description : Demonstrating Including JCheckBoxes in an Application - This is an interactive program for a resort. The base price for a room is $200, 
        and a guest can choose from several options. Reserving a room for a weekend night adds $100 to the price, including breakfast adds $20, including
        a round of golf adds $75. A guest can select none, some, or all of these premium additions. Each time the user changes the option package, the 
        price is recalculated. Works as intended */
package jresortcalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JResortCalculator extends JFrame implements ItemListener
{
    final int BASE_PRICE = 200;
    final int WEEKEND_PREMIUM = 100;
    final int BREAKFAST_PREMIUM = 20;
    final int GOLF_PREMIUM = 75;
    int totalPrice = BASE_PRICE;
    
    JCheckBox weekendBox = new JCheckBox("Weekend premium $" + WEEKEND_PREMIUM, false);
    JCheckBox breakfastBox = new JCheckBox("Breakfast $" + BREAKFAST_PREMIUM, false);
    JCheckBox golfBox = new JCheckBox("Golf $" + GOLF_PREMIUM, false);
    JLabel resortLabel = new JLabel("Resort Price Calculator");
    JLabel priceLabel = new JLabel("The price for your stay is");
    JTextField totPrice = new JTextField(4);
    JLabel optionExplainLabel = new JLabel("Base price for a room is $" + BASE_PRICE + ".");
    JLabel optionExplainLabel2 = new JLabel("Check the options you want.");
    
    public JResortCalculator()
    {
        super("Resort Price Estimator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(resortLabel);
        add(optionExplainLabel);
        add(optionExplainLabel2);
        add(weekendBox);
        add(breakfastBox);
        add(golfBox);
        add(priceLabel);
        add(totPrice);
        totPrice.setText("$" + totalPrice);
        weekendBox.addItemListener(this);
        breakfastBox.addItemListener(this);
        golfBox.addItemListener(this);
    }
    @Override
    public void itemStateChanged(ItemEvent event) 
    {
        Object source = event.getSource();
        int select = event.getStateChange();
        if(source == weekendBox)
            if(select == ItemEvent.SELECTED)
                totalPrice += WEEKEND_PREMIUM;
            else
                totalPrice -= WEEKEND_PREMIUM;
            else if(source == breakfastBox)
            {
                if(select == ItemEvent.SELECTED)
                    totalPrice += BREAKFAST_PREMIUM;
                else
                    totalPrice -= BREAKFAST_PREMIUM;
            }
        else // if(source == golfBox) by default
        if(select == ItemEvent.SELECTED)
            totalPrice += GOLF_PREMIUM;
        else
            totalPrice -= GOLF_PREMIUM;
        totPrice.setText("$" + totalPrice);
    }
    public static void main(String[] args) 
    {
        JResortCalculator aFrame = new JResortCalculator();
        final int WIDTH = 300;
        final int HEIGHT = 200;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }
}