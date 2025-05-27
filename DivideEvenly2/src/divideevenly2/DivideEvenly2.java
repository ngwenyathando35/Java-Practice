/* Filename .java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : This program calculates what numbers divide evenly into 100 and which numbers go evenly into 
    every positive number, up to and including 100
 */
package divideevenly2;
public class DivideEvenly2 
{
    public static void main(String[] args) 
    {
        final int LIMIT = 100;
        int var, number;
        for(number = 1; number <= LIMIT; ++number)
        {
            System.out.print(number + " is evenly divisible by ");
            for(var = 1; var <= number; ++var)
                if(number % var == 0)
            System.out.print(var + " ");
            System.out.println();
        }
        System.out.println();
    }
}