package percentages;
import java.util.Scanner;
/*
 * Filename Percentages.java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : This program was displays two values. The value of the first number 
                 is expressed as a percentage of the second number
 */
public class Percentages 
{
    public static void main(String[] args) 
    {
        double var1, var2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        var1 = input.nextInt();
        System.out.println("Enter second number");
        var2 = input.nextInt();
        computePercent(var1,var2);
    }
    private static void computePercent(double a, double b) 
    {
        double var1 = a, var2 = b, percentage = ((a / b) * 100);
        System.out.println("The value " + var1 + " is " + percentage + "% of the"
                + " value " + var2);
    }
}