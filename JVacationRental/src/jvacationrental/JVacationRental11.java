/* Introduction to Swing Components : Learning About Event-Driven Programming
 * Filename    : JVacationRental.java pg 786
 * Written by  : Thando Ngwenya
 * Written on  : 20 March 2021
 * Description : This program is made for Lambert’s Vacation Rentals. It has three separate ButtonGroups to allow a client to select one of three 
        locations, the number of bedrooms, and whether meals are included in the rental. The location that is parkside for costs $600 per week, poolside
        is $750 per week, or lakeside which is $825 per week. Rentals can have one, two, or three bedrooms and that each bedroom over one adds $75 to the
        base price. When meals are added, the price is $200 more per rental.
*/                                                                                                                               
package jvacationrental;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
public class JVacationRental11 extends JFrame implements ActionListener, ItemListener
{
    final int BASE_PRICE = 600;
    final int POOLSIDE_PRICE = BASE_PRICE + 150;
    final int LAKESIDE_PRICE = BASE_PRICE + 225;
    final int BEDROOM_PRICE = 75;
    final int MEALS = 200;
    
    String[] numBedrooms = {"1","2","3"};
    JLabel lblGreeting = new JLabel("Welcome to Lambert's Vacation Rentals");
    JLabel lblLocation = new JLabel("In which location would you like to rent");
    ButtonGroup locations = new ButtonGroup();
    JCheckBox parkside = new JCheckBox("Parkside", false);
    JCheckBox poolside = new JCheckBox("Poolside", false);
    JCheckBox lakeside = new JCheckBox("Lakeside", false);
    JComboBox bedrooms = new JComboBox(numBedrooms);
    int totalPrice = BASE_PRICE;
    
    //public JVacationRental()
    {
      //  super("JVacation Rental");
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(lblGreeting);
        add(lblLocation);
        locations.add(parkside);
        locations.add(poolside);
        locations.add(lakeside);
        add(bedrooms);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) 
    {
        //JVacationRental frame = new JVacationRental();
        //frame.setVisible(true);
    }
}