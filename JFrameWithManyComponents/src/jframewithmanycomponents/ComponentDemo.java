/* Introduction to Swing Components
 * Filename    : ComponentDemo.java pg 725
 * Written by  : The Textbook
 * Written on  : 14 March 2021
 * Description : Demonstrating Adding JTextFields, JButtons, and Tool Tips to a JFrame - This program instantiates an instance of the JFrame.
*/
package jframewithmanycomponents;
public class ComponentDemo
{
    public static void main(String[] args)
    {
        JFrameWithManyComponents frame = new JFrameWithManyComponents();
        frame.setVisible(true);
     /* The advantage of creating a child class of JFrame is that the JFrame’s properties can be set within the object’s constructor; then, when the 
        JFrame's child objects are created, they are automatically endowed with the features that have been specified, such as title, size, and default 
        close operation       */
    }
}