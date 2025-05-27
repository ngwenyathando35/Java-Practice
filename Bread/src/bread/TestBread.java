/*
 * Filename TestBread.java
 * Written by Thando Ngwenya
 * Written on 19/04/2020
 * Description : This program instantiates three Bread objects with different values, and then displays all 
                 the data, including the motto
 */
package bread;
public class TestBread 
{
    public static void main(String[] args) 
    {
        String breadType;
        int calories;
        Bread data1 = new Bread("Whole wheat", 5);
        Bread data2 = new Bread("White bread", 8);
        Bread data3 = new Bread("Brown bread", 12);
        breadType = data1.getBreadType();
        calories = data1.getCalories();
        display(breadType, calories);
        breadType =data2.getBreadType();
        calories = data2.getCalories();
        display(breadType, calories);
        breadType = data3.getBreadType();
        calories = data3.getCalories();
        display(breadType, calories);
        System.out.println(Bread.MOTTO);
    }
    public static void display(String breadType, int calories) 
    {
        System.out.println(breadType + " has " + calories + " calories");
    }
}