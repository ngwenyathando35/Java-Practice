/* Filename SailBoat.java
 * Written by Thando Ngwenya
 * Written on 07Sep2020
 * Description : This is a Sailboat class that extends the Vehicle class. This new class is concrete; that is, 
        you can create actual Sailboat class objects.
 */
package vehicle;
import javax.swing.*;
public class SailBoat extends Vehicle
{    
    private int length;
    public SailBoat()
    {
        super("wind", 0);
        setLength();
    }
    public void setLength()
    {
        String entry;
        entry = JOptionPane.showInputDialog(null, "Enter sailboat length in feet ");
        length = Integer.parseInt(entry);
    }
    public int getLength()
    {
        return length;
    }
    @Override
    public void setPrice()
    {
        String entry;
        final int MAX = 100000;
        entry = JOptionPane.showInputDialog(null, "Enter sailboat price ");
        price = Integer.parseInt(entry);
        if(price > MAX)
            price = MAX;
    }
    @Override
    public String toString()
    {
        return("The " + getLength() +    " foot sailboat is powered by " +
        getPowerSource() + ". I+"
                + " has " + getWheels() + " wheels and costs $" + getPrice());
    }
}