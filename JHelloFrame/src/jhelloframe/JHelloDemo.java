/* Introduction to Swing Components : Learning About Event-Driven Programming
 * Filename    : JHelloDemo.java pg 75
 * Written by  : The Textbook
 * Written on  : 15 March 2021
 * Description : Demonstrating Event Driven Programming; Preparing A Class to Accept Event Messages; Telling the class to expect
evnts to happen;Telling the class how to respond to Events; An event Driven Program -  Figure 14-27 shows an application that instantiates a
JHelloFrame object and makes it visible
*/
package jhelloframe;
public class JHelloDemo 
{
    public static void main(String[] args)
    {
        JHelloFrame frame = new JHelloFrame();
        frame.setVisible(true);
    }
}
