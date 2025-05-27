/*
 * Filename Health.java
 * Written by Thando Ngwenya
 * Written on 22Sep2020
 * Description : This is a child class of Insurance. The constructor does not require any arguments. It has a 
        setCost() method that sets the monthly fee to R3528.
 */
package insurance;
public class Health extends Insurance
{
    public Health() 
    {
        super("Health Insurance");
    }
    @Override
    public void setCost() 
    {
        price = 3528;
    }
    @Override
    public void display() 
    {
        System.out.println("This is " + getTypeOfInsurance() + " Insurance\n"
                + "It will cost you R" + getCostOfInsurance());
    }
}