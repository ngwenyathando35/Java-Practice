/* Filename DemoVehicles.java
 * Written by Thando Ngwenya
 * Written on 07/08/2020
 * Description : This is a program that instantiates concrete objects from each of the two child classes were 
        created. Works as intended*/
package vehicle;
import javax.swing.*;
public class DemoVehicles
{
    //public static void main(String[] args)
    {
        SailBoat aBoat = new SailBoat();
        Bicycle aBike = new Bicycle();
        JOptionPane.showMessageDialog(null, "\nVehicle descriptions:\n" + 
                aBoat.toString() + "\n" + aBike.toString());
        
    }
}