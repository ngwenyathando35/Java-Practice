/* Filename ArraysDemo.java
 * Written by Java Programming
 * Description : The application demonstrates how to use some of the methods in the Arrays class. The myScores 
    array is created to hold five integers. Then, a message and the array reference are passed to a display() 
    method. The first line of the output will show that the original array is filled with 0s at creation. After
    the first display, the Arrays.fill() method is called Because the arguments are the name of the array and 
    the number 8, when the array is displayed the second time the output will display 8s. Two of the array 
    elements are changed to 6 and 3, and the array is displayed again. The Arrays.sort() method is called. The 
    output will show that when the display() method executes the fourth time, the array elements have been 
    sorted in ascending order. The application works as intended                 */
package arraysdemo;
import java.util.Arrays;
import java.util.Collections;
public class ArraysDemo 
{
    public static void main(String[] args) 
    {
        int[] myScores = new int [5];
        display("Original array: ", myScores);
        Arrays.fill(myScores, 8);
        display("After filling with 8s: ", myScores);
        myScores[2] = 6;
        myScores[4] = 3;
        display("After changing two values: ", myScores);
        Arrays.sort(myScores);
        display("After sorting: ", myScores);
    }
    public static void display(String message, int array[])
    {
        int sz = array.length;
        System.out.print(message);
        for(int x = 0; x < sz; ++x)
            System.out.print(array[x] + " ");
        System.out.println();
    }
}