/* Filename DistanceFromAverage.java
 * Written by Thando Ngwenya
 * Written on 22/06/2020
 * Description : This program allows a user to enter any number of double values up to 20. The user can enter 
    99999 to quit entering numbers. It displays an error message if the user quits without entering any numbers; 
    otherwise, it displays each entered value and its distance from the average      */
package distancefromaverage;
import java.util.Scanner;
public class DistanceFromAverage 
{
    //public static void main(String[] args) 
    {
        double[] numbers = new double[20];
        double distanceFromAverage, number, average;
        int count = 0, total = 0;
        final int QUIT = 99999;
        final int MAX = 20;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers " + QUIT + " to quit >> ");
        number = input.nextInt();
        while(number != QUIT)
        {
            numbers[count] = number;
            total += numbers[count];
            ++count;
            if(count == MAX)
                number = QUIT;
            else
            {
                System.out.print("Enter next number or " + QUIT + " to quit >> ");
                number = input.nextInt();
            }
        }
        average = (total * 1.0)/count;
        for(int x = 0; x < count; ++x)
        {
            distanceFromAverage = average - numbers[x];
            System.out.println("\nThe number that was entered was: " + numbers[x] + 
                    "\nDistance from average          : " + distanceFromAverage);
        }
        if(count != 0)
            System.out.println("\nThe average is " + average);
        else
            System.out.println("No number(s) were entered.");
    }
}