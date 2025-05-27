/*
 * Filename MetamorphicRock.java
 * Written by Thando Ngwenya
 * Written on 28/08/2020
 * Description : This is a child class named MetamorphicRock. It's constructor requires parameters for the sample 
        number and weight. The description field is assigned a value.
 */
package rock;
public class MetamorphicRock extends Rock
{
    public MetamorphicRock(int number, int weight)
    {
        super(number, weight);
        description = "Metamorphic Rock is a type of rock music that morphs into a sound that confuses the "
                + "listener in a pleasureable way that is excruciatingly unfathomable";
    }
}