/* Filename AscendingAndDescending.java
 * Written by Thando Ngwenya
 * Written on 29/04/2020
 * Description : It sorts integers entered by the user in Ascending order  */
package ascendinganddescending;
import java.util.Scanner;
public class AscendingAndDescending 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value");
        int val1 = input.nextInt();
        System.out.println("Enter second value");
        int val2 = input.nextInt();
        System.out.println("Enter third value");
        int val3 = input.nextInt();
        int low, middle, high;
        if(val1 > val2 && val1 > val3)
        { 
            high = val1;
            if(val2 > val3)
            {    
                middle = val2;
                low = val3;
            }
            else
            {    
                middle = val3;
                low = val2;
            }
            System.out.println(low + " " + middle + " " + high);
        } 
        else if(val2 > val1 && val2 > val3)
        { 
            high = val2;
            if(val1 > val3)
            {   middle = val1;
                low = val3;
            }
            else
            {
                middle = val3;
                low = val1;
            }
        System.out.println(low + " " + middle + " " + high);
        }
        else if(val3 > val1 && val3 > val2)
        { 
            high = val3;
            if(val2 > val1)
            {
               middle = val2;
               low = val1;
            }
            else
            {    
                middle = val1;
                low = val2;
            }
        System.out.println(low + " " + middle + " " + high);
        }
    }
}