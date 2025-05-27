/* Filename ThrowApartmentException.java
 * Written by Thando Ngwenya
 * Written on 09/04/2021
 * Description : This application establishes an array of four Apartment objects with valid and invalid values. 
        It then goes on to display an appropriate message when an Apartment object is created successfully and 
        when one is not. Works as intended but to see for yourself you have to change each incorrect exception*/
package apartmentexception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThrowApartmentException 
{
    public static void main(String[] args) 
    {
        Apartment flats[] = new Apartment[5];
        try 
        {
            flats[0] = new Apartment("16 Pela Street Emndeni","125", 2, 15000);
            System.out.println("First Entry created sucessfully");
            flats[1] = new Apartment("32 Zici street Zola","1254", 3, 11111);
            System.out.println("Second Entry created sucessfully");
            flats[2] = new Apartment("466 Neslson Mandela Square Sandton s ","365", 2, 46000);
            System.out.println("Third Entry created sucessfully");
            flats[3] = new Apartment("32 Archose Melville","010", 0, 23000);
            System.out.println("Fourth Entry created sucessfully");
            flats[4] = new Apartment("32 Archose Melville","125", 2, 10000);
            System.out.println("Fifth Entry created sucessfully");
        } 
        catch (ApartmentException ex) 
        {
            Logger.getLogger(ThrowApartmentException.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}