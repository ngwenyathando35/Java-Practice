/*
 * Filename UsedCar.java
 * Written by Thando Ngwenya pg 660
 * Written on 11Jan2021
 * Description : This class has fields for Vehicle Identification Number (VIN), make, year, mileage, and price. 
        The constructor throws a UsedCarException when the VIN is not four digits; when the make is not Ford, 
        Honda, Toyota, Chrysler, or Other; when the year is not between 1990 and 2014 inclusive; or either the
        mileage or price is negative. */
package usedcarexception;
public class UsedCar
{
    private String vin, make;
    private int year, vinLength = 4;
    private long mileage, price;
    public UsedCar(String vin, String make, int year, long mileage, long price) throws UsedCarException
    {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.mileage = mileage;
        this.price = price;
        if(vin.length() != vinLength)
            throw (new UsedCarException());
        if(!(1990 >= year && year <= 2014))
                throw (new UsedCarException());
        if(mileage < 0 || price < 0)
                throw (new UsedCarException());
        switch(make)
        {
            case "Honda":;
            case "Ford":;
            case "Toyota":;
            case "Chrysler":;
            case "Other":;
            default:
                throw (new UsedCarException());
        }
    }
    public static int display(UsedCar car, int count) 
    {
        System.out.println("It should be displayed");
        System.out.println("Car " + count + "\nVIN    : " + car.vin + "\nMake   : " + car.make + 
                "\nYear   : " + car.year + "\nMileage: " + car.mileage + 
                "\nPrice  : " + car.price);
        count++;
        return count;
    }
}