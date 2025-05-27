/* Filename BubbleSortDemo.java
 * Written by The Textbook page 445
 * Description : It is an algorithm that sorts user entered values (array values in this case) in ascending 
    order. It displays the values during each iteration of the outer sorting loop so that the user can see the
    values as they are repositioned in the array. The program does what it's intended to do                                                      */
package insertionsortdemo;
import java.util.Scanner;
public class InsertionSortDemo
{
    public static void main(String[] args) 
    {
        int[] someNums = new int[5];
        int comparisonsToMake = someNums.length - 1;
        Scanner keyboard = new Scanner(System.in);
        int a, b, temp;
        for(a = 0; a < someNums.length; ++a)
        {
            System.out.print("Enter number " + (a + 1) + " >> ");
            someNums[a] = keyboard.nextInt();
        }
        display(someNums, 0);
        a = 1;
        while(a < someNums.length)
        {
            temp = someNums[a];
            b = a - 1;
        while(b >= 0 && someNums[b] > temp)
        {
            someNums[b + 1] = someNums[b];
            --b;
        }
        someNums[b + 1] = temp;
        display(someNums, a);
        ++a;
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