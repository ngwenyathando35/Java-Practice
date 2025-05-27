/* Filename Automobile.java
 * Written by Thando Ngwenya
 * Written on 08/05/2020
 * Description : This class includes fields for an ID number, make, model, color, year, and metres per litre. 
    It includes get and set methods for each field.It also includes a constructor that accepts arguments for 
    each field value and uses the set methods to assign the values.
 */
package automobile;

import java.util.Scanner;

public class Automobile 
{
    private String  make, model, color;
    private int year, metresPerLitre,idNumber;
    public void setIdNumber(int idNum)
    {
        final int ID_MINIMUM_LIMIT = 0;
        final int ID_MAXIMUM_VALUE = 9999;
        if(idNum < ID_MINIMUM_LIMIT || idNum > ID_MAXIMUM_VALUE)
        {
            idNum = 0;
        } 
        else 
            idNumber = idNum;
    }
    public int getIdNumber()
    {
        return idNumber;
    }
    public void setMake(String make)
    {
        this.make = make;
    }
    public String getMake()
    {
        return make;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public String getModel()
    {
        return model;
    }
    public void setColor(String colour)
    {
        color = colour;
    }
    public String getColor()
    {
        return color;
    }
    public void setYear(int year)
    {
        final int MIN_YEAR = 2000;
        final int MAX_YEAR = 2017;
        if(year < MIN_YEAR || year > MAX_YEAR)
        {
            System.out.println("Error\nPlease enter a year that is in between 2000 and 2017 inclusive");
            Scanner input = new Scanner(System.in);
            year = input.nextInt();
        }
        this.year = year;
    }
    public int getYear()
    {
        return year;
    }
    public void setMetresPerLitre(int metresPerLitre)
    {
        if(metresPerLitre < 10 || metresPerLitre > 60) 
        {
            System.out.println("Your value does not match our criteria therefore it will be set to 0");
            metresPerLitre = 0;
        }
        this.metresPerLitre = metresPerLitre;
    }
    public int getMetresPerLitre()
    {
        return metresPerLitre;
    }
    public Automobile(int idNumber, String make, String model, String color, int year, int metresPerLitre)
    {
        setIdNumber(idNumber);
        setMake(make);
        setModel(model);
        setColor(color);
        setYear(year);
        setMetresPerLitre(metresPerLitre);
    }
}