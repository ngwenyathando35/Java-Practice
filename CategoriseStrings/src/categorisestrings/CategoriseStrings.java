/* Filename CategoriseStrings.java
 * Written by Thando Ngwenya
 * Written on 07/07/2020
 * Description : This application accepts up to 10 Strings, or fewer if the user enters a terminating value. It 
    divides the entered Strings into two lists—one for short Strings that are 10 characters or fewer and the 
    other for long Strings. After data entry is complete, it prompts the user to enter which type of String to 
    display, and then outputs the correct list.  */
package categorisestrings;
import java.util.Scanner;
public class CategoriseStrings 
{
    public static void main(String[] args) 
    {
        String[] strings = new String[10];
        String string, answer;
        int count = 0;
        final String QUIT = "9999";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String or 9999 to quit");
        string = input.nextLine();
        while(!string.equalsIgnoreCase(QUIT))
        {
            if(count == strings.length)
                string = QUIT;
            else
            {
                strings[count] = string;
                System.out.println("Enter another string or 9999 to quit");
                string = input.nextLine();
            }
            ++count;
        }
        System.out.println("Do you want to display long or short strings");
        answer = input.nextLine();
        if(answer.equalsIgnoreCase("short"))
        {
            for(int x = 0; x < strings.length; ++x)
            {    
                if(strings[x].length() < 10) 
                    System.out.println(strings[x]);
            }
        }
        else 
            if(!answer.equalsIgnoreCase("short"))
        {
            for(int x = 0; x < strings.length; ++x)
            {    
                if(strings[x].length() > 10) 
                    System.out.println(strings[x]);
            }
        }
        else
            System.out.println("Invalid entry");
    }
}