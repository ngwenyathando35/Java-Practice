/*
 * Filename TestSandwichFilling.java
 * Written by Thando Ngwenya
 * Written on 19/04/2020
 * Description : This program instantiates three SandwichFilling objects with different values, and then 
                 displays all the data for each object
 */
package sandwichfilling;
public class TestSandwichFilling
{
    public static void main(String[] args) 
    {
        String filling;
        int calories;
        SandwichFilling data1 = new SandwichFilling("Egg and cheese", 5);
        SandwichFilling data2 = new SandwichFilling("Peanut butter", 8);
        SandwichFilling data3 = new SandwichFilling("Marmite jam", 12);
        filling = data1.getFilling();
        calories = data1.getCalories();
        display(filling, calories);
        filling =data2.getFilling();
        calories = data2.getCalories();
        display(filling, calories);
        filling = data3.getFilling();
        calories = data3.getCalories();
        display(filling, calories);
    }
    public static void display(String filling, int calories) 
    {
        System.out.println(filling + " has " + calories + " calories");
    }
}