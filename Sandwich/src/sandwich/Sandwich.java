package sandwich;
/*
 * Filename Sandwich.java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : This class has a Bread field and a SandwichFilling field. It includes a constructor that takes 
                 parameters for each field needed in the two objects and assigns them to each object’s 
                 constructors
 */
public class Sandwich 
{
    private String mainIngredient, breadType;
    private double calories;
    public void setBreadType(String bt)
    {
        breadType = bt;
    }
    public void setIngredient(String i)
    {
        mainIngredient = i;
    }
    public void setCalories(double p)
    {
        calories = p;
    }
    public String getBreadType()
    {
        return breadType;
    }
    public String getIngredient()
    {
        return mainIngredient;
    }
    public double getCalories()
    {
        return calories;
    }
}