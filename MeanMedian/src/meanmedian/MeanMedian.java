/* Filename MeanMedian.java
 * Written by Thando Ngwenya
 * Written on 26/07/2020
 * Description : The mean of a list of numbers is its arithmetic average. The median of a list is its middle 
    value when the values are placed in order. For example, if a list contains 1,4, 7, 8, and 10, then the mean 
    is 6 and the median is 7. This application allows a user to enter five integers and displays the values, 
    their mean and their median. The program works as intended*/
package meanmedian;
import java.util.Scanner;
import java.util.Arrays;
public class MeanMedian 
{
    //public static void main(String[] args) 
    {
        int[] values = new int[5];
        int arraySize = values.length;
        double mean = 0;
        int median = 0;
        populateArray(values);
        mean = calculateMean(values);
        median = calculateMedian(values);
        displayData(values, arraySize, mean, median);
    }
    private static int[] populateArray(int[] values) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("You are going to enter a maximum of five values");
        for(int x = 0; x < values.length; x++)
        {
            System.out.println("Enter value");
            values[x] = input.nextInt();
        }
        return values;
    }
    private static void displayData(int[] values, int arraySize, double mean, int median) 
    {
        System.out.println("The values are");
        for(int x = 0; x < arraySize; ++x)
        {
            System.out.print(values[x] + ", ");
        }
        System.out.println("\nThe mean is " + mean + " and the median is " + median);
    }
    private static double calculateMean(int[] values) 
    {
        double total = 0;
        double mean;
        for( int x = 0; x < values.length; ++x)
        {
            total = total + values[x];
        }
        mean = total/values.length;
        return mean;
    }
    private static int calculateMedian(int[] values) 
    {
        Arrays.sort(values);
        int median = values[2];
        return median;
    }
}