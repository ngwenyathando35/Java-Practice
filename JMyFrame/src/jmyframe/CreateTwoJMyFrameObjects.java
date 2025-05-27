/* Introduction to Swing Components
 * Filename    : CreateTwoJMyFrameObjects.java pg 746
 * Written by  : The Textbook
 * Written on  : 12 March 2021
 * Description : Demonstrating Extending the JFrame Class: This program declares two JMyFrame objects. Each has the same set of attributes, determined by
        the JMyFrame constructor. Works as intended*/
package jmyframe;
public class CreateTwoJMyFrameObjects
{
    public static void main(String[] args)
    {
        JMyFrame myFrame = new JMyFrame();
        JMyFrame mySecondFrame = new JMyFrame();
     /* When the program is executed, the two JMyFrame objects are displayed with the second one on top of, or obscuring the first. The setBounds() method
        can be used with one of the JMyFrame objects that produces the output so that one the JMyFrame object can be moved to view the other. */
    }
}