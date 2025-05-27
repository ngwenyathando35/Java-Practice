/* Filename BubbleSortDemo.java
 * Written by The Textbook page 445
 * Description : It is an algorithm that sorts user entered values (array values in this case) in ascending 
    order. It displays the values during each iteration of the outer sorting loop so that the user can see the
    values as they are repositioned in the array. The program works as intended */
package bubblesortdemo;
import java.util.Scanner;
public class BubbleSortDemo 
{
    public static void main(String[] args) 
    {
     /* Declare an array of five integers        */
        int[] someNums = new int[5];
     // This variable is to control the number of comparisons to make during the sort.
        int comparisonsToMake = someNums.length - 1;
        Scanner keyboard = new Scanner(System.in);
     /* The two integers are gonna be used as subscripts for handling the array, and a temp variable will be used
        during the sort.*/
        int a, b, temp;
        //The for loop promps the user for each element of the array and accepts them
        for(a = 0; a < someNums.length; ++a)
        {
            System.out.print("Enter number " + (a + 1) + " >> ");
            someNums[a] = keyboard.nextInt();
        }
        //The purpose of this method is to display the current status of the array as it is being sorted.
        display(someNums, 0);
        for(a = 0; a < someNums.length - 1; ++a)
        {
            for(b = 0; b < comparisonsToMake; ++b)
            {
                if(someNums[b] > someNums[b + 1])
                {
                    temp = someNums[b];
                    someNums[b] = someNums[b + 1];
                    someNums[b + 1] = temp;
                }
            }
            display(someNums, (a + 1));
            --comparisonsToMake;
        }
    }
    private static void display(int[] someNums, int a) 
    {
        System.out.print("Iteration " + a + ": ");
        for(int x = 0; x < someNums.length; ++x)
            System.out.print(someNums[x] + " ");
        System.out.println();
    }
}