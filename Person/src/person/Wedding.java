package person;
import java.time.LocalDate;
import person.Couple;
/* Filename Wedding.java
 * Written by Thando Ngwenya
 * Written on 27/04/2020
 * Description :  This class is for a wedding planner. It includes the date of the wedding, the names of the 
    Couple being married, and a String for the location. It has constructors that accept parameters for each 
    field, and it provides get methods for each field. 
*/
public class Wedding 
{
    private String bride, groom, location;
    private LocalDate weddingDate ;
    public void setBride(String name)
    {
        bride = name;
    }
    public String getBride()
    {
        return bride;
    }
    public void setGroom(String name)
    {
        groom = name; 
    }
    public String getGroom()
    {
        return groom;
    }
    public void setLocation(String location)
    {
        this.location = location;
    }
    public String getLocation()
    {
        return location;
    }
    public void setWeddingDate(LocalDate weddingDate)
    {
        this.weddingDate = weddingDate;
    }
    public LocalDate getWeddingDate()
    {
        return weddingDate;
    }
    public Wedding(String bride, String groom, String location)
    {
        
    }
}