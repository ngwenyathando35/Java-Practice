/*
 * Filename Life.java
 * Written by Thando Ngwenya
 * Written on 22Sep2020
 * Description : This is a child class of Insurance. The constructor does not require any arguments. It has a 
        setCost() method that sets the monthly fee to R648, 
 */
package insurance;
public class Life extends Insurance
{
    public Life()
    {
        super("Life Insurance");
    }
    @Override
    public void setCost() 
    {
        price = 648;
    }
    @Override
    public void display() 
    {
        System.out.println("This is " + getTypeOfInsurance()
                + "\nIt will cost you R" + getCostOfInsurance());
    }
}