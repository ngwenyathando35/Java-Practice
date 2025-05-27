/*
 * Filename NewspaperSubscription.java
 * Written by Thando Ngwenya
 * Written on 15Sep2020
 * Description : This is an abstract class named NewspaperSubscription with fields for the subscriber name, 
        address, and rate. It includes get and set methods for the name field and get methods for the address 
        and subscription rate; the setAddress() method is abstract. Works as intended.*/
package newspapersubscription;
public abstract class NewspaperSubscription 
{
    private String name;
    protected String address;
    protected double rate;
    public void setName(String igama)
    {
        name = igama;
    }
    public abstract void setAddress(String residence);
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public double getRate()
    {
        return rate;
    }
}