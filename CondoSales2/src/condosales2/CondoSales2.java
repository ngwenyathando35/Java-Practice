/* Filename CondoSales.java
 * Written by Thando Ngwenya
 * Written on 29/04/2020
 * Description : The program determines the price of a condominium. It then asks the user to choose 1 for park 
    view, 2 for golf course view, or 3 for lake view. The output is the name of the chosen view as well as the 
    price of the condo. If the user enters an invalid code, the displayed price is 0 
 */
package condosales2;
import java.util.Scanner;
public class CondoSales2 
{
    public static void main(String[] args) 
    {
        long price, priceWithGarage; 
        int garage, viewSelection; 
        final int PARK_VIEW = 1;
        final int GOLF_COURSE_VIEW = 2;
        final int LAKE_VIEW = 3;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose 1 for Park View\n" +
                "       2 for Golf Course View\n" +
                "       3 for Lake View");
        Scanner keyboard = new Scanner(System.in);
        viewSelection = input.nextInt();
        if(viewSelection > 0)
        {
            System.out.println("Do you want garage?\n Enter 1 for yes and 2 for now");
            garage = keyboard.nextInt();
            if (1 == garage)
            {
                switch (viewSelection)
                {
                    case(PARK_VIEW):
                        price = 150000;
                        priceWithGarage = price + 5000;
                        System.out.println("Park View costs R" + priceWithGarage);
                        break;
                    case(GOLF_COURSE_VIEW):
                        price = 170000;
                        priceWithGarage = price + 5000;
                        System.out.println("Golf Course View costs R" + priceWithGarage);
                        break;
                    case(LAKE_VIEW):
                        price = 210000;
                        priceWithGarage = price + 5000;
                        System.out.println("Lake View costs R" + priceWithGarage);
                        break;
                }
            }
            else
            {
                switch (viewSelection)
                {
                    case(PARK_VIEW):
                        price = 150000;
                        System.out.println("Park View costs R" + price);
                        break;
                    case(GOLF_COURSE_VIEW):
                        price = 170000;
                        System.out.println("Golf Course View costs R" + price);
                        break;
                    case(LAKE_VIEW):
                        price = 210000;
                        System.out.println("Lake View costs R" + price);
                        break;
                }
            }
        }
        else 
            System.out.println("Invalid Option");
    }
}