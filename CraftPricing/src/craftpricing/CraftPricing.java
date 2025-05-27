package craftpricing;
import java.util.Scanner;
/*
 * Filename CraftPricing.java
 * Written by Thando Ngwenya
 * Written on 10/04/2020
 * Description : 
 */
public class CraftPricing 
{
    public static void main(String[] args) 
    {
        String product; 
        int costOfMaterials, numHours, price;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product");
        product = input.nextLine();
        System.out.println("Enter the cost of materials");
        costOfMaterials = input.nextInt();
        System.out.println("Enter the the number of hours worked");
        numHours = input.nextInt();
        price = calcPrice(costOfMaterials, numHours);
        System.out.println("The Retail Price is >> R" + price);
    }
    private static int calcPrice(int costOfMaterials, int numHours) 
    {
        int price;
        //Price = cost of materials plus R12 multiplied by the number of hours required
        //to make the product plus R7 for shipping
        price = (((costOfMaterials + 12)*numHours) + 7);
        return price;
    }
}