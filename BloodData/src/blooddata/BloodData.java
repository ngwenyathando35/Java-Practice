/*
 * Filename BloodData.java
 * Written by Thando Ngwenya
 * Written on 19/04/2020
 * Description : Class that has set and get methods, overloaded constructor for the TestBloodClass 
 */
package blooddata;
public class BloodData 
{
    private String bloodType;
    private char rhFactor;
    public void setBloodType(String bt)
    {
        bloodType = bt;
    }
    public String getBloodType()
    {
        return bloodType;
    }
    public void setRhFactor(char rh)
    {
        rhFactor = rh;
    }
    public char getRhFactor()
    {
        return rhFactor;
    }
    public BloodData()
    {
        bloodType = "O";
        rhFactor = '+';
    }
    public BloodData(String bt, char rh)
    {
        //The hash code problem might be here
        bloodType = bt;
        rhFactor = rh;
    }
}