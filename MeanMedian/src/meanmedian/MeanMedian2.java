/* Filename MeanMedian2.java
 * Written by Thando Ngwenya
 * Written on 26/07/2020
 * Description : This application allows a user to enter any number of integers up to 20 and displays the values, 
    their mean and their median.If the list has even number of values, the median is the numeric average of the 
    values in the two middle positions. The program works but the median is not correct       */
package meanmedian;
import java.util.Scanner;
import java.util.Arrays;
public class MeanMedian2
{
    private static int iterations = 0;
    private static int[] newValues;
    public static void main(String[] args) 
    {
        int[] values = new int[20];
        double mean = 0;
        int median = 0;
        populateArray(values);
        mean = calculateMean(values);
        median = calculateMedian(newValues);
        displayData(newValues, mean, median);
    }
    private static int[] populateArray(int[] values) 
    {
        Scanner input = new Scanner(System.in);
        int x = 0, count = 0;
        final int QUIT = 999;
        System.out.println("You can enter a maximum of twenty values");
        do
        {
            System.out.println("Enter value or " + QUIT + " to quit");
            values[x] = input.nextInt();
            if(values[x] == QUIT)
                count = 20;
            else
            {
                ++count;
                ++x;
                ++iterations;
            }
        }
        while(count < 20);
        System.out.println("The loop executed " + iterations + " times");
        return values;
    }
    private static double calculateMean(int[] values) 
    {
        double total = 0;
        double mean = 0;
        newValues = new int[iterations];
        for(int x = 0; x < newValues.length; ++x)
        {
            newValues[x] = values[x];
            total = total + newValues[x];
        }
        mean = total/newValues.length;
        return mean;
    }
    private static int calculateMedian(int[] values) 
    {
        System.out.println("The calculateMedian method has been called successfully");
        Arrays.sort(values);
        int arraySize = values.length, median = 0;
        int oddMedianPosition, median1, median2;
        double evenMedianPosition;
        if(isOddNumber(iterations))
        {    
            oddMedianPosition = arraySize/2;
            median1 = values[oddMedianPosition];
            median2 = values[oddMedianPosition + 1];
            median = (median1 + median2)/2;
        }
        else if(!isOddNumber(iterations))
        {
            evenMedianPosition = arraySize/2;
            median = (int) evenMedianPosition;
        }
        else
            median = 1;
        return median;
    }
    private static void displayData(int[] values, double mean, int median) 
    {
        System.out.print("The values are >> ");
        for(int x = 0; x < values.length; ++x)
        {
            System.out.print(values[x] + ", ");
        }
        System.out.println("\nThe mean is " + mean + " and the median is " + median);
    }
    private static boolean isOddNumber(int iterations) 
    {
        if(iterations%2 == 0)
            return false;
        else
            return true;
    }
}