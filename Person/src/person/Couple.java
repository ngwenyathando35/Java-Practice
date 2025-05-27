package person;
import java.time.LocalDate;
import person.Person;
import person.Wedding;
/* Filename Couple.java
 * Written by Thando Ngwenya
 * Written on 27/04/2020
 * Description : This class contains two Person objects.*/
public class Couple 
{
    String nameOfPerson, surnameOfPerson;
    LocalDate birthDateOfPerson;
   
    Person person1 = new Person(nameOfPerson, surnameOfPerson, birthDateOfPerson);
    Person person2 = new Person(nameOfPerson, surnameOfPerson, birthDateOfPerson);
    public Couple(Person person1, Person person2){}
}