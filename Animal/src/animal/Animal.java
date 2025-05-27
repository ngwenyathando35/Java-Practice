/* Filename Animal.java
 * Written by Java Programming 2018 pg 572
 * Written on 07Sep2020
 * Description : Demonstrating abstract classes
        The purpose of this class to create a generic class named Animal so it can provide generic data fields,
        such as the animal’s name, only once. An Animal is generic, but all specific Animals make a sound; the 
        actual sound differs from Animal to Animal. An empty speak() method is create so that it can be be used
        approprietly by  all future Animal subclasses and it's gonna be a requirement to code a speak() method 
        that is specific to the subclass. Works as intended. */
package animal;
public abstract class Animal
{
    private String name;
    public abstract void speak();
    public String getName()
    {
       return name;
    }
    public void setName(String animalName)
    {
    name = animalName;
    }
}