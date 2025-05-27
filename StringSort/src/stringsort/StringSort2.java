/* Filename StringSort2.java
 * Written by Thando Ngwenya
 * Written on 26/06/2020
 * Description : Creates an array, accepts input of String values from the user, sorts them and then displays 
    them. The programe works as intended                                 */
package stringsort;
import java.util.Arrays;
import java.util.Scanner;
public class StringSort2
{
    public static void main(String[] args) 
    {
        String[] words = new String[20];
        populateArray(words);
    }
    private static void populateArray(String[] words) 
    {
        int arrayLength = words.length;
        int x = 20;
        String text;
        final String QUIT = "ZZZ";
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < arrayLength; i++)
        {
            System.out.println("Please enter a String or " + QUIT + " to quit");
            text = input.nextLine();
            if(text.equalsIgnoreCase(QUIT))
                break;
            else
                words[i] = text;
        }
        sortArray(words);
    }
    private static void sortArray(String[] words) 
    {
        Arrays.sort(words);
        displayArray(words);
    }
    private static void displayArray(String[] words) 
    {
        for(int x = 0; x < words.length; x++)
        {
            System.out.println("Array value one : " + words[x]);
        }
    }
}