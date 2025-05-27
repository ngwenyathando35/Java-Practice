/*
 * Filename Home.java
 * Written by Thando Ngwenya
 * Written on Heritage Day 2020
 * Description : This is a child class that has two fields that represent the number of bathrooms and bedrooms. It has set and get methods for 
        all the fields. 
 */
package building;
public class Home extends Building
{
    private int numBedrooms;
    private int numBathrooms;
    public void setNumBedrooms(int numberofRooms)
    {
        numBedrooms = numberofRooms;
    }
    public int getNumBedrooms()
    {
        return numBedrooms;
    }
    public void setNumBathrooms(int numberofRooms)
    {
        numBathrooms = numberofRooms;
    }
    public int getBathrooms()
    {
        return numBathrooms;
    }
}