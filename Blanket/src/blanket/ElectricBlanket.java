/* NoClassDefinition error
 * Filename ElectricBlanket.java
 * Written by Thando Ngwenya
 * Written on 15Sep2020
 * Description : This is a child class that extends Blanket and includes two additional fields: one for the 
        number of heat settings and one for whether the electric blanket has an automatic shutoff feature. 
        Default values are one heat setting and no automatic shutoff. It has get and set methods for the fields. 
        It doesn't allow the number of settings to be fewer than one or more than five; if it is, it uses the 
        default setting of 1. It adds a R100.75 premium to the price if the blanket has the automatic shutoff 
        feature. It also has a toString() method that calls the parent class toString() method and combines
        the returned value with data about the new fields to return a complete description of features.
 */
package blanket;
public class ElectricBlanket extends Blanket
{
    private boolean hasOffFeature = false;
    private int numHeatSettings = 1;
    public void setFeatures(boolean shutOffFeature)
    {
        hasOffFeature = shutOffFeature;
    }
    public void setNumHeatSetting(int numberOfHeatSettings)
    {
        if(numberOfHeatSettings < 1 || numberOfHeatSettings > 5)
            numberOfHeatSettings = 1;
        else
            numHeatSettings = numberOfHeatSettings;
    }
    public int getHeatSettings()
    {
        return numHeatSettings;
    }
    public boolean getFeatures()
    {
        return hasOffFeature;
    }
    public String toString(String numHeatSetting, boolean hasOffFeature)
    {
        String offFeature;
        if(hasOffFeature)
            offFeature = "Yes it does";
        else
            offFeature = "No it doesn't";
        String description = "\nThis blanket has a heat feature. Does it have a shut off heat feature?"
                + offFeature + ".\nThe feature has " + numHeatSettings + " option(s)";
        return toString() + description;
    }
}