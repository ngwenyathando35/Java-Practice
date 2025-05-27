/* Filename Apartment.java
 * Written by Thando Ngwenya pg 660
 * Written on 08/01/2020
 * Description : This is class with data fields. The constructor requires values for each field. The class 
        might throw an ApartmentException if the apartment number does not consist of three digits, or if the 
        number of bedrooms is less than 1 or more than 4, or if the rent is less than $500 or over $2,500. Works
        as intended.*/
package apartmentexception;
public class Apartment 
{
    private final String address, apartmentNum;
    private final int MAX_ROOM_NUMBER_LENGTH = 3, MAX_NUM_OF_BEDROOM = 4, MIN_NUM_OF_BEDROOMS = 1;
    private final int numBedrooms;
    private final double rentVal, MAX_RENT  = 45000, MIN_RENT  = 9000;
    public Apartment(String address,String apartmentNum,int numBedrooms, double rentVal) throws ApartmentException
    {
        this.address = address;
        this.apartmentNum = apartmentNum;
        this.numBedrooms = numBedrooms;
        this.rentVal = rentVal;
        if(apartmentNum.length() > MAX_ROOM_NUMBER_LENGTH)
            throw (new ApartmentException(apartmentNum));
        if(numBedrooms > MAX_NUM_OF_BEDROOM || numBedrooms < MIN_NUM_OF_BEDROOMS )
            throw (new ApartmentException(numBedrooms));
        if(rentVal > MAX_RENT || rentVal < MIN_RENT)
            throw (new ApartmentException(rentVal));
    }
}