/* Filename CategoriseStrings2.java
 * Written by Thando Ngwenya
 * Written on 07/07/2020
 * Description : This application accepts up to 10 Strings, or fewer if the user enters a terminating value. It 
    divides the entered Strings into three lists—strings with no spaces, string with ont space or more than one
    space. After data entry is complete, it prompts the user to enter which type of String to display, if the
    user enters an invalid option, it display's all the strings. */
package categorizestrings2;
import java.util.Scanner;
public class CategorizeStrings2
{
    public static void main(String[] args) 
    {
        String[] strings = new String[10];
        String string;
        int count = 0, options; 
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
        System.out.println("Do you want to display\n "
                + "1. Strings with no spaces \n"
                + "2. Strings with no one space\n"
                + "3. Strings with more than one space");
        options = input.nextInt();
        switch (options) 
        {
            case 1:
                for(int x = 0; x < strings.length; ++x)
                {
                    if(strings[x].indexOf(' ') < 0)
                        System.out.println(strings[x]);
                }   break;
            case 2:
                for(int x = 0; x < strings.length; ++x)
                {
                    if(strings[x].length() > 0)
                        System.out.println(strings[x]);
                }   break;
            case 3:
                int c = 0;
                for(int x = 0; x < strings.length; x++)
                {
                    if(strings[x].indexOf(' ') < 0)
                        ++c;
                    if(c > 1)
                        System.out.println(strings[x]);
                }
                System.out.println("Invalid entry");
                break;
            default:
                for(int x = 0; x < strings.length; ++x)
                {
                    if(strings[x].indexOf(' ') < 0)
                        System.out.println(strings[x]);
                }
                for(int x = 0; x < strings.length; ++x)
                {
                    if(strings[x].length() > 0)
                        System.out.println(strings[x]);
                }
                c = 0;
                for(int x = 0; x < strings.length; x++)
                {
                    if(strings[x].indexOf(' ') < 0)
                        ++c;
                    if(c > 1)
                        System.out.println(strings[x]);
                }
        }
    }
}