/* Filename TwelveInts.java
 * Written by Thando Ngwenya
 * Written on 22/06/2020
 * Description : The application stores 12 integers in an array and then displays the integers from first to last,
    and also displays the integers from last to first.                           */
package twelveints;
public class TwelveInts 
{
    public static void main(String[] args) 
    {
        int[] array = new int[13];
        for(int x = 1; x < array.length; ++x)
        {    
            array[x] = x;
            System.out.print(array[x] + " ");
        }
        System.out.println();
        for(int x = (array.length); x > 0; --x)
            System.out.print(array[x] + " ");
    }
}