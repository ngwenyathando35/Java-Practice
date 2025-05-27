/*
 * Filename Apartment.java
 * Written by Thando Ngwenya
 * Written on 08/05/2020
 * Description : This holds an apartment number, number of bedrooms, number of baths, and rent amount. It has a 
    constructor that accepts values for each data field. It also has get methods for each field. 

 */
package apartment;
public class Apartment 
{
    private int apartmentNum, numOfBedrooms, numOfBaths, rent;
    public Apartment(int apartmentNum, int numOfBedrooms, int numOfBaths, int rent)
    {
        this.apartmentNum = apartmentNum;
        this.numOfBaths = numOfBaths;
        this.numOfBedrooms= numOfBedrooms;
        this.rent = rent;
    }
    public int getApartmentNum()
    {
        return apartmentNum;
    }
    public int getnumOfBedrooms()
    {
        return numOfBedrooms;
    }
    public int getNumOfBaths()
    {
        return numOfBaths;
    }
    public int getRent()
    {
        return rent;
    }
}