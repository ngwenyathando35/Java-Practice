/*
 * Filename Thando'sDistanceCalculator.java
 * Written by Thando Ngwenya
 * Written on 02/09/2020
 * Description : This application was developed for Thando's Courier Services. It calculates the cost of 
        delivering over a particular distance.
 */
package thando.sdistancecalculator;
import java.util.Scanner;
public class ThandoSDistanceCalculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        final int RATE_PER_KILOMETRE = 3;
        float RATE_PER_METRE = 0.003f;
        double distanceM, distanceKm, cost;
        int unit;
        System.out.println("Hi Welcome to Thando's Delivering Services"
                + "\nIn what unit will you be entering the distance? Select 1 for Metres or "
                + "any other number for kilometres >>");
        unit = input.nextInt();
        System.out.println("Please enter the distance");
        if(unit == 1)
        {
            distanceM = input.nextDouble();
            cost = calcMetres(RATE_PER_METRE, distanceM);
        }
        else
        {
            distanceKm = input.nextDouble();
            cost = calcKm(RATE_PER_KILOMETRE, distanceKm);
        }
        System.out.println("It will cost you R" + cost + " to use Thando");
    }
    private static double calcMetres(float RATE_PER_METRE, double distanceM) 
    {
        double a = distanceM * RATE_PER_METRE;
        return a;
    }
    private static double calcKm(int RATE_PER_KILOMETRE, double distanceKm) 
    {
        double a = distanceKm * RATE_PER_KILOMETRE;
        return a;
    }
}