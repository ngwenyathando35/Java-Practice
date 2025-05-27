/*
 * Filename Building.java
 * Written by Thando Ngwenya
 * Written on Heritage Day 2020
 * Description : This is a base class. It has two fields named squareFeet and storeys. It has set and get methods 
        for both fields.
 */
package building;
public class Building 
{
    private int storeys;
    private int squareFeet;
    public void setStoreys(int storey)
    {
        storeys = storey;
    }
    public void setSquareFeet(int squareFoot)
    {
        squareFeet = squareFoot;
    }
    public int getStoreys()
    {
        return storeys;
    }
    public int getSquareFeet()
    {
        return squareFeet;
    }
}