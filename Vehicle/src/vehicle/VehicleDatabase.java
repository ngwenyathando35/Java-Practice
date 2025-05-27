/* Filename VehicleDatabase.java
 * Written by Thando Ngwenya
 * Written on 07Sep2020
 * Description : This program creates an array of Vehicle references. It assigns Sailboat objects and Bicycle 
        objects to the same array. Then, because the different object types are stored in the same array, a for 
        loop is created to manipulate them by easily; Works as intended*/
package vehicle;
import javax.swing.*;
public class VehicleDatabase
{
    //public static void main(String[] args)
    {
        Vehicle[] vehicles = new Vehicle[5];
        int x;
        for(x = 0; x < vehicles.length; ++x)
        {
            String userEntry;
            int vehicleType;
            userEntry = JOptionPane.showInputDialog(null,"Please select the type of\n " +
        "vehicle you want to enter: \n1 - Sailboat\n" +"2 - Bicycle");
        vehicleType = Integer.parseInt(userEntry);
        if(vehicleType == 1)
            vehicles[x] = new SailBoat();
        else
            vehicles[x] = new Bicycle();
        }
        StringBuffer outString = new StringBuffer();
        for(x = 0; x < vehicles.length; ++x)
        {
            outString.append("\n#" + (x + 1) + " ");
            outString.append(vehicles[x].toString());
        }
        JOptionPane.showMessageDialog(null,"Our available Vehicles include:\n" + outString);
    }
}