/* Filename Thando.java
 * Written by Thando Ngwenya
 * Written on 27/04/2020
 * Description : The that holds the two String objects for the person’s first and last name and a LocalDate 
    object for the person’s birthdate. */
package person;
import java.time.LocalDate;
public class Person 
{
    private String name, surname;
    private LocalDate birthDate;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setSername(String surname)
    {
        this.surname = surname;
    }
    public String getSurname()
    {
        return surname;
    }
    public void setDate(LocalDate date)
    {
        birthDate = date;
    }
    public Person(String name, String surname, LocalDate birthDate)
    {}
}
