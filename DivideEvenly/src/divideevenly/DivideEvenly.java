/*
 * Filename DivideEvenly.java
 * Written by Thando Ngwenya
 * Written on 12/05/2020
 * Description : This program calculates what numbers divide evenly into 100
 */
package divideevenly;
public class DivideEvenly 
{
    public static void main(String[] args) 
    {
        final int LIMIT = 100;
        int var;
        System.out.print(LIMIT + " is evenly divisible by ");
        for(var = 1; var <= LIMIT; ++var)
            if(LIMIT % var == 0)
                System.out.print(var + " ");
        System.out.println();
    }
}