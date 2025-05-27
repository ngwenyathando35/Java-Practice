/* Filename Rock.java
 * Written by Thando Ngwenya
 * Written on 28/08/2020
 * Description : This is a class named Rock that acts as a superclass for rock samples collected and catalogued 
        by a natural history museum. The Rock class contains fields for a number of samples, a description of 
        the type of rock, and the weight of the rock in grams. It includes a constructor that accepts parameters
        for the sample number and weight. The Rock constructor sets the description value to Unclassified. It 
        includes get methods for each field. Works as intended
 */
package rock;
public class Rock 
{
    protected String description;
    private int numSamples;
    private double weight;
    public Rock(int numOfSamples, int mass)
    {
        description = "Unclassified";
        numSamples = numOfSamples;
        weight = mass;
    }
    public String getDescription()
    {
        return description;
    }
    public int getNumSamples()
    {
        return numSamples;
    }
    public double getWeight()
    {
        return weight;
    }
}