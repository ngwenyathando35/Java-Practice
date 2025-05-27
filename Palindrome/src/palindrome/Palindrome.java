/* NB: It's not working
 * Filename Palindrome.java
 * Written by Thando Ngwenya
 * Written on 30/05/2020
 * Description : Checke if a string is a Palindrome
 */
package palindrome;
import java.util.Scanner;
public class Palindrome 
{
    public static void main(String[] args) 
    {
        String text, reverse = "";
        int length;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string to check if it's a palindrome");
        text = input.nextLine();
        length = text.length();
        for(int i = length - 1; i < 0; i--)
            reverse = reverse + text.charAt(i);
        if(text.equals(reverse))
            System.out.println("The string is a palindrome");
        else
            System.out.println("That is not a palindrome");
    }
}