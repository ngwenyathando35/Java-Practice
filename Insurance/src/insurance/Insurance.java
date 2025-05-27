/*
 * Filename Insurance.java
 * Written by Thando Ngwenya
 * Written on 22Sep2020
 * Description : This is an abstract class. It contains a String representing the type of insurance and a double 
        that holds the monthly price. The constructor requires a String argument indicating the type of 
        insurance. It contains a get method for each field; it also contains two abstract methods named 
        setCost() and display().
 */
package insurance;
public abstract class Insurance 
{
    protected String typeOfInsurance;
    protected double price;
    public Insurance(String typeInsurance)
    {
        typeOfInsurance = typeInsurance;
    }
    public String getTypeOfInsurance()
    {
        return typeOfInsurance;
    }
    public double getCostOfInsurance()
    {
        return price;
    }
    public abstract void setCost();
    public abstract void display();
}