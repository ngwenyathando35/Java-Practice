/*
 * Filename SedimentaryRock.java
* Written by Thando Ngwenya
 * Written on 28/08/2020
 * Description : This is a child class named SedimentaryRock. It's constructor requires parameters for the sample 
        number and weight. The description field is assigned a value.
 */
package rock;
public class SedimentaryRock extends Rock
{
    public SedimentaryRock(int number, int weight)
    {
        super(number, weight);
        description = "Sedimentary Rock is a type of rock music that allows the beat to sediment your in ways you"
                + "will never untderstand because it is what it is";
    }
}