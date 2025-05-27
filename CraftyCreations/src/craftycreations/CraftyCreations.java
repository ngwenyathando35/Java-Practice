/*
 * Filename CraftyCreations.java
 * Written by Thando The Enigma
 * Written on 08/07/2018
 */
package craftycreations;
import java.util.Scanner;
public class CraftyCreations 
{
    public static void main(String[] args) 
    {
        double price;
        double costOfMaterials;
        int hoursWorked;
        int SHIPPING_COSTS = 7;
        String nameOfProduct;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the product");
        nameOfProduct = input.nextLine();
        System.out.println("Please enter the cost of materials");
        costOfMaterials = input.nextDouble();
        System.out.println("Please enter the number of hours worked");
        hoursWorked = input.nextInt();
        price = calcRetailPrice(costOfMaterials, hoursWorked, SHIPPING_COSTS);
        System.out.println("The product "+ nameOfProduct + "costs R" + price);
    }

    public static double calcRetailPrice(double costOfMaterials, int hoursWorked, int SHIPPING_COSTS) 
    {
        double price;
        price = ((costOfMaterials + 12)* hoursWorked+ SHIPPING_COSTS);
        return price;
    }
}