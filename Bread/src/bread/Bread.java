/*
 * Filename Bread.java
 * Written by Thando Ngwenya
 * Written on 19/04/2020
 * Description :  Default values are set for the fields, methods to retrieve values are made
 */
package bread;
public class Bread 
{
    private String breadType;
    private int caloriesPerSlice; 
    public static final String MOTTO = "Tip Top Bakery, the staff of life";
    public Bread(String breadType, int calory)
    {
        this.breadType = breadType;
        caloriesPerSlice = calory;
    }
    public String getBreadType()
    {
        return breadType;
    }
    public int getCalories()
    {
        return caloriesPerSlice;
    }
}