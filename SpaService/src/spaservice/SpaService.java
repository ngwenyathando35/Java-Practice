package spaservice;
/*
 * Filename SpaService.java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : Creating a class that has instance fields and methods
 */
public class SpaService 
{
    //These are the class' data fields
    private String serviceDescription;
    private double price;
    //Default constructor and setting default values
    public SpaService()
    {
        serviceDescription = "XXX";
        price = 0;
    }
    //Methods that set the field values
    public void setServiceDescription(String service)
    {
        serviceDescription = service;
    }
    public void setPrice(double pr)
    {
        price = pr;
    }
    //Methods that get the field values
    public String getServiceDescription()
    {
        return serviceDescription;
    }
    public double getPrice()
    {
        return price;
    }
}