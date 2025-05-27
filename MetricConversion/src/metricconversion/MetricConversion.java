package metricconversion;
import java.util.Scanner;
/*
 * Filename MetricConversion.java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : Convert metric values to imperial
 */
public class MetricConversion 
{
    public static void main(String[] args) 
    {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        num = input.nextInt();
        calcGallonsToLitres(num);
        calcIncesToCm(num);
    }
    private static void calcGallonsToLitres(int num) 
    {
        double number;
        final double CM_TO_INCHES = 2.54;
        number = num * CM_TO_INCHES;
        System.out.println("The number in Inches is " + number + "'");
    }
    private static void calcIncesToCm(int num) 
    {
        double number ;
        final double GALLONS_TO_LITRES = 3.7584;
        number = num * GALLONS_TO_LITRES;
        System.out.println("The number in litres is " + number + "l");        
    }
}