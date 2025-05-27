/*
 * Filename Participant.java
 * Written by Thando Ngwenya
 * Written on 17Sep2020
 * Description : This is a class that has fields for a name, age, and street address. It includes a constructor 
        that assigns parameter values to each field and a toString() method that returns a String containing all 
        the values. It also has an equals() method that determines if two Participants are equal if they have the
        same values in all three fields.
 */
package participant;
public class Participant 
{
    private static String name, address;
    private static int age;
    public Participant(String igama, String streetAddress, int age)
    {
        name = igama;
        address = streetAddress;
        Participant.age = age;
    }
    @Override
    public String toString()
    {
        return "Name >> " + name + "\nStreet address >> " + address + "\nAge >> " + age;
    }
    public boolean equals(Participant p2)
    {
        boolean result = false;
        if(name == Participant.name && address == Participant.address && age == Participant.age)
            result = true;
        return result;
    }
}