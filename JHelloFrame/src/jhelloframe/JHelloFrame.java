/* Introduction to Swing Components : Learning About Event-Driven Programming
 * Filename    : JHelloFrame.java pg 75
 * Written by  : The Textbook
 * Written on  : 15 March 2021
 * Description : Demonstrating Event Driven Programming; Preparing A Class to Accept Event Messages; Telling the Class to Expect Events to happen; 
        Telling the Class How To Respond To Events; An Event Driven Program - This program has a JFrame that reacts to a button click. The class contains
        a JLabel that prompts the user for a name, a JTextField into which the user can type a response, a JButton to click, and a second JLabel that 
        displays the name entered by the user. 
*/
package jhelloframe;
import javax.swing.*;
import java.awt.*;
//The following line imports the event package
import java.awt.event.*;
//The event listener is implemented
public class JHelloFrame extends JFrame implements ActionListener
{
    JLabel question = new JLabel("What is your name?");
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    JTextField answer = new JTextField(10);
    JButton pressMe = new JButton("Press me");
    JLabel greeting = new JLabel("");
    final int WIDTH = 275;
    final int HEIGHT = 225;
    public JHelloFrame()
    {
        super("Hello Frame");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        question.setFont(bigFont);
        greeting.setFont(bigFont);
        add(question);
        add(answer);
        add(pressMe);
        add(greeting);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // The frame is registered as a listener for button clicks 
        pressMe.addActionListener(this);
    }
    //The method that executes when the button is clicked.
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //The String that a user has typed into the JTextField is retrieved and stored in the name variable and then used in the text of a second JLabel
        String name = answer.getText();
        String greet = "Hello, " + name;
        greeting.setText(greet);
    }
}