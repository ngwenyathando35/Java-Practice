/* Filename Vehicle.java
 * Written by Thando Ngwenya
 * Written on 28/07/2020
 * Description : This is an abstract Vehicle class. It includes fields for the power source, the number of 
        wheels, and the price. Vehicle is an abstract class; there will never be a “plain” Vehicle object.
        The class works as intended.*/
package com.vehiclewesell.vehiclePackage;
public abstract class Vehicle 
{
    private String powerSource;
    private int wheels;
    protected int price;
    public Vehicle(String powerSource, int wheels)
    {
        setPowerSource(powerSource);
        setWheels(wheels);
        setPrice();
    }
    public String getPowerSource()
    {
        return powerSource;
    }
    public int getWheels()
    {
        return wheels;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPowerSource(String source)
    {
        powerSource = source;
    }
    public void setWheels(int wls)
    {
        wheels = wls;
    }
    public abstract void setPrice();
}