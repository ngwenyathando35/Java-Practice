/* Filename Horse.java
 * Written by Thando Ngwenya
 * Written on 18/08/2020
 * Description : Demonstrating Inheritance.This class is a parent class that contains data fields for the name, 
                 color, and birth year of a Horse. It includes get and set methods for these fields.
                 Works as intended */
package horse;
public class Horse 
{
    private String name;
    private String color;
    private int birthYear;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setColor(String colour)
    {
        color = colour;
    }
    public String getColor()
    {
        return color;
    }
    public void setBirthYear(int year)
    {
        birthYear = year;
    }
    public int getBirthYear()
    {
        return birthYear;
    }
}