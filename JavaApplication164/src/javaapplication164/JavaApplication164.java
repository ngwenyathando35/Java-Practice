/*
 * Filename .java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : 
 */

package javaapplication164;

public class JavaApplication164 
{
    public static void main(String[] args) 
    {
        
        for(int x = 32000,a = 30000,b = 30000, num = 1;x <  a + b;++x, ++num)
        {
                System.out.println(num + ") Hello");
            ++x;
            ++num;
        }
    }
}