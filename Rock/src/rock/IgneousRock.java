/*
 * Filename IgneousRock.java
 * Written by Thando Ngwenya
 * Written on 28/08/2020
 * Description : This is a child class named IgneousRock. It's constructor requires parameters for the sample 
        number and weight. The description field is assigned a value.
 */
package rock;
public class IgneousRock extends Rock
{
    public IgneousRock(int number, int weight)
    {
        super(number, weight);
        description = "Igneous Rock is a type of rock music that allows the beat to ignite a spark in the sound"
                + "that coerces you to enjoy the music";
    }
}