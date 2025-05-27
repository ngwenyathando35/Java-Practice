package nauticalmiles;
import java.util.Scanner;
/*
 * Filename NauticalMiles.java
 * Written by Thando Ngwenya
 * Written on 08/04/2020
 * Description : Program that converts miles to kilometetres 
 */
public class NauticalMiles 
{
    public static void main(String[] args) 
    {
        double kilometers, miles;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles to be converted to kilometers");
        miles = input.nextDouble();
        kilometers = miles / 1.6;
        System.out.println("Your answer in miles is " + miles);
        //I didnt finish coding this program
    }
    
}
