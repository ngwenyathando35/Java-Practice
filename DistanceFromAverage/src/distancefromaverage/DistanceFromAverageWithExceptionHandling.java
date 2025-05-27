/* The program seems to have a IndexOutOfBounds error at line 51 and I can't seem to figure it out
 * Filename DistanceFromAverageWithExceptionHandling.java
 * Written by Thando Ngwenya
 * Written on 22/06/2020 
 * Modified on 08/1/2021 to include Exception Handling pg 659
 * Description : This program first prompts the user to enter a number that represents the array size. It then
        allows the user to enter any number of double values up to the previously entered number. The user can 
        enter 99999 to quit entering numbers. It displays an error message if the user quits without entering 
        any numbers; 
    otherwise, it displays each entered value and its distance from the average      */
package distancefromaverage;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DistanceFromAverageWithExceptionHandling
{
    public static void main(String[] args) 
    {
        double distanceFromAverage, number = 0, average;
        int count = 0, total = 0, arraySize = 0;
        final int QUIT = 99999;
        final int MAX = 20;
        double numbers[] = null;
        Scanner input = new Scanner(System.in);
        try
        {
            System.out.print("Please enter the size of the array we're about to create >> ");
            arraySize = input.nextInt();
            numbers = new double[arraySize];
        }
        catch(InputMismatchException error)
        {            
            System.out.println("Error! You entered the incorrect data"
                    + "\nThe program will terminate ");
        }
        catch(NegativeArraySizeException error)
        {            
            System.out.println("Error! You entered a negative number."
                    + "\nThe program will terminate ");
        }
        try
        {
            System.out.print("Enter " + arraySize + " numbers or " + QUIT + " to quit >> ");
            number = input.nextInt();
        }
        catch(Exception error)
        {
            System.out.println(error.getMessage() + "/nCall Thando for help");
        }
        while(number != QUIT)
        {
            numbers[count + 1] = number;
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
            System.out.println(". The number that was entered was: " + numbers[x] + 
                    "\nDistance from average          : " + distanceFromAverage + "\n");
        }
        if(count != 0)
            System.out.println("\nThe average is " + average);
        else
            System.out.println("No number(s) were entered.");
    }
}