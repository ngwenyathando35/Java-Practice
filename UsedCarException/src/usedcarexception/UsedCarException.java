/*
 * Filename UsedCarException.java
 * Written by Thando Ngwenya
 * Written on 11/01/2021
 * Description : Exception Handling : This class extends Exception; its constructor receives a value for a vehicle
        identification number (VIN) that is passed to the parent constructor so it can be used in a getMessage() 
        call */
package usedcarexception;
public class UsedCarException extends Exception
{
    public UsedCarException()
    {
        super("VIN(Vehicle Identification Number)");
    }
}