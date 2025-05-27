/* Filename Dog.java
 * Written by Thando Ngwenya
 * Written on 07Sep2020
 * Description : Demonstrating Abstract classes. This class subclass is create to inherited Animal member just so
        to override its methods. Works as intended*/
package animal;
public class Dog extends Animal
{
    @Override
    public void speak()
    {
        System.out.println("Woof!");
    }
}