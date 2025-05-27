/* Filename Alphabetise.java
 * Written by Thando Ngwenya
 * Written on 26/05/2020
 * Description : This application accepts three Strings from the user and displays one of two messages depending 
    on whether the user entered the Strings in alphabetical order without regard to case.  */
package alphabetise;
import java.util.Scanner;
public class Alphabetise2
{
    public static void main(String[] args) 
    {
        String a, b, c;
        char d,e,f;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first String");
        a = input.nextLine();
        d = a.charAt(0);
        System.out.println("Please enter your second String");
        b = input.nextLine();
        e = b.charAt(0);
        System.out.println("Please enter your third String");
        c = input.nextLine();
        f = c.charAt(0);
        if(d < e)
            if(e < f)
                System.out.println("The strings were entered in alphabetical order");
            else
                System.out.println("The second and thirrd strings were entered in alphabetical order");
        else
            System.out.println("No string were entered in alphabetical order");    
        while(d < e && e < f)
        {
            //I have to do some coding to sort the characters in alphabetical order;
        }
    }
}