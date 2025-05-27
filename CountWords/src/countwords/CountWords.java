/* The program works but it doesnt yet know how to differentiate between words
 * Filename CountWords.java
 * Written by Thando Ngwenya
 * Written on 26/05/2020
 * Description : It counts the number from a string entered by a user; */
package countwords;
import java.util.Scanner;
public class CountWords 
{
    public static void main(String[] args) 
    {
        String sentence;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        sentence = input.nextLine();
        int lineLength = sentence.length(), countSpace = 0;
        for(int i = 0; i < lineLength; i++)
        {
            if(sentence.charAt(i) == ' ')
            {
                ++countSpace;
                System.out.println("Space");
            }
            if(sentence.charAt(i) == '.')
            {
                ++countSpace;
                System.out.println("Fullstop");
            }
            if(sentence.charAt(i) == ',')
            {
                ++countSpace;
                System.out.println("Comma");
            }
            if(sentence.charAt(i) == ';')
            {
                ++countSpace;
                System.out.println("Semi-colon");
            }
            if(sentence.charAt(i) == ':')
            {
                ++countSpace;
                System.out.println("colon");

            }
            if(sentence.charAt(i) == '?')
            {
                ++countSpace;
                System.out.println("Question Mark");
            }
            if(sentence.charAt(i) == '-')
            {
                ++countSpace;
                System.out.println("Dash");
            }
            if(sentence.charAt(i) == '_')
            {
                ++countSpace;
                System.out.println("Underscore");
            }
            if(sentence.charAt(i) == '!')
            {
                ++countSpace;
                System.out.println("Exclaimation Mark");
            }
        }
        System.out.println("There are " + countSpace + " words");
    }
}