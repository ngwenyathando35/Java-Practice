package chillitogo;
import java.util.Scanner;
/*
 * Filename ChilliToGo.java
 * Written by Thando Ngwenya
 * Written on 09/04/2020
 * Description : Something like abo ma till nyana so 
 */
public class ChilliToGo 
{
    public static void main(String[] args) 
    {
        int adultNum, kiddiesNum, ADULT_MEAL = 7, KIDDIES_MEAL = 4, grandProfit;
        double ADULT_COST = 4.35, KIDS_COST = 3.10, adultProfit, kidsProfit,
                adultMarkupPrice, adultCostPrice, kidsMarkupPrice, kidsCostPrice, total;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter quantity for adult meal");
        adultNum = input.nextInt();
        System.out.println("Enter quantity for a kiddies meal");
        kiddiesNum = input.nextInt();
        adultMarkupPrice = adultNum * ADULT_MEAL;
        kidsMarkupPrice = kiddiesNum * KIDDIES_MEAL;
        total = adultMarkupPrice + kidsMarkupPrice;
        System.out.println("Please pay R" + total);
        adultCostPrice = ADULT_COST * adultNum;
        kidsCostPrice = KIDS_COST * kiddiesNum;
        adultProfit = adultMarkupPrice - adultCostPrice; 
        kidsProfit = kidsMarkupPrice - kidsCostPrice; 
        grandProfit = (int) (adultProfit + kidsProfit);
        System.out.println("Cost to make adult order is R" + adultCostPrice);
        System.out.println("Cost to make kids order is R" + kidsCostPrice);
        System.out.println("The profits made from all orders is " + grandProfit);
    }
}