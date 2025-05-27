/* Filename Bicycle.java
 * Written by Thando Ngwenya
 * Written on 07Sep2020
 * Description : This class instantiates objects from the abstract class Vehicle. It inherits the fields 
 */
package vehicle;
import javax.swing.*;
public class Bicycle extends Vehicle
{
    public Bicycle()
    {
        super("a person", 2);
    }
    @Override
    public void setPrice()
    {
        String entry;
        final int MAX = 4000;
        entry = JOptionPane.showInputDialog(null, "Enter bicycle price ");
        price = Integer.parseInt(entry);
        if(price > MAX)
            price = MAX;
    }
    @Override
    public String toString()
    {
        return("The bicycle is powered by " + getPowerSource() +
        "; it has " + getWheels() + " wheels and costs $" + getPrice());
    }
}