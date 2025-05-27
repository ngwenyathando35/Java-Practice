/* Filename Alphabetise.java
 * Written by Thando Ngwenya
 * Written on 26/05/2020
 * Description : This application accepts three Strings from the user and displays one of two messages depending 
    on whether the user entered the Strings in alphabetical order without regard to case.  
    Character Strings and the StringBuilder pg 386 */ 
package alphabetise;
import java.util.Scanner;
public class Alphabetise 
{
    //public static void main(String[] args) 
    {
        char a, b, c;
        String d,e,f;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first String");
        d = input.nextLine();
        a = d.charAt(0);
        System.out.println("Please enter your second String");
        e = input.nextLine();
        b = e.charAt(0);
        System.out.println("Please enter your third String");
        f = input.nextLine();
        c = f.charAt(0);
        if(a < b)
        {
            System.out.println("b is greater than a");
            if(b < c)
            {
                System.out.println("c is greater than a and b");
            }
            else
                System.out.println("b is greater than c");
        }
        else 
        if(b < a)
        {
            System.out.println("a is greater than b");
            if(a < c)
            {
                System.out.println("c is greater than a and b");
            }
            else
                System.out.println("a is greater than c");
        }
        else
        if(c < a)
        {
            System.out.println("c is greater than a");
            if(a < b)
            {
                System.out.println("b is greater than a and b");
            }
            else
                System.out.println("a is greater than c");
        }
    }
}