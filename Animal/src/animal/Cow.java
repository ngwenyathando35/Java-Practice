/* Filename Cow.java
 * Written by the textbook pg 540
 * Written on 07Sep2020
 * Description : Demonstrating abstract classes. Works as intended */
package animal;
public class Cow extends Animal
{
    @Override
    public void speak()
    {
        System.out.println("Moo!");
    }
}