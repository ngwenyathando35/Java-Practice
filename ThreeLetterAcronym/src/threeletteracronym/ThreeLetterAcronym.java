/* Filename ThreeLetterAcronym.java
 * Written by Thando Ngwenya
 * Written on 26/05/2020
 * Description : This program allows a user to enter three words, and displays the appropriate three-letter 
    acronym in all uppercase letters.  */
package threeletteracronym;
import java.util.Scanner;
public class ThreeLetterAcronym 
{
    public static void main(String[] args) 
    {
        String threeWords;
        char a;
        Scanner input = new Scanner(System.in);
        System.out.println("All the words you're about to enter must not exceed three words\n"
                + "Please enter your first string");
        threeWords = input.nextLine();
        a = threeWords.charAt(0);
        System.out.print(a);
        int stringLength = threeWords.length();
        for(int i = 0; i != stringLength; i++)
        {
            if(threeWords.charAt(i) == ' ')
            {  
                display(threeWords.charAt(i + 1));
            }
        }
    }
    private static void display(char charAt) 
    {
        char b = Character.toUpperCase(charAt);
        System.out.print(b);
    }
}