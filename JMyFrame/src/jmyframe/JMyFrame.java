/* Introduction to Swing Components
 * Filename    : JMyFrame.java pg 746
 * Written by  : The Textbook
 * Written on  : 12 March 2021
 * Description : Demonstrating Extending the JFrame Class: This program extends JFrame. Within the JMyFrame constructor, the super() JFrame constructor 
        is called; it accepts a String argument to use as the JFrame’s title. (Alternatively, the setTitle() method could have been used.) The JMyFrame 
        constructor also sets the size, visibility, and default close operation for every JMyFrame. Each of the methods—setSize(), setVisible(), and 
        setDefaultCloseOperation()—appears in the constructor without an object, because the object is the current JMyFrame being constructed. Each of
        the three methods could be preceded with a this reference with exactly the same meaning. That is, within the JMyFrame constructor, the following 
        two statements have identical meanings:     setSize(WIDTH, HEIGHT);   this.setSize(WIDTH, HEIGHT);
        Each statement sets the size of “this” current JMyFrame instance. Works as intended */
package jmyframe;
import javax.swing.*;
public class JMyFrame extends JFrame
{
    final int WIDTH = 200;
    final int HEIGHT = 120;
    public JMyFrame()
    {
        super("My frame");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/* The advantage of creating a child class of JFrame is that the JFrame’s properties can be set 
        within the object’s constructor; then, when the JFrame's child objects are created, it is automatically endowed with the features that have been
        specified, such as title, size, and default close operation       */
    }
}