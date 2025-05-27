/* Filename AnimalReference.java
 * Written by The textbook
 * Written on 07Sep2020
 * Description : Abstract classes. Demonstrating Dynamic Method Binding - is an application’s ability to select 
        the correct subclass method depending on the argument type. Works as intended*/
package animal;
public class AnimalReference
{
//    public static void main(String[] args)
    {
        Animal animalRef;
        animalRef = new Cow();
        animalRef.speak();
        animalRef = new Dog();
        animalRef.speak();
    }
}