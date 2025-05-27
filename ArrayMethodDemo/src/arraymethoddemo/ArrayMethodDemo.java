/* Filename ArrayMethodDemo.java
 * Written by Thando Ngwenya
 * Written on 30/06/2020
 * Description : This application contains an array that stores 10 integers. It calls five methods that in turn
   1. displays all the integers, 
   2. displays all the integers in reverse order, 
   3. displays the sum of the integers
   4. displays all values less than a limiting argument
   5. displays all values that are higher than the calculated average value.                                 */
package arraymethoddemo;
public class ArrayMethodDemo 
{
    public static void main(String[] args) 
    {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int limitingNum = 5;
        displayNumbers(numbers);
        displayReverseOrder(numbers);
        displaySumOfNumbers(numbers);
        displayLessThanLimitingNumber(numbers, limitingNum);
        displayHigherThanAverage(numbers);
    }
    private static void displayNumbers(int[] numbers) 
    {
        System.out.println("The display Numbers Methods*************************************");
        System.out.print("The array as is : ");
        for(int x = 0; x < numbers.length; ++x)
            System.out.print(numbers[x] + ", ");
        System.out.println("\n");
    }
    private static void displayReverseOrder(int[] numbers) 
    {
        System.out.println("The display Reverse Methods*************************************");
        System.out.print("The array in the reverse order : ");
        for(int x = (numbers.length) - 1; x >= 0; --x)
            System.out.print(numbers[x] + ", ");
        System.out.println("\n");
    }
    private static void displaySumOfNumbers(int[] numbers) 
    {
        System.out.println("The Sum of the Methods******************************************");
        int totalArray = 0;
        System.out.print("The sum of the array : ");
        for(int x = 0; x < (numbers.length) - 1; ++x)
            totalArray += numbers[x];
        System.out.print(totalArray);
        System.out.println("\n");
    }
    private static void displayLessThanLimitingNumber(int[] numbers, int limitingNum) 
    {
        System.out.println("The Display less than the Limiting Number Method****************");
        System.out.print("The array as : ");
        for(int x = 0; x < numbers.length; ++x)
            System.out.print(numbers[x] + ", ");
        System.out.println("\nThe limiting value is " + limitingNum);
        System.out.print("The array now : ");
        for(int x = 0; x <= limitingNum; ++x)
            System.out.print(numbers[x]);
        System.out.println("\n");
    }
    private static void displayHigherThanAverage(int[] numbers) 
    {
        System.out.println("The Display Higher Than The Average Method**********************");
        double average;
        int totalArray = 0, x = 0;
        System.out.print("The array as is : ");
        for(; x < numbers.length; ++x)
            System.out.print(numbers[x] + ", ");
        for(; x < numbers.length; ++x)
            totalArray = totalArray + numbers[x];
        average = (totalArray)/(numbers.length);
        System.out.println("\nThe average of the array : " + average);
        for(; x < numbers.length; ++x)
        {
            if(numbers[x] > average)
                System.out.print(numbers[x] + ", ");
        }
    }
}