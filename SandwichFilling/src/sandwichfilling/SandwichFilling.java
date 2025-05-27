/*
 * Filename SandwichFilling.java
 * Written by Thando Ngwenya
 * Written on 19/04/2020
 * Description : A class that has two fields; fillingType and caloriesInAServing. It includes a constructor 
                 that takes parameters for each field. It also has get methods that return the values of the
                 fields. 
 */
package sandwichfilling;
public class SandwichFilling
{
    private String filling;
    private int caloriesInAServing;
    public SandwichFilling(String filling, int calory)
    {
        this.filling = filling;
        caloriesInAServing = calory;
    }
    public String getFilling()
    {
        return filling;
    }
    public int getCalories()
    {
        return caloriesInAServing;
    }
}