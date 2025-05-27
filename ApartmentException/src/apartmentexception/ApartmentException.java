/* Filename ApartmentException.java
 * Written by Thando Ngwenya pg 660
 * Written on 8/01/2021
 * Description : This class is an ApartmentException class that has a constructor which receives a String that 
        holds a street address, an apartment number, number of bedrooms and the rent value of the apartment.
        Works as intended */
package apartmentexception;
public class ApartmentException extends Exception
{
    public ApartmentException(String apartmentNum) 
    {
        super("The apartment number can only be 3 digits");
    }
    public ApartmentException(int numBedrooms) 
    {
        super("The number of bedrooms cannot be less than 1 or greater than 4");
    }
    public ApartmentException(double rentVal) 
    {
        super("The rent cannot be less than R9k or over R45k");
    }
}