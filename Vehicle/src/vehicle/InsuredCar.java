/* Filename InsuredCar.java
 * Written by The textbook pg 572
 * Written on 09Sep2020
 * Description : This class inherits and implements the the Insured class. It has a constructor that calls the 
        Vehicle superclass constructor, passing arguments for the InsuredCar’s power source and number of wheels
        
 */
package vehicle;
import javax.swing.*;
public class InsuredCar extends Vehicle implements Insured
{
    private int coverage;
    public InsuredCar()
    {
        super("gas", 4);
        setCoverage();
    }
    @Override
    /*The setPrice() method is mplemented as required by the Vehicle class. The method accepts the car’s price 
      from the user and enforces a maximum value of $60,000.*/
    public void setPrice() 
    {
        String entry;
        final int MAX = 60000;
        entry = JOptionPane.showInputDialog(null, "Enter car price ");
        price = Integer.parseInt(entry);
        if(price > MAX)
            price = MAX;
    }
    @Override
    /*The setCoverage() and getCoverage() methods are implemented as required by the Insured class. The 
      setCoverage() method sets the coverage value for an insured car to 90 percent of the car’s price*/
    public void setCoverage() 
    {
        coverage = (int)(price * 0.9);
    }
    @Override
    public int getCoverage() 
    {
        return coverage;
    }
    public String toString()
    {
        return("The insured car is powered by " + getPowerSource() + "; it has " + getWheels() 
                + " wheels, costs $" + getPrice() + " and is insured for $" + getCoverage());
    }
}