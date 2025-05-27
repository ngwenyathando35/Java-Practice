/* Introduction to Swing Components : Learning About Event-Driven Programming
 * Filename    : CreateJFrameWithComponents.java pg 754
 * Written by  : The Textbook ft Thando
 * Written on  : 17 March 2021
 * Description : Demonstrating Adding Components to a JFrame : This class instantiates a JFrameWithManyComponents object
*/
package jframewithcomponents;
import javax.swing.JFrame;
public class CreateJFrameWithComponents 
{
    public static void main(String[] args)
    {
        JFrameWithComponents frame = new JFrameWithComponents();
        frame.setSize(250,250);
        frame.setVisible(true);
    }
}