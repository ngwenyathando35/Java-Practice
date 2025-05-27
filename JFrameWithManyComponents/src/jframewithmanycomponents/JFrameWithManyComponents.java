/* Introduction to Swing Components 
 * Filename    : JFrameWithManyComponents.java pg 725
 * Written by  : The Textbook
 * Written on  : 14 March 2021
 * Description : Demonstrating Adding JTextFields, JButtons, and Tool Tips to a JFrame - This program extends JFrame and holds several components. As the
        components (two JLabels, a JTextField, and a JButton) are added to the JFrame, they are placed from left to right in horizontal rows across the 
        JFrame’s surface. 
*/
package jframewithmanycomponents;
import javax.swing.*;
import java.awt.*;
public class JFrameWithManyComponents extends JFrame
{
    final int FRAME_WIDTH = 300;
    final int FRAME_HEIGHT = 150;
    public JFrameWithManyComponents()
    {
        super("Demonstrating many components");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel heading = new JLabel("This frame has many components");
        heading.setFont(new Font("Arial", Font.BOLD, 16));
        JLabel namePrompt = new JLabel("Enter your name:");
        JTextField nameField = new JTextField(12);
        JButton button = new JButton("Click to continue");
        button.setToolTipText("Click this button");
        setLayout(new FlowLayout());
        add(heading);
        add(namePrompt);
        add(nameField);
        add(button);
    }
}