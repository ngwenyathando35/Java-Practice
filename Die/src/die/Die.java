/* Filename Die.java
 * Written by Thando Ngwenya
 * Written on 20/04/2020
 * Description : It generate a random number between 1 and 6 and assigns it to a variable.                      */
package die;
public class Die 
{
    public int randomValue;
    public int getRandomValue()
    {
        return randomValue;
    }
    public static final int HIGHEST_DIE_VALUE = 6, LOWEST_DIE_VALUE = 1;
    public Die()
    {
        randomValue = (((int)(Math.random()*100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE));
    }
}