package sandwich;
import java.util.Scanner;
/*
 * Filename TestSandwich.java
 * Written by Thando Ngwenya
 * Written on 10/04/2020
 * Description : This program instantiate three Sandwich objects with different values, and then displays 
                 all the data for each object, including the total calories in a Sandwich, assuming that each 
                 Sandwich is made using two slices of Bread  
 */
public class TestSandwich 
{
    public static void main(String[] args)
    {
        String breadType, ingredient;
        double calories;
        Sandwich sandwich1 = new Sandwich();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter type of bread");
        breadType = input.nextLine();
        System.out.println("Please enter the main ingredient");
        ingredient = input.nextLine();
        System.out.println("Please enter the the number of calories");
        calories = input.nextDouble();
        sandwich1.setBreadType(breadType);
        sandwich1.setIngredient(ingredient);
        sandwich1.setCalories(calories);
        System.out.print("Sandwich Details:\n"
                + "Bread type >> " + sandwich1.getBreadType() +
                "\nMain ingredient >> " + sandwich1.getIngredient() +
                "\nCalories >> " + sandwich1.getCalories());
    }
}