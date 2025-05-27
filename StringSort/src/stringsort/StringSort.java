/* Filename String sort.java
 * Written by Thando Ngwenya
 * Written on 26/06/2020
 * Description : Creates an array, populates it, sorts it, and then displayed. The programme works as intended*/
package stringsort;
import java.util.Arrays;
public class StringSort 
{
    //public static void main(String[] args) 
    {
        String[] words = new String[20];
        populateArray(words);
    }
    private static void populateArray(String[] words) 
    {
        int arrayLength = words.length;
        int x = 20;
        for(int i = 0; i < arrayLength; i++)
        {
            words[i] ="Number: " + x;
            x--;
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