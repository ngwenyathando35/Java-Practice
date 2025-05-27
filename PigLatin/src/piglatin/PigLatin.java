 /* Filename PigLatin.java
 * Written by Thando Ngwenya
 * Written on 28/05/2020
 * Description : This application accepts a word from a user and converts it to Pig Latin. If a word starts with a consonant, the Pig Latin version 
        removes all consonants from the beginning of the word and places them at the end, followed by ay. If a word starts with a vowel, the Pig Latin 
        version is the original word with ay added to the end. If y is the first letter in a word, it is treated as a consonant; otherwise, it is treated
        as a vowel.*/
package piglatin;
import java.util.Scanner;
public class PigLatin 
{
    public static void main(String[] args) 
    {
        String wrd;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word");
        wrd = input.nextLine();
        StringBuilder word = new StringBuilder(wrd);
        consonantBegin(word);
        System.out.println(word);
    }
    private static StringBuilder consonantBegin(StringBuilder word) 
    {
        char frstLetter = word.charAt(0);
        char a = 'a', e = 'e', i = 'i', o ='o', u = 'u';
        if(frstLetter != a && frstLetter != e && frstLetter != i && frstLetter != o && frstLetter != u)
        {
            word.setCharAt(0,' ');
            word.append(frstLetter);
            word.append("ay");
        }
        else
            word.append("ay");
        return word;
    }
}