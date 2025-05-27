/* NB: This program is not complete but it compiles successfully
 * Filename TestWedding.java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : This class creates two Wedding objects and in turn passes each to a method that displays all 
    the details. */
package person;
import java.time.LocalDate;
import person.Wedding;
import person.Couple;
public class TestWedding 
{
    public static void main(String[] args) 
    {
        String bride = "Thando", groom = "Phillip", location = "RietVallei";
        LocalDate weddingDate = LocalDate.of(2020,04,27);
        Wedding event = new Wedding(bride, groom, location);
        System.out.println("The Bride's name is " + bride + " and the grooms name is " + groom + ".");
    }
}