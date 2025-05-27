/* Filename Person.java
 * Written by Thando Ngwenya
 * Written on 29/08/2020
 * Description : This is a parent Person class that contains a first name, last name, street address, zip code, 
        and phone number. The class also includes a method that sets each data field, using a series of dialog 
        boxes and a display method that displays all of a Person’s information on a single line at the command 
        line on the screen. Works as intended.
 */
package collegelist;
import javax.swing.JOptionPane;
public class Person 
{
    private String fname, lname, address, number;
    private int zipCode;
    public void setName()
    {
        fname = JOptionPane.showInputDialog("Person","Please enter your name");
    }
    public void setSurname()
    {
        lname = JOptionPane.showInputDialog("Person","Please enter your surname");
    }
    public void setAddress()
    {
        address = JOptionPane.showInputDialog("Person","Please enter your street address");
    }
    public void setZipCode()
    {
        zipCode = Integer.parseInt(JOptionPane.showInputDialog("Person","Please enter your zip code"));
    }
    public void setCellNumber()
    {
        number = JOptionPane.showInputDialog("Person","Please enter your cell number");
    }
    public void display()
    {
        System.out.println("**************************************************************************\n"
                + "Person Details\n"
                + "Name : " + fname
                + "\nSurname : " + lname
                + "\nStreet Address : " + address
                + "\nZip code : " + zipCode
                + "\nCell number : " + number);
    }
}