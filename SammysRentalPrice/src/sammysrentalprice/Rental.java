package sammysrentalprice;
/* Filename Rental.java
 * Written by Thando Ngwenya
 * Written on 29/04/2020
 * Description :  */
public class Rental 
{
    public final static int MINUTES_IN_HOUR = 60;
    public final static int HOUR_RATE = 40;
    private String contractNumber;
    private int hours;
    private int minutesRented;
    private int price, minutes;;
    public void setContractNumber(String contractNum)
    {
        contractNumber = contractNum;
    }
    public void setHoursAndMinutes(int numberOfHoursForRental)
    {
        int minutes;
        final int MINUTE_RATE = 1;
        hours = minutesRented / MINUTES_IN_HOUR;
        minutes = minutesRented % MINUTES_IN_HOUR;
        price = (hours * HOUR_RATE) + (minutes * MINUTE_RATE);
    }
    public int getHoursAndRentals()
    {
        return minutes;
    }
    public String getContractNumber()
    {
        return contractNumber;
    }
    public int getHours()
    {
        return minutes;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public int getPrice()
    {
        return price;
    }
}